package com.zhanglei.class11.class11_1;

import sun.awt.AppContext;

import java.util.ArrayList;

/**
 * @author zhanglei
 * @description 泛型容器第一个demo
 * @date 2018/12/18
 */
class Apple{
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }
}

class Orange{}

public class AppleAndOrangesWithoutGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for(int i = 0; i < 3; i++){
            apples.add(new Apple());
        }
        for(int i = 0; i < apples.size(); i++){
            System.out.println(apples.get(i).id());
        }
    }
}
