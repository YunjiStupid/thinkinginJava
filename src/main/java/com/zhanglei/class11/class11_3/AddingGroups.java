package com.zhanglei.class11.class11_3;

import java.util.*;

/**
 * @author zhanglei
 * @description 添加一组元素
 * @date 2018/12/18
 */
public class AddingGroups {
    public static void main(String[] args) {
        //Arrays.asList : 接受一个数组或是一个用逗号分隔的元素列表，并将其转化为一个List对象
        Collection<Integer> collection =
                new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        //Collections.addAll() : 接受一个Collection对象，以及一个数组或是一个用逗号分隔的列表，将元素添加至Collection中
        collection.addAll(Arrays.asList(moreInts));

        System.out.println(collection);

        Collections.addAll(collection,11,12,13,14,15);

        System.out.println(collection);
        Collections.addAll(collection,moreInts);

        System.out.println(collection);
        List<Integer> list = Arrays.asList(16,1,18,19,20);
        list.set(1,99);
        System.out.println(list);
    }
}
