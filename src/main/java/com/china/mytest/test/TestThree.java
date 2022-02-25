package com.china.mytest.test;

import com.china.mytest.beans.TestOne;
import org.junit.Test;

/**
 * @author chenhaohao
 * @version 1.0
 * @date 2021/12/20 9:25
 */
public class TestThree {

    @Test
    public void TestOne() {
        //叶子层
        int level = 10;
        //根层
        int rootLevel = 2;
        int spaceNum = level - 1;

        //画叶子
        // 为什么从1开始  不管了就是任性
        for (int i = 1; i <= level; i++) {
            spaceNum--;
            for (int g = 0; g <= spaceNum; g++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((i * 2) -1); j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
        System.out.println("    ❤圣诞节快乐❤");
        //画根
        for (int i = 1; i <= rootLevel; i++) {
            for (int g = 1; g < level; g++) {
                System.out.print(" ");
            }
            System.out.print("*\n");
        }
    }


    @Test
    public void TestTwo() {
        Integer a = null;
        Integer b = null;
if(a.equals(b)){
    System.out.println(111111);
    return;
}
    }
}
