package com.factory.absfactory.pizzastore.order;

import com.factory.absfactory.pizzastore.Pizza;

/**
 * 抽象工厂模式的抽象层
 *
 * @author zhanglei
 * @description
 * @date 2019/9/23
 */
public interface AbsFactory {

    /**
     * 让工厂子类具体实现
     */
    Pizza createPizza(String orderType);
}
