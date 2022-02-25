package com.china.mytest.test;

import cn.hutool.core.util.StrUtil;
import com.china.mytest.beans.TestOne;
import com.china.mytest.beans.TestTwo;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.io.Console;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * TODO
 *
 * @author chenhaohao
 * @version 1.0
 * @date 2021/5/31 17:23
 */
public class MyTestTwo {

    @Test
    public void streamMapTest(){
        List<TestOne> list = new ArrayList<>();
        Map<Integer,TestOne> mapOne = list.stream().collect(Collectors
                .toMap(TestOne::getAge, Function.identity(),(key1,key2) -> key2));
        System.out.println(mapOne.get(20));
        /*list.add(TestOne.builder().name("张三").age(20).address("合肥").build());
        list.add(TestOne.builder().name("张三").age(21).address("杭州").build());
        list.add(TestOne.builder().name("王五").age(22).address("台州").build());
        Map<Integer,TestOne> mapOne = list.stream().collect(Collectors
                .toMap(TestOne::getAge, Function.identity(),(key1,key2) -> key2));
        System.out.println("mapOne" + mapOne);

        Map<Integer, String> mapTwo = list.stream().collect(Collectors
                .toMap(TestOne::getAge, TestOne::getName, (key1, key2) -> key2));
        System.out.println("mapTwo" + mapTwo);

        Map<String, List<TestOne>> mapThree = list.stream().collect(Collectors.groupingBy(TestOne::getName));
        System.out.println("mapThree" + mapThree);*/
    }

    @Test
    public void TestOne(){
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);
        set1.addAll(set2);
        System.out.println(set1);
        /*char[] chars = strOne.toCharArray();
        for (char aChar : chars) {
            System.out.print(aChar + ",");
        }
        char[] chars1 = strTwo.toCharArray();
        for (char c : chars1) {
            System.out.print(c+",");
        }*/
    }

    @Test
    public void TestTwo(){
        List<TestOne> listOne = new ArrayList<>();
        List<TestOne> listTwo = new ArrayList<>();
        TestOne testTwo = TestOne.builder().name("张三").age(20).address("合肥").build();
        TestOne testThree = TestOne.builder().name("张三").age(21).address("合肥").build();
        TestOne testFour = TestOne.builder().name("李四").age(21).address("合肥").build();
        listOne.add(testTwo);
        listOne.add(testThree);
        listTwo.add(testFour);

        listOne.addAll(listTwo);
        System.out.println(listOne);

        listTwo.addAll(listOne);
        System.out.println(listTwo);
        /*Map<Integer, List<TestOne>> collect = listOne.stream().collect(Collectors.groupingBy(m -> m.getAge(), Collectors.toList()));
        System.out.println(collect);*/

        /*List<Integer> listThree = new ArrayList<>();
        listThree.add(20);
        listThree.add(21);

        Map<Integer,TestOne> map = new HashMap<>();
        TestOne testOne = TestOne.builder().name("张三").age(20).address("合肥").build();
        map.put(20,testOne);

        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(20);

        List<TestOne> collect = listOne.stream().filter(listOne::contains).map(obj -> map.get(obj.getAge()))
                .filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(collect);

        for (Integer one : listTwo) {
            if(listThree.contains(one)){
                System.out.println(map.get(one));
            }
        }*/
        //subordinateData.stream().filter(orgIdList::contains)
        //                .map(obj -> map.get(obj.getOrgId())).filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Test
    public void TestThree(){
        List<TestOne> listOne = new ArrayList<>();
        List<TestOne> listTwo = new ArrayList<>();
        TestOne testTwo = TestOne.builder().name("张三").age(20).address("合肥").build();
        TestOne testThree = TestOne.builder().name("张三").age(21).address("合肥").build();
        TestOne testFour = TestOne.builder().name("李四").age(21).address("合肥").build();
        listOne.add(testTwo);
        listOne.add(testThree);
        listTwo.add(testFour);
        List<String> list = new ArrayList<>();
        list.add("3");
        list.add("2");
        list.add("4");
        list.add("1");

//        List<String> list1 = null;
//        list.addAll(list1);
        System.out.println(list);
        String s = String.join(",", list);
        System.out.println(s);
//        System.out.println(getCount(list));
//        System.out.println(getCount(listOne));
//        System.out.println(getCount(listTwo));
        /*System.out.println(list);
        Collections.sort(list);
        System.out.println(list);*/
      /*  System.out.println(9&8);
        System.out.println(1 == (1&8));*/
        /*String[] s = {"a","b"};
        System.out.println(s);
        HashSet<String> strings = new HashSet<>(Arrays.asList(s));
        strings.remove("a");
        System.out.println(strings.toString());*/
    }

    public Integer getCount(List list){
        if(CollectionUtils.isEmpty(list)){
            return 0;
        }
        return list.size();
    }
    @Test
    public void TestFour(){

    }

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        while (true){
            System.out.println("qing shu ru...");
            Scanner sc = new Scanner(System.in);
            int str = sc.nextInt();
            if( str > year && str <= year +1){
                System.out.println("ming");
            }
            if(str < year && str >= year -1) {
                System.out.println("qu");
            }
            if(str == year){
                System.out.println("jin");
            }
            if(str == 0){
                System.out.println("jie shu le");
                return;
            }
        }
    }

    @Test
    public void r(){
        String str = "{}ε=(´ο｀*)))唉{}";
        String format = StrUtil.format(str, "我", "你");
        System.out.println(str);
        System.out.println(format);

        String k = "7DABD1E3-345F-44DB-837F-AED637BB5D69";
        System.out.println(k.length());
    }
}
