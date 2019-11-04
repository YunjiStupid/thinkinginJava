package com.zhanglei.class9.class9_6;

import java.util.Random;

/**
 * @author zhanglei
 * @description 产生随机浮点数
 * @date 2018/12/17
 */
public class RandomDoubles {
    private static Random rand = new Random(47);
    public double next(){return rand.nextDouble();}

    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for(int i = 0; i < 7; i++){
            System.out.println(rd.next() + " ");
        }
    }
}
