package com.factory.absfactory.pizzastore.order;

import com.factory.absfactory.pizzastore.Pizza;
import com.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.factory.absfactory.pizzastore.pizza.LDPepperPizza;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/23
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
