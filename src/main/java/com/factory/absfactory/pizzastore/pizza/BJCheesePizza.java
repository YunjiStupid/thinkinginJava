package com.factory.absfactory.pizzastore.pizza;

import com.factory.absfactory.pizzastore.Pizza;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/23
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京奶酪pizza");
        System.out.println("  北京奶酪pizza 准备原材料");
    }
}
