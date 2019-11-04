package com.zhanglei.class13.class13_1;

/**
 * @author zhanglei
 * @description String 对象demo
 * @date 2018/12/24
 */
public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        System.out.println(q);
        String qq = upcase(q);
        System.out.println(qq);
        System.out.println(q);
    }

}
