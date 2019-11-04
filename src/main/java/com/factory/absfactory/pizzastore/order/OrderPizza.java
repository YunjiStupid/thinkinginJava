package com.factory.absfactory.pizzastore.order;

import com.factory.absfactory.pizzastore.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/23
 */
public class OrderPizza {
    private AbsFactory factory;

    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory){
        Pizza pizza = null;
        //用户输入
        String orderType = "";
        this.factory = factory;

        do{
            orderType = getType();
            //factory可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = factory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购失败");
                break;
            }
        }while (true);

    }

    private String getType(){
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类");
            String str = in.readLine();
            return str;
        }catch (IOException e){
            System.out.println(e);
            return "";
        }
    }
}
