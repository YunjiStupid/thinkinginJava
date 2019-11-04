package com.zhanglei.class11.class11_1;

import java.util.ArrayList;

/**
 * @author zhanglei
 * @description 向上转型作用于泛型
 * @date 2018/12/18
 */
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for(Apple a : apples){
            System.out.println(a);
        }
    }
}
