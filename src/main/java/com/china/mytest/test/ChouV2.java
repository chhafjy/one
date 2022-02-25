package com.china.mytest.test;

import com.china.mytest.beans.TestOne;
import org.junit.Test;

/**
 * TODO
 *
 * @author chenhaohao
 * @version 1.0
 * @date 2021/11/2 10:25
 */
public class ChouV2 extends Chou {
    int a = 20;

    @Override
    public String getStr(String str) {
        return str;
    }

    /*@Override
    public String getStrV2(String str) {
        return str + "重写后";
    }*/

    @Test
    public void test() {
//        Chou v2 = new ChouV2();
//        System.out.println(v2.a);
//        String strV2 = this.getStrV2("4541");
//        System.out.println(strV2);

        int i, j;
        int[] a = {5, 9, 6, 8, 7};
        for (i = 0; i < a.length - 1; i++) {
            int k = i;
            for (j = i; j < a.length; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
