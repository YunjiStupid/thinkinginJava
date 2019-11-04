package com.designpattern.prototype.deepclone;

import java.io.Serializable;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/27
 */
public class DeepCloneableTarget implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName,String cloneClass){
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类的属性，都是Strin，所以默认的clone方法完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
