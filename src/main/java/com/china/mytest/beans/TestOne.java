package com.china.mytest.beans;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * TestOne用的实体类
 *
 * @author chenhaohao
 * @version 1.0
 * @date 2021/5/31 15:35
 */
@Data
@Builder
public class TestOne {

    private String name;

    private Integer age = 0;

    private String address;

    private Date date;
}
