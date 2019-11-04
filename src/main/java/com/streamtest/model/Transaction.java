package com.streamtest.model;

import lombok.Data;

/**
 * @author zhanglei
 * @description
 * @date 2019/11/1
 */
@Data
public class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;

    public Transaction(Trader trader, int year,int value){
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
}
