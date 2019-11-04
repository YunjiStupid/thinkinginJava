package com.zhanglei.class9.class9_5.class9_5_1;

/**
 * @author zhanglei
 * @description none
 * @date 2018/12/13
 */
interface I1{void f();}
interface I2{int f(int i);}
interface I3{int f();}

class C{public int f(){return 1;}}

class C2 implements I1,I2{
    public void f(){}
    public int f(int i){
        return 1;
    }
}

class C3 extends C implements I2{
    public int f(int i){return 1;}
}

public class C4 {
    public int f(){return 1;}

    public static void main(String[] args) {
        System.out.println(-1);
    }
}
/*class C5 extends C implements I1{
    public void f(){}

    public int f(){return 1;}
}*/
