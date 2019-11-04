package com.zhanglei.class10.class10_6;

import com.zhanglei.class10.class10_4.Contents;

/**
 * @author zhanglei
 * @description 匿名内部类第一个demo
 * @date 2018/12/18
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
