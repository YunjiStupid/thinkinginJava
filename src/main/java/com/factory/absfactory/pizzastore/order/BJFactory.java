package com.factory.absfactory.pizzastore.order;

import com.factory.absfactory.pizzastore.Pizza;
import com.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.factory.absfactory.pizzastore.pizza.BJPepperPizza;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/23
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
