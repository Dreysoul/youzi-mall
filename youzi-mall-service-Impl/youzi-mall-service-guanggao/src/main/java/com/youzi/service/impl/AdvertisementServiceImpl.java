package com.youzi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.youzi.mapper.GuanggaoMapper;
import com.youzi.mapper.GuanggaoTypeMapper;
import com.youzi.pojo.Guanggao;
import com.youzi.pojo.GuanggaoType;
import com.youzi.service.AdvertisementTypeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import youzi.com.utils.DataResults;
import youzi.com.utils.ResultCode;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AdvertisementServiceImpl implements AdvertisementTypeService {
    @Resource
    GuanggaoTypeMapper guanggaoTypeMapper;

    @Override
    public DataResults<List<GuanggaoType>> list() {
        return DataResults.success(ResultCode.SUCCESS,
                guanggaoTypeMapper.selectList(
                        new QueryWrapper<GuanggaoType>().eq("del", 1)));
    }

    @Override
    public DataResults<List<GuanggaoType>> listByID(@PathVariable("id")String id) {
        return DataResults.success(ResultCode.SUCCESS,guanggaoTypeMapper.selectById(id));
    }

}
