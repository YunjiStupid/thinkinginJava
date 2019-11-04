package com.test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author zhanglei
 * @description
 * @date 2019/4/15
 */
public class TestMain {
    public static void main(String[] args) {
        String sysdate =getSysTime("yyyy-MM-dd");
        System.out.println(sysdate);
        /*Person z1 = new Person("22","zhanglei");
        Person z2 = new Person("23","zhangxiaolei");
        Person z3 = new Person("21","fanguangcong");
        Person z4 = new Person("223","runshangwei");
        Person z5 = new Person("2222","yinjing");
        Person z6 = new Person("2233","menghui");
        Person z7 = new Person("22","yangyang");
        Person z8 = new Person("221","zhenyu");

        List<Person> personList = new ArrayList<>();
        personList.add(z1);
        personList.add(z2);
        personList.add(z3);
        personList.add(z4);
        personList.add(z5);
        personList.add(z6);
        personList.add(z7);
        personList.add(z8);

        System.out.println(personList);
        System.out.println("********************************************");
        setOrder(personList);
        System.out.println(personList);*/
    }

    /**
     * 获取系统时间  默认格式 yyyy-MM-dd HH:mm:ss
     *
     * @param
     * @return
     */
    public static String getSysTime(String... param) {
        Date date = null;
        String pattern = "";
        if (param.length < 1) {
            pattern = "yyyy-MM-dd HH:mm:ss";
        } else {
            pattern = param[0];
        }
        //设置日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new Date());
    }

    public static void setOrder(List<Person> personList){
        List<Person> topProduct = new ArrayList<>();
        Iterator<Person> proIterable = personList.iterator();

        while(proIterable.hasNext()){
            Person product = proIterable.next();
            if("22".equals(product.getAge())){
                //添加需要置顶的数据
                topProduct.add(product);
                //在主列表中删除置顶数据
                proIterable.remove();
            }
        }
        List<Person> newProductList = new ArrayList<>();
        newProductList.addAll(personList);
        System.out.println(personList);
        System.out.println("********************删除后，在上方************************");
        personList.clear();
        personList.addAll(topProduct);
        personList.addAll(newProductList);
        topProduct.clear();
        newProductList.clear();

    }
}
