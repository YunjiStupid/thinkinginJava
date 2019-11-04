package com.datastruture.singleLinkList;

import java.util.LinkedList;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/19
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedLIst list = new LinkedLIst();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        LinkedList a = new LinkedList();
        System.out.println(list.size());
    }
}
