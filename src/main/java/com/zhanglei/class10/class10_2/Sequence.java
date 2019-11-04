package com.zhanglei.class10.class10_2;

/**
 * @author zhanglei
 * @description 链接到外部类
 * @date 2018/12/17
 */

interface Selector{
    boolean end();
    Object current();
    void next();
}
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size){
        items = new Object[size];
    }

    public void add(Object x){
        if(next < items.length){
            items[next++] = x;
        }
    }

    //顺序选择器
    private class SequenceSelector implements Selector{
        private int i = 0;

        public boolean end(){
            return i == items.length;
        }

        public Object current(){
            return items[i];
        }

        public void next() {
            if(i < items.length){
                i++;
            }
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++){
            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
