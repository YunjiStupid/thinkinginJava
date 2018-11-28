package com.zhanglei.class7.class7_8final;

/**
 * final参数
 *      可以读参数却无法修改参数，这一特性主要用来向匿名内部类传递参数
 */
class Gizmo{
    public void spin(){}
}

public class FinalArgument {
    void with(final Gizmo g){

    }

    void without(Gizmo g){
        g = new Gizmo();
        g.spin();
    }

    int g(final int i){
        return i+ 1;
    }

    public static void main(String[] args) {
        FinalArgument bf = new FinalArgument();
        bf.without(null);
        bf.with(null);
    }
}

