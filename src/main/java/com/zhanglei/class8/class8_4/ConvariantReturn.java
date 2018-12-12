package com.zhanglei.class8.class8_4;

/**
 * @author zhanglei
 * @description Java5SE中添加了协变返回类型，在子类的被覆盖方法可以返回父类方法的返回类型的某种子类型
 * @date 2018/12/12
 */
class Grain{
    public String toString(){
        return "Grain";
    }
}

class Wheat extends Grain{
    public String toString(){
        return "Wheat";
    }
}

class Mill{
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Mill{
    Wheat process(){
        return new Wheat();
    }
}

public class ConvariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }
}
