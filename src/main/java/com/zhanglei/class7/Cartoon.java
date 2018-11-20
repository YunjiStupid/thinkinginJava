package com.zhanglei.class7;

/**
 * 构建初始化对象过程是从基类“向外”扩散的，所以父类在子类构造器可以访问他之前，就已经完成了初始化
 *
 *
 *
 */
class Art{
    Art(){
        System.out.println("Art constructor");
    }
}

class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing constructor");
    }
}

public class Cartoon {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
