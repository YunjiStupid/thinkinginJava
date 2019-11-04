package com.designpattern.singleton;

import java.util.Date;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/17
 */
public class LazySingle {
    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.INSTANNCE;
        Singleton2 instance2 = Singleton2.INSTANNCE;
        System.out.println(instance1 == instance2);
        System.out.println(new Date());
        System.out.println(new Date(System.currentTimeMillis()+1000));

    }
}

enum Singleton2{
    /**
     * 测试奥
     */
    INSTANNCE;
}

class Singleton1{
    private Singleton1(){

    }

    private static class SingletonInstance{
        private static final Singleton1 singleton = new Singleton1();
    }
    public static Singleton1 getInstance(){
        return SingletonInstance.singleton;
    }
}

class Singleton{
    private static volatile Singleton singleton;
    private Singleton(){

    }
    //提供一个静态的公有方法，加入双重检查，解决线程安全问题，同时解决懒加载问题
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

class Single{
    private static Single single;

    private Single(){
    }
    public static synchronized Single getInstance(){
        if(single == null){
            single = new Single();
        }
        return single;
    }
}

