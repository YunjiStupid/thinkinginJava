package com.zhanglei.class8.class8_2.class8_2_2;

import java.util.Random;

public class RandomShapeGnerator {
    private Random rand = new Random(47);
    public Shape next(){
        switch (rand.nextInt(3)){
            default:
            case 1: return new Square();
            case 2:return new Triangle();
        }
    }
}
