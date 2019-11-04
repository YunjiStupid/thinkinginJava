package com.zhanglei.class11.class11_8;

/**
 * @author zhanglei
 * @description Stack的测试类
 * @date 2018/12/20
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for(String s : "My dog has fleas".split(" ")){
            stack.push(s);
        }
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
