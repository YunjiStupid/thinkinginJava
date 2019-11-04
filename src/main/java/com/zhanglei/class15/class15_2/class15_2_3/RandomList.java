package com.zhanglei.class15.class15_2.class15_2_3;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author zhanglei
 * @description 一个持有特定类型对象的列表，每次调用其上的select()方法时，它可以随机地选取一个元素。如果我们希望以此构建一个可以应用于各种类型的对象的工具，就需要使用泛型
 * @date 2019/1/3
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random();
    public void add(T item){storage.add(item);}
    public T select(){
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for(String s : ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" ")){
            rs.add(s);
        }
        for(int i = 0; i < 11; i++){
            System.out.println(rs.select() + " ");
        }
    }
}
