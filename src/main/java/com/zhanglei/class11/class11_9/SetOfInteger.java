package com.zhanglei.class11.class11_9;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author zhanglei
 * @description 存放Integer对象的HashSet实例
 * @date 2018/12/20
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> intSet = new HashSet<Integer>();
        for(int i = 0; i < 10000; i++){
            intSet.add(random.nextInt(30));
        }
        System.out.println(intSet);
    }
}
