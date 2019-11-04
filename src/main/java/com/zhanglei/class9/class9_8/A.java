package com.zhanglei.class9.class9_8;

/**
 * @author zhanglei
 * @description 嵌套接口
 * @date 2018/12/17
 */
public class A {
    interface B{
        void f();
    }
    public class BImp implements B{
        @Override
        public void f() {

        }
    }

    private class BImp2 implements B{
        @Override
        public void f() {

        }
    }

    public interface C{
        void f();
    }

}
