package com.china.mytest.test;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.china.mytest.beans.TestOne;
import jdk.nashorn.internal.runtime.regexp.RegExpMatcher;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * TODO
 *
 * @author chenhaohao
 * @version 1.0
 * @date 2021/5/28 15:55
 */
public class MyTestOne {

    @Test
    public void testOne() throws IllegalAccessException {
        List<TestOne> list = new ArrayList<>();
        TestOne two = TestOne.builder().address("合肥").name("李四").age(13).build();
        TestOne one = TestOne.builder().address("安徽").name("张三").age(12).build();
        TestOne three = TestOne.builder().address("六安").name("王五").age(20).build();
        TestOne four = TestOne.builder().address("六安").name("其四").age(14).build();
        TestOne five = TestOne.builder().address("六安").name("其四").age(15).build();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);

        LocalDate now = LocalDate.now();
        System.out.println(now.toString());
        System.out.println("2021-08-10".equals(now));
        /*Date date = new Date();
        LocalDate localDate1 = dateToLocalDate(date);
        System.out.println(now);
        System.out.println(now.equals(localDate1));
        LocalDate now1 = LocalDate.now();
        LocalDate localDate = now1.minusYears(1);*/
        /*int i = 1;
        while (true) {
            LocalDate localDate1 = localDate.plusDays(i);
            i++;
            System.out.println(localDate1);
            if (localDate1.equals(now)) {
                return;
            }

        }*/
        /*LocalDate localDate = now.plusDays(-1);
        System.out.println(localDate);*/
        /*LocalDate localDate1 = now.minusWeeks(1);
        System.out.println(localDate1);*/
        //dui xiang zhuan map
        /*Map<String, Object> map = this.objectToMap(five);
        System.out.println(map);
        map.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });*/
        /*Map<String, Set<Integer>> collect = list.stream().collect(Collectors.groupingBy(TestOne::getAddress, Collectors.mapping(TestOne::getAge, Collectors.toSet())));
        collect.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });*/

        /*ArrayList<Integer> integers = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integers.forEach(s -> {
            int i = 0;
            while (i < s) {
                i++;
                System.out.print(i + "*" + s + "=" + i * s +"  ");
            }
            System.out.println();
        });*/

        /*for (int i= 1; i <= 9; i++) {
            for (int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"  ");
            }
            System.out.println();
        }*/











        /*System.out.println(list);

        ArrayList<Integer> arrayList = Lists.newArrayList(13, 14);
        Map<String, List<TestOne>> collect = list.stream().collect(Collectors.groupingBy(item -> {
            if (arrayList.contains(item.getAge())) {
                return "one";
            } else {
                return "two";
            }
        }));
        collect.forEach((v1, v2) -> {
            String collect1 = v2.stream().map(TestOne::getName).collect(Collectors.joining(","));
            System.out.println(v1 + "=" + collect1);
        });*/


        /*list.stream().collect(Collectors
                .groupingBy(TestOne::getAddress, Collectors
                        .mapping(TestOne::getName, Collectors.joining("+"))))
                .forEach((K, V) -> {
                    System.out.println(K + "=" + V);
                });*/

        /*list.stream().collect(Collectors.groupingBy(item -> {
            if (item.getAge() <= 13) {
                return "13";
            } else {
                return "other";
            }
        })).forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });*/

        /*Map<String, List<TestOne>> collect = list.stream().collect(Collectors.groupingBy(item -> item.getAddress() + "_" + item.getName()));
        collect.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });*/

        /**
         *根据指定字段排序
         */
        List<TestOne> oneList = list.stream().sorted(Comparator.comparing(
                TestOne::getAge)).collect(Collectors.toList());
        System.out.println(oneList);

