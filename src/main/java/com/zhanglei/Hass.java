package com.zhanglei;

/**
 * @author zhanglei
 * @description
 * @date 2019/3/5
 */
public class Hass {
    public static void main(String[] args) {
        //Integer s = new Integer(1);
        Integer a = 11,b=11,c=12,d=12;
        System.out.println(a == b);
        System.out.println(c == d);
        Person person = new Person();
        //person.setAge(s);
        if(1 == person.getAge()){
            System.out.println("hahahah");
        }
    }
}
