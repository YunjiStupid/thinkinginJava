package com.zhanglei.class8.class8_1;

import javafx.scene.shape.Circle;

import java.awt.*;
import java.sql.SQLOutput;

public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
