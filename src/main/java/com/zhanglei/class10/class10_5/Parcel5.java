package com.zhanglei.class10.class10_5;

import com.zhanglei.class10.class10_4.Destination;

/**
 * @author zhanglei
 * @description 在方法的作用域中创建一个完整的类——局部内部类
 * @date 2018/12/18
 */
public class Parcel5 {
    public Destination destination(String s){

        class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){
                label = whereTo;
            }
            public String readLabel(){
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
