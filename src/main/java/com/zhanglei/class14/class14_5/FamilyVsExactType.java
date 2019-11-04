package com.zhanglei.class14.class14_5;

/**
 * @author zhanglei
 * @description 以instanceof的形式与直接比较Class对象有一个很重要的区别
 * @date 2018/12/27
 */

class Base{}
class Derived extends Base{}

public class FamilyVsExactType {
    static void test(Object x){
        System.out.println("Testing x of type " + x.getClass());
        System.out.println("x instanceof Base " + (x instanceof Base));
        System.out.println("x instanceof Derived " + (x instanceof Derived));
        System.out.println("Base.isInstance(x) " + Base.class.isInstance(x));
        System.out.println("Derived.isInstance(x) " +
                Derived.class.isInstance(x));
        System.out.println("x.getClass() == Base.class " +
                (x.getClass() == Base.class));
        System.out.println("x.getClass() == Derived.class " +
                (x.getClass() == Derived.class));
        System.out.println("x.getClass().equals(Derived.class) " +
                (x.getClass().equals(Derived.class)));
        System.out.println("x.getClass().equals(Base.class) " +
                (x.getClass().equals(Base.class)));
    }

    public static void main(String[] args) {
        test(new Base());
        System.out.println("******************************");
        System.out.println("******************************");
        System.out.println("******************************");
        test(new Derived());
    }
}
