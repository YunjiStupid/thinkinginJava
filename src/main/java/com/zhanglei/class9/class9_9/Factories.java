package com.zhanglei.class9.class9_9;

/**
 * @author zhanglei
 * @description 接口与工厂
 * @date 2018/12/17
 */
interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{
    Implementation1(){}

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2");
    }
}

class Implementation1Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class Implementatoan2 implements Service{
    Implementatoan2(){}

    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2");
    }
}

class Implementatoan2Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementatoan2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer((new Implementation1Factory()));
        serviceConsumer(new Implementatoan2Factory());
    }
}
