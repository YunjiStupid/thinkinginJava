package com.test;

/**
 * @author zhanglei
 * @description
 * @date 2019/4/15
 */
public class Person {

    public Person(String age, String name) {
        this.age = age;
        this.name = name;
    }

    private String age;
    private String name;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
