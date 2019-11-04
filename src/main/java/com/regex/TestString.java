package com.regex;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author zhanglei
 * @description
 * @date 2019/6/12
 */
public class TestString {
    public static void main(String[] args) {
        /*Person person = new Person();
        person.setAge("11");
        person.setName("zhanglei");
        System.out.println(person.toString());
        System.out.println(person.toString().toString());*/

    }
}

class Person{
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
