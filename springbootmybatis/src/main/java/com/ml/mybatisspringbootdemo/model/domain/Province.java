package com.ml.mybatisspringbootdemo.model.domain;

import javax.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 省份编码
     */
    private String code;

    /**
     * 省份名称
     */
    private String name;
}