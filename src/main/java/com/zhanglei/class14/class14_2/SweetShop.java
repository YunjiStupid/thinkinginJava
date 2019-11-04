package com.zhanglei.class14.class14_2;

/**
 * @author zhanglei
 * @description Class对象
 * @date 2018/12/25
 */

class Candy{
    static{
        System.out.println("Loading Candy");
    }
}

class Gumm{
    static{
        System.out.println("Loading Gum");
    }
}

class Cookie{
    static{
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try{
            Class.forName("Gum");
        }catch (Exception e){
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
