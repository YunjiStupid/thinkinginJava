package com.zhanglei.class9.class9_3;

/**
 * @author zhanglei
 * @description none
 * @date 2018/12/13
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return "Waveform" + id;
    }
}
