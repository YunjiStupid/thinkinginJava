package com.zhanglei.class9.class9_3;

/**
 * @author zhanglei
 * @description none
 * @date 2018/12/13
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){return input;}

}
