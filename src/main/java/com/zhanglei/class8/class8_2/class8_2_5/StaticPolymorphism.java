package com.zhanglei.class8.class8_2.class8_2_5;

class StaticSuper{
    public static String staticGet(){
        return "Base dynamicGet()";
    }

    public String dynamicGet(){
        return "Base dynamicGet()";
    }

}

class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Derived dynamicGet()";
    }

    public String dynamicGet(){
        return "Derived dynamicGet()";
    }

}

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
