package com.zhanglei.class14.class14_2;

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;
import com.sun.org.apache.xml.internal.security.Init;

import java.util.Random;

/**
 * @author zhanglei
 * @description none
 * @date 2018/12/26
 */
class Initable{
    static final int staticFinal = 47;
    static final int staticFinal2 =
            ClassInitialization.rand.nextInt(1000);
    static{
        System.out.println("Initializing Intable");
    }
}

class Initable2{
    static int staticNonFinal = 147;
    static{
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNonFinal = 74;
    static{
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception{
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("Initable3");
        System.out.println("After creaing Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
