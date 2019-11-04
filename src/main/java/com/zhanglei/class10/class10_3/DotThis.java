package com.zhanglei.class10.class10_3;

/**
 * @author zhanglei
 * @description 使用.this和.new
 * @date 2018/12/17
 */
public class DotThis {
    private int id = 1;
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
            //A plain "this" would be Inner's "this"
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
