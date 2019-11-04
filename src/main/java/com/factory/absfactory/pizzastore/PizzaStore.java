package com.factory.absfactory.pizzastore;

import com.factory.absfactory.pizzastore.order.BJFactory;
import com.factory.absfactory.pizzastore.order.OrderPizza;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/24
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
