package com.zhanglei.class8.class8_2.class8_2_5;

class Super{
    public int field = 0;
    public int getField(){
        System.out.println("------" + field);
        return field;
    }
}

class Sub extends Super{
    public int field = 1;
    public int getField(){
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field = " + sup.field +
                            ".sup.getField() = " + sup.getField());

        Sub sub = new Sub();
        System.out.println("Sub.field = " +
                sub.field + ",sub.getField() = "  +
                sub.getField() + ",sub.getSuperField() = " + sub.getSuperField());

    }
}
