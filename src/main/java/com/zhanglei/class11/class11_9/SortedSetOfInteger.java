package com.zhanglei.class11.class11_9;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author zhanglei
 * @description 若想对结果排序，一种方式是使用TreeSet来代替HashSet
 * @date 2018/12/20
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        SortedSet<Integer> intSet = new TreeSet<Integer>();
        for(int i = 0; i < 10000; i++){
            intSet.add(random.nextInt(30));
        }
        System.out.println(intSet);
    }
}
