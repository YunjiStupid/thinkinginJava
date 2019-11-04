package com.designpattern.prototype.deepclone;

import java.io.Serializable;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/27
 */
public class DeepProtoType implements Serializable,Cloneable {
    /**
     * String 属性
     */
    public String name;
    /**
     * 引用类型
     */
    public DeepCloneableTarget deepCloneableTarget ;

    public DeepProtoType(){
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Object deep = null;
        //这里完成对基本数据类型（属性）和String的克隆
        deep = super.clone();
        //对引用类型的属性进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();

        return deepCloneableTarget;
    }
}
