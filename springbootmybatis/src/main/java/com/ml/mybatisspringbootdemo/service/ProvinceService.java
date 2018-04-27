package com.ml.mybatisspringbootdemo.service;

import com.ml.mybatisspringbootdemo.controller.params.ProvinceParam;
import com.ml.mybatisspringbootdemo.model.domain.Province;

import java.util.List;

/**
 * @author Marcus Li
 * @date 2018/4/26
 */
public interface ProvinceService {
    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    Province getById(Integer id);

    List<Province> queryProvinceListWithPage(ProvinceParam param);

    int createProvince(Province province);
}
