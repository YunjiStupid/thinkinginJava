package com.zhanglei.class14.class14_2.class14_2_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanglei
 * @description 使用泛型类语法。它存储了一个类引用，稍后产生一个List，填充这个List的对象是使用newInstance()方法
 * @date 2018/12/26
 */

class CountedInteger{
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type){this.type = type;}

    public List<T> create(int nElements){
        List<T> result = new ArrayList<T>();
        try{
            for(int i = 0; i < nElements; i++){
                result.add(type.newInstance());
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> fl =
                new FilledList<>(CountedInteger.class);
        System.out.println(fl.create(15));
    }

}
