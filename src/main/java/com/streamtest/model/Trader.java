package com.streamtest.model;

import lombok.Data;
import lombok.Getter;

/**
 * @author zhanglei
 * @description
 * @date 2019/11/1
 */
@Data
public class Trader {
    private final String name;
    private final String city;
    public Trader(String name,String city){
        this.name = name;
        this.city = city;
    }
}
