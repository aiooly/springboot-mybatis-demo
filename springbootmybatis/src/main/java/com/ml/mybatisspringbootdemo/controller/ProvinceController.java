package com.ml.mybatisspringbootdemo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ml.mybatisspringbootdemo.controller.params.ProvinceParam;
import com.ml.mybatisspringbootdemo.model.domain.Province;
import com.ml.mybatisspringbootdemo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Marcus Li
 * @date 2018/4/26
 */
@RestController
@RequestMapping("/provinces")
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @GetMapping
    public PageInfo getProvinceList(ProvinceParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<Province> provinceList = provinceService.queryProvinceListWithPage(param);
        return new PageInfo<>(provinceList);
    }

    @GetMapping("/{id}")
    public Province getProvinceById(@PathVariable("id") Integer id) {
        return provinceService.getById(id);
    }
}
