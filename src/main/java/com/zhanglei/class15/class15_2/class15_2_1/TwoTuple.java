package com.zhanglei.class15.class15_2.class15_2_1;

/**
 * @author zhanglei
 * @description 二維元組
 * @date 2019/1/3
 */
public class TwoTuple<A,B> {
    public final A first;
    public final B second;
    public TwoTuple(A a,B b){
        first = a;
        second = b;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        TwoTuple<Integer,String> ss = new TwoTuple<>(1,"zhanglei");
        System.out.println(ss.toString());
    }
}
