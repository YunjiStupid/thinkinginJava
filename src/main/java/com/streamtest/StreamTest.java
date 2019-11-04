package com.streamtest;


import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author zhanglei
 * @description
 * @date 2019/6/28
 */
public class StreamTest {
    public static void main(String[] args) {
        /*Student stuA = new Student(1, "A", "M", 184);
        Student stuB = new Student(2, "B", "G", 163);
        Student stuC = new Student(3, "C", "M", 175);
        Student stuD = new Student(4, "D", "G", 158);
        Student stuE = new Student(5, "E", "M", 170);
        List<Student> list = new ArrayList<>();
        list.add(stuA);
        list.add(stuB);
        list.add(stuC);
        list.add(stuD);
        list.add(stuE);

        List<Student> list1 = list.stream().filter(student -> student.getSex().equals("G")).collect(Collectors.toList());


        System.out.println(list1);*/
        //.forEach(student -> System.out.println(student.getName() + "蹲完"));

        Map map = new HashMap(1);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        System.out.println(map);
    }

}

