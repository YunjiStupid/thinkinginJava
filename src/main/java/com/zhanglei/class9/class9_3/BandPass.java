package com.zhanglei.class9.class9_3;

/**
 * @author zhanglei
 * @description none
 * @date 2018/12/13
 */
public class BandPass extends Filter{
    double lowCutoff,highCutoff;
    public BandPass(double lowCut,double highCut){
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
