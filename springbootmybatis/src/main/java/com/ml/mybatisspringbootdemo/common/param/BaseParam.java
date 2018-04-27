package com.ml.mybatisspringbootdemo.common.param;

import lombok.Data;

/**
 * @author Marcus Li
 * @date 2018/4/26
 */
@Data
public class BaseParam {
    private Integer pageNum = 1;
    private Integer pageSize = 10;
}
