package com.zhanglei.class9.class9_1;

import com.zhanglei.class8.class8_1.Note;

/**
 * @author zhanglei
 * @description 管弦乐器抽象类
 * @date 2018/12/12
 */
abstract class Instrument{
    private int i;
    public abstract void play(Note n);
    public String what(){return "Instrument";}
    public abstract void adjust();
}

class Wind extends Instrument{
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
    public void adjust() {}
    public String what() { return "Wind"; }
}

/**
 * 打击乐器
 */
class Percussion extends Instrument{
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public void adjust() {}

    public String what() { return "Percussion"; }
}

/**
 * 弦乐
 */
class Stringed extends Instrument{
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public void adjust() {}

    public String what() { return "Stringed"; }
}

/**
 * 铜管乐器
 */
class Brass extends Wind{
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind{
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String what() {return "Woodwind";}
}

public class Music4 {
    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e){
        for(Instrument i: e){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
