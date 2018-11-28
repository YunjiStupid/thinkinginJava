package com.zhanglei.class7.class7_9;

/**
 * 构造器也是static方法，尽管static没有被显式的写出来
 */
class Insect{

    private int i = 9;
    protected int j;
    Insect(){
        System.out.println("i = " + i + " , j = " + j);
        j = 39;
    }

    private static int x1 =
            printInit("static Insect.x1 initialzed");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect{
    private int k = printInit("Beetle.k initialized");
    public Beetle(){
        System.out.println("k = "+ k);
        System.out.println("j == " + j);
    }
    private static int x2 =
            printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Beeetle constructor");
        Beetle b = new Beetle();
    }

}
