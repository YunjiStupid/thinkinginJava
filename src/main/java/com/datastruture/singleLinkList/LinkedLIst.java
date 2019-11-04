package com.datastruture.singleLinkList;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/19
 */
public class LinkedLIst {
    /**
     * 头结点
     */
    private Node head = new Node();

    private int length = 0;

    /**
     * 临时节点
     */
    private Node temp;

    private class Node{
        private Object data;
        private Node next;

        Node(){

        }

        Node(Object obj){
            data = obj;
            next = null;
        }
    }

    public void add(Object object){
        temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(object);
        length++;
    }

    public Object get(int index){
        if(index < 0 || index > length){
            throw new ArrayIndexOutOfBoundsException();
        }
        temp = head.next;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        //优化，二分查找法
        return temp.data;
    }

    public int size(){
        return length;
    }



}