       /* list.stream().flatMap(s -> Arrays.stream(s.getName().split(""))).forEach(a -> System.out.print(a + ","));
        list.stream().sorted(Comparator.comparing(TestOne::getName)).forEach(s ->list.remove(s));
        System.out.println(list);*/
        /*String s = list.stream().map(item -> item.getName()).collect(Collectors.joining(","));
        System.out.println(s);*/
    }

    @Test
    public void test() throws IllegalAccessException {
        TestOne two = TestOne.builder().address("合肥").name("李四").age(13).build();
        final Map<String, Object> map =
                objectToMap(two);
        System.out.println(map);
    }

    public static Map<String, Object> objectToMap(Object obj) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = obj.getClass();
        System.out.println(clazz);
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object value = field.get(obj);
            map.put(fieldName, value);
        }
        return map;
    }

    public static LocalDate dateToLocalDate(Date date) {
        if (null == date) {
            return null;
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public Date getDate(LocalDate time) {
        SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
        Date date = null;
        String format1 = null;
        try {
            format1 = format.format(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            if (i == finishCount(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static int finishCount(int a) {
        int j = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                j += i;
            }
        }
        return j;
    }

    public int get() {
        return finishCount(6);
    }

    @Test
    public void TestN(){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().map(i -> {
            if(i == 3){
                return 0;
            }
            i = i * i;
            String str = i.toString();
            if(str.length() > 1){
                i = Integer.parseInt(str.substring(str.length() - 1));
            }
            return i;
        }).distinct().sorted().collect(Collectors.toList()).forEach(System.out::println);
    }

    @Test
    public void TestN_1(){
        TestOne three = TestOne.builder().age(20).address("安徽").name("张三").build();
        TestOne two = TestOne.builder().age(22).address("合肥").name("李四").build();
        TestOne one = TestOne.builder().age(21).address("阜阳").name("王五").build();
        List<TestOne> list = Arrays.asList(one, two, three);
        //根据年龄排序
        list.stream().sorted(Comparator.comparing(TestOne::getAge).reversed()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("***************************************************");
    }

    @Test
    public void chh(){
        List<TestOne> list = new ArrayList<>();
        TestOne one = TestOne.builder().age(20).address("阜阳").name("王").build();
        TestOne two = TestOne.builder().age(21).address("阜阳").name("五").build();
        TestOne three = TestOne.builder().age(30).address("阜阳").name("王五").build();
        TestOne four = TestOne.builder().age(19).address("阜阳").name("王五").build();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        //subList 顾头不顾尾
        /*final List<TestOne> list1 = list.subList(1, 2);
        System.out.println(list1);*/
        /*Map<Integer, Set<String>> collect = list.stream().collect(Collectors.groupingBy(TestOne::getAge, Collectors.mapping(TestOne::getName, Collectors.toSet())));
        List<TestOne> list2 = list.stream().limit(2).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("-------------------------------");
        System.out.println(list2);*/
        /*list.forEach(v -> v.setAge(60));
        System.out.println(list);*/
        /*Map<Integer, TestOne> collect = list.stream().filter(v -> v.getAge() == 19).collect(Collectors.toMap(TestOne::getAge, Function.identity()));
        System.out.println(collect);*/
    }

    SimpleDateFormat YMD = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    @Test
    public void testNN(){

        Double v = 10.356;
        BigDecimal bigDecimal = BigDecimal.valueOf(v);
        System.out.println(bigDecimal);
        BigDecimal multiply = bigDecimal.multiply(new BigDecimal(3));
        System.out.println(multiply);
        System.out.println(multiply.doubleValue());


        /*Date today = new Date();//获取今天的日期

        Calendar c = Calendar.getInstance();

        c.setTime(today);

        c.add(Calendar.DAY_OF_MONTH, 1);

        Date tomorrow = c.getTime();//这是明天
        System.out.println(YMD.format(tomorrow));

        c.setTime(today);

        c.add(Calendar.DAY_OF_MONTH, -1);

        Date yesterday = c.getTime();//这是昨天
        System.out.println(YMD.format(yesterday));*/

        /*//获取当日开始时间
        String now = DateUtil.now();
        Date date = DateUtil.parse(now);
        Date beginOfDay = DateUtil.beginOfDay(date);
        //获取当日结束时间
        DateTime endOfDay = DateUtil.endOfDay(date);
        Date dateTime = DateUtil.offsetHour(beginOfDay, 2);
        System.out.println(beginOfDay);
        System.out.println(dateTime);
        System.out.println(beginOfDay.after(beginOfDay));
        while (endOfDay.after(beginOfDay)){
            beginOfDay = DateUtil.offsetHour(beginOfDay, 6);
            System.out.println(beginOfDay);
            TestOne build = TestOne.builder().date(beginOfDay).build();
            System.out.println(build);
            System.out.println(1);
        }

        Date beginOfDay2 = DateUtil.beginOfDay(new Date());
        Date begin = DateUtil.offsetDay(beginOfDay2, -7);

        System.out.println(beginOfDay2);
        System.out.println(begin);*/
        /*Integer a = 120;
        Double b = 130.0;
        System.out.println(b > a);
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        str.append("aaaa:");
        for (String userId : list) {
            str.append(userId);
        }
        System.out.println(str.toString());*/
        /*try {
            Integer a = null;
            System.out.println(a.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        /*List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
            System.out.println(i);
            if(i == 5){
                System.out.println(list+"--------------------");
                break;
            }
        }
        System.out.println(list);*/
//        System.out.println(Double.MAX_VALUE);

        /*String a = "170.0";
        Integer b = 170;
        double v = Double.parseDouble(a);
        int i = Integer.parseInt(a);
        System.out.println(i);
        System.out.println(v >= b);*/
        /*String a = "2021-08-10";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = simpleDateFormat.parse(a);
            boolean before = parse.before(new Date());
            System.out.println(before);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
    }

    @Test
    public void TestM() {
        List<String> list = Arrays.asList("1", "8", "4", "6", "77", "44");
        List<TestOne> listV2 = new ArrayList<>();
        listV2.add(TestOne.builder().name("1").age(20).build());
        listV2.add(TestOne.builder().name("23").age(20).build());
        listV2.add(TestOne.builder().name("13").age(20).build());
        List<String> collect = listV2.stream().map(TestOne::getName).collect(Collectors.toList());
        System.out.println(collect);
        List<Integer> list1 = new ArrayList<>();
        listV2.stream().mapToInt(e -> Integer.parseInt(e.getName())).forEach(list1::add);
        System.out.println(list1);
    }

    @Test
    public void Test10() {
        final String v1 = "a";
        String v2 = "b";
        String v3 = "ab";
        String v4 = "a" + "b";
        String v5 = "a" + v2;
        String v6 = v1 + "b";
        System.out.println(v3 == v4);
        System.out.println(v3 == v5);
        System.out.println(v5==v6);
        System.out.println(v4 == v6);
    }

    public Date getDate(String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = null;
        try {
            parse = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            return null;
        }
        return parse;
    }


    public void ss(Integer t){
        System.out.println(t == null);
    }
}
