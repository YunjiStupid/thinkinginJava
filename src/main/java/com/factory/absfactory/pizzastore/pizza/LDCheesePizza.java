package com.factory.absfactory.pizzastore.pizza;

import com.factory.absfactory.pizzastore.Pizza;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/23
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪pizza");
        System.out.println("  伦敦奶酪pizza 准备原材料");
    }
}
