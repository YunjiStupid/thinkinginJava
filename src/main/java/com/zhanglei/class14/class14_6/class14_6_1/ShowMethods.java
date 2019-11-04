package com.zhanglei.class14.class14_6.class14_6_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @author zhanglei
 * @description 反射机制提供了一种方法，使我们能够编写可以自动展示完整接口的简单工具。
 * @date 2018/12/27
 */
public class ShowMethods {
    private static String usage =
    "usage:\n" +
    "ShowMethods qualified.class.name\n" +
    "To show all methods in class or:\n" +
    "ShowMethods qualified.class.name\nclass.name.word\n" +
    "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try{
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if(args.length == 1){
                for(Method method : methods){
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                }
                for(Constructor ctor :  ctors){
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                }
                lines = methods.length + ctors.length;
            }else {
                for(Method method : methods){
                    if(method.toString().indexOf(args[1]) != -1){
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                }
                for(Constructor ctor : ctors){
                    if(ctor.toString().indexOf(args[1]) != -1){
                        System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                        lines++;
                    }
                }
            }
        }catch (ClassNotFoundException e){
            System.out.println("No such class: " + e);
        }
    }
}
