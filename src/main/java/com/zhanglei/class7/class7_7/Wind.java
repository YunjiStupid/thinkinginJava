package com.zhanglei.class7.class7_7;

class Instrument{
    public void play(Instrument i){
        System.out.println("i = " + i);
    }
    static void tune(Instrument i){
        i.play(i);
    }
}

public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
