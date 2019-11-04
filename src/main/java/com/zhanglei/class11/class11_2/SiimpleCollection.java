package com.zhanglei.class11.class11_2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author zhanglei
 * @description none
 * @date 2018/12/19
 */
public class SiimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            c.add(i);
        }
        for(Integer i : c){
            System.out.println(i);
        }
    }
}
