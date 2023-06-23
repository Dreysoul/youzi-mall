package com.youzi.service;

import com.youzi.pojo.Guanggao;
import com.youzi.pojo.GuanggaoType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;
import youzi.com.utils.DataResults;
import youzi.com.utils.PageUtils;

import java.util.List;
//广告类
@RequestMapping("ads")
@Api(tags = "广告API", description = "提供广告信息相关的RestAPI")
@ApiResponses({
        @ApiResponse(code = 200, message = "请求成功"),
        @ApiResponse(code = 500, message = "服务器内部错误"),
        @ApiResponse(code = 404, message = "请求的资源找不到"),
        @ApiResponse(code = 405, message = "请求方式不支持"),
        @ApiResponse(code = 403, message = "请求被拒绝"),
        @ApiResponse(code = 401, message = "没有权限访问")
})
//@CrossOrigin(origins = "http://localhost:8081")//配置的跨域请求
public interface AdvertisementService {
    @GetMapping("guanggaolist")
    @ApiOperation(value = "查询广告集合", notes = "查询广告集合")
    DataResults<List<Guanggao>> Guangaolist();

    @GetMapping("listById/{id}")
    @ApiOperation(value = "根据id查广告", notes = "根据id查广告")
    DataResults<List<Guanggao>> listByID(@PathVariable("id")String id);


    @PostMapping("page")
    @ApiOperation(value = "广告分页",notes = "广告分页")
    DataResults<PageUtils<Guanggao>> queryPage(@RequestBody Guanggao guanggao);
}

