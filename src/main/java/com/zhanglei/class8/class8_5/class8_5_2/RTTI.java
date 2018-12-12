package com.zhanglei.class8.class8_5.class8_5_2;

/**
 * @author zhanglei
 * @description 向下转型与运行时类型识别
 * @date 2018/12/12
 */
class Useful{
    public void f(){}
    public void g(){}
}

class MoreUseful extends Useful{
    public void f() {}
    public void g() {}
    public void u() {}
    public void v() {}
    public void w() {}
}

public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].g();
    }
}
