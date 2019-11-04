package com.zhanglei.class15.class15_2.class15_2_1;

/**
 * @author zhanglei
 * @description 增加類型參數
 * @date 2019/1/3
 */
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    public final C third;
    public ThreeTuple(A a,B b,C c){
        super(a, b);
        third = c;
    }

}
