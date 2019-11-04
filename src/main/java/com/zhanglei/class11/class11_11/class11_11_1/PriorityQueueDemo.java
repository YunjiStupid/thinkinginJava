package com.zhanglei.class11.class11_11.class11_11_1;

import com.zhanglei.class11.class11_11.QueueDemo;

import java.util.*;

/**
 * @author zhanglei
 * @description PriorityQueue的demo
 * @date 2018/12/21
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<>();
        Random random = new Random(47);
        for(int i = 0; i < 10; i++){
            priorityQueue.offer(random.nextInt(i + 10));
        }
        QueueDemo.printQ(priorityQueue);
        List<Integer> ints = Arrays.asList(25,22,20,
                18,14,9,3,1,1,2,3,9,14,18,21,23,25);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQ(priorityQueue);
        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEN OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(" "));
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
        QueueDemo.printQ(stringPQ);
        stringPQ = new PriorityQueue<>(strings.size(),Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);

        Set<Character> charSet = new HashSet<Character>();
        for(char c : fact.toCharArray()){
            charSet.add(c);
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(charSet);
        QueueDemo.printQ(characterPQ);
    }
}
