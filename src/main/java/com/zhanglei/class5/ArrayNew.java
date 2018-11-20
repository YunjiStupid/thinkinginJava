package com.zhanglei.class5;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
    /*public static void main(String[] args) {
        int [] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("lenth of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }*/

    public static void main(String[] args) {
        Random random = new Random(47);
        Integer [] a = new Integer[random.nextInt(20)];
        System.out.println("length of a = " + a.length);
        /*for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(500);
        }*/
        System.out.println(Arrays.toString(a));
    }
}
