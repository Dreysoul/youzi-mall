package com.youzi.controller;

import com.youzi.client.GuanggaoServiceClient;
import com.youzi.pojo.Guanggao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import youzi.com.utils.DataResults;
import youzi.com.utils.PageUtils;
import youzi.com.utils.ResultCode;

@Controller //标注控制类，用于处理用户请求并返回响应
public class GuanggaoController {

    @Autowired
    GuanggaoServiceClient guanggaoServiceClient;

    @GetMapping("toads")
    public String toAdvertisementsManagerHtml(Guanggao guanggao, Model model) {
        guanggao.setTitle("");
        DataResults<PageUtils<Guanggao>> dataResults = guanggaoServiceClient.queryPage(guanggao);
        System.out.println("初始数据"+dataResults.getData());
        model.addAttribute("results", dataResults.getData());
        return "advertisements-manager";
    }

    @ResponseBody //返回数据而不是解析为视图
    @GetMapping("ads/page/{page}/{limit}")
    public DataResults queryPage(@PathVariable("page") Long page,
                            @PathVariable("limit") Long limit,
                            @RequestParam(defaultValue = "") String title) {
        System.out.println("获取的title"+title);
        Guanggao guanggao=new Guanggao();
        guanggao.setTitle(title);
        guanggao.setPage(page);
        guanggao.setLimit(limit);
        DataResults<PageUtils<Guanggao>> dataResults = guanggaoServiceClient.queryPage(guanggao);
        System.out.println("分页数据："+dataResults.getData());
        DataResults success = DataResults.success(ResultCode.SUCCESS,dataResults.getData());
        return success;
    }
}
