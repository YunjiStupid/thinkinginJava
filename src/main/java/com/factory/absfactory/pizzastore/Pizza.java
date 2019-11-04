package com.factory.absfactory.pizzastore;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/23
 */
public abstract class Pizza {

    /**
     * 名字
     */
    protected String name;

    /**
     * 准备原材料，不同的披萨不一样，所以做成抽象方法
     */
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking");
    }

    public void cut(){
        System.out.println(name + "cutting");
    }

    public void box(){
        System.out.println(name + "boxing");
    }

    public void setName(String name){
        this.name = name;
    }
}
