package com.youzi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.youzi.mapper.GuanggaoMapper;
import com.youzi.mapper.GuanggaoTypeMapper;
import com.youzi.pojo.Guanggao;
import com.youzi.pojo.GuanggaoType;
import com.youzi.service.AdvertisementService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RestController;
import youzi.com.utils.DataResults;
import youzi.com.utils.PageUtils;
import youzi.com.utils.ResultCode;

import javax.annotation.Resource;
import java.util.List;
@RestController
public class AdverServiceImpl implements AdvertisementService {
    @Resource
    GuanggaoMapper guanggaoMapper;
    @Resource
    GuanggaoTypeMapper guanggaoTypeMapper;

    @Override
    public DataResults<List<Guanggao>> Guangaolist() {
//        int i=1;
//        i= i/0;
        return DataResults.success(ResultCode.SUCCESS,
                guanggaoMapper.selectList(
                        new QueryWrapper<Guanggao>().eq("del", 0)));
    }

    @Override
    public DataResults<List<Guanggao>> listByID(String id) {
        return DataResults.success(ResultCode.SUCCESS,guanggaoMapper.selectById(id));
    }

    @Override
    public DataResults<PageUtils<Guanggao>> queryPage(Guanggao guanggao) {
        QueryWrapper<Guanggao> qw=new QueryWrapper<Guanggao>();
        qw.eq("del", 0);
        if (StringUtils.isEmpty(guanggao.getTitle())) {
//            非模糊查询
            qw.like("title",guanggao.getTitle());
        } else {
//            title不为空，进行模糊查询
            qw.like("title", "%" + guanggao.getTitle() + "%");
        }
//        qw.eq("del",0);
//        qw.like(StringUtils.isEmpty(guanggao.getTitle()),"title",guanggao.getTitle());
        IPage<Guanggao> guanggaoIPage = guanggaoMapper.selectPage(new Page<Guanggao>(guanggao.getPage(), guanggao.getLimit()), qw);

        List<Guanggao> records=guanggaoIPage.getRecords();
        for (Guanggao record:records){
            Integer GuanggaoId=record.getGuanggaoId();
            GuanggaoType guanggaoType = guanggaoTypeMapper.selectById(GuanggaoId);
            record.setGuanggaoType(guanggaoType);
        }

        return DataResults.success(ResultCode.SUCCESS,
                new PageUtils<Guanggao>(guanggao.getPage(),guanggao.getLimit(),
                        guanggaoIPage.getPages(),guanggaoIPage.getTotal(),records));
    }


}
