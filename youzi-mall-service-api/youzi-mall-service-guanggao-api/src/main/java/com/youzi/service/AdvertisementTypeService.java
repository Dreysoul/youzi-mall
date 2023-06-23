package com.youzi.service;

import com.youzi.pojo.Guanggao;
import com.youzi.pojo.GuanggaoType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import youzi.com.utils.DataResults;

import java.util.List;
//广告类型类
@RequestMapping("adstype-api")
@Api(tags = "广告类别API", description = "提供广告类别信息相关的RestAPI")
@ApiResponses({
        @ApiResponse(code = 200, message = "请求成功"),
        @ApiResponse(code = 500, message = "服务器内部错误"),
        @ApiResponse(code = 404, message = "请求的资源找不到"),
        @ApiResponse(code = 405, message = "请求方式不支持"),
        @ApiResponse(code = 403, message = "请求被拒绝"),
        @ApiResponse(code = 401, message = "没有权限访问")
})
public interface AdvertisementTypeService {
    @GetMapping("list")
    @ApiOperation(value = "查询广告类别集合", notes = "查询广告类别集合")
    DataResults<List<GuanggaoType>> list();

    @GetMapping("listById/{id}")
    @ApiOperation(value = "根据id查广告类别", notes = "根据id查广告类别")
    DataResults<List<GuanggaoType>> listByID(@PathVariable("id")String id);
}

