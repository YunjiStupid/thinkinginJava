package com.testorder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author zhanglei
 * @description
 * @date 2019/7/18
 */
public class TestOrder {
    public static void main(String[] args) {
        Address address1 = new Address("111","AA","112233");
        Address address2 = new Address("111","CC","445566");
        Address address3 = new Address("22","BB","115599");
        Address address4 = new Address("333","CC","445566");
        Address address5 = new Address("44","DD","132592");
        Address address6 = new Address("22","AA","112233");
        Address address7 = new Address("22","SS","96325");

        List<Address> list = new ArrayList<>();
        list.add(address1);
        list.add(address2);
        list.add(address3);
        list.add(address4);
        list.add(address5);
        list.add(address6);
        list.add(address7);

        //***********************************************************************************************

        Set<String> collect = list.stream().map(Address::getId).collect(Collectors.toSet());
        collect.forEach(System.out::println);

        /*list.stream().forEach(x -> {
            if("22".equals(x.getId())){
                list.remove(x);
            }
        });
        System.out.println(list);*/

    }
}
