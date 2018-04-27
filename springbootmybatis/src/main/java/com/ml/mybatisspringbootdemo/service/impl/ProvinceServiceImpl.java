package com.ml.mybatisspringbootdemo.service.impl;

import com.ml.mybatisspringbootdemo.controller.params.ProvinceParam;
import com.ml.mybatisspringbootdemo.mapper.ProvinceMapper;
import com.ml.mybatisspringbootdemo.mapper.custom.ProvinceCustomMapper;
import com.ml.mybatisspringbootdemo.model.domain.Province;
import com.ml.mybatisspringbootdemo.service.ProvinceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Marcus Li
 * @date 2018/4/26
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceMapper provinceMapper;
    @Autowired
    private ProvinceCustomMapper provinceCustomMapper;

    @Override
    public Province getById(Integer id) {
        return provinceMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Province> queryProvinceListWithPage(ProvinceParam param) {
        Province province = Province.builder().build();
        BeanUtils.copyProperties(param, province);
        return provinceCustomMapper.queryProvinceListWithPage(province);
    }

    @Override
    public int createProvince(Province province) {
        return provinceMapper.insert(province);
    }
}
