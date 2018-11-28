package com.zhanglei.class7.class7_8final;

class WithFinals{
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    private void g(){
        System.out.println("WithFinals.f()g()");
    }
}

class OverridingPrivate extends WithFinals{
    private final void f(){
        System.out.println("OverrridingPrivate.f()");
    }
    private void g(){
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate{
    public final void f(){
        System.out.println("OverridingPrivate2.f()");
    }

    public void g(){
        System.out.println("OverridingPrivate2.f()g()");
    }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        //you can upcast
        OverridingPrivate op = op2;
        //but yu can't call the methods
        //! op.f();
        //! op.g();
        WithFinals wf = op2;
    }
}
