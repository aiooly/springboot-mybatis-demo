package com.ml.mybatisspringbootdemo.model.domain;

import javax.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 城市编码
     */
    private String code;

    /**
     * 城市名称
     */
    private String name;

    /**
     * 所属省份编码
     */
    @Column(name = "province_code")
    private String provinceCode;
}