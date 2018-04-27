package com.ml.mybatisspringbootdemo.mapper.custom;

import com.ml.mybatisspringbootdemo.model.domain.Province;

import java.util.List;

/**
 * @author Marcus Li
 * @date 2018/4/26
 */
public interface ProvinceCustomMapper {
    List<Province> queryProvinceListWithPage(Province province);
}
