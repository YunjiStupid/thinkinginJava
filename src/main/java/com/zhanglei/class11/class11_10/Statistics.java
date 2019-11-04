package com.zhanglei.class11.class11_10;

import sun.java2d.pipe.OutlineTextRenderer;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author zhanglei
 * @description Map   键是由Random产生的数字，而值是该数字出现的次数
 * @date 2018/12/20
 */
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < 10000; i++){
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r,freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
