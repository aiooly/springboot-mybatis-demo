package com.ml.mybatisspringbootdemo.model.domain;

import javax.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 地区编码
     */
    private String code;

    /**
     * 地区名称
     */
    private String name;

    /**
     * 所属城市编码
     */
    @Column(name = "city_code")
    private String cityCode;
}