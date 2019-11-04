package com.zhanglei.class14.class14_2.class14_2_2;

/**
 * @author zhanglei
 * @description none
 * @date 2018/12/26
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
        //genericIntClass = double.class;
    }
}
