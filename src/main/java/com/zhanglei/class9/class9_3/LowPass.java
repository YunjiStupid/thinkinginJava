package com.zhanglei.class9.class9_3;

/**
 * @author zhanglei
 * @description none
 * @date 2018/12/13
 */
public class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){this.cutoff = cutoff;}
    public Waveform process(Waveform input){
        return input;
    }
}
