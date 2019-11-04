package com.factory.absfactory.pizzastore.pizza;

import com.factory.absfactory.pizzastore.Pizza;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/23
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println("  伦敦胡椒pizza 准备原材料");
    }
}
