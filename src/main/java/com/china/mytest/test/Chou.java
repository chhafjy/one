package com.china.mytest.test;

/**
 * TODO
 *
 * @author chenhaohao
 * @version 1.0
 * @date 2021/11/2 10:24
 */
public abstract class Chou {
    int a = 10;
    public abstract String getStr(String str);

    public String getStrV2(String str) {
        return str.substring(1);
    }
}
