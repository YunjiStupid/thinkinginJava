package com.zhanglei.testjava8.new1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author zhanglei
 * @description
 * @date 2019/4/26
 */
public class newTest {
    public static void main(String[] args) {
        /*ArrayList<String> names1 = new ArrayList<>();
        names1.add("张磊");
        names1.add("安娜");
        names1.add("安捷");
        names1.add("包子");
        names1.add("贝壳");
        names1.add("哈哈");
        sortUsingJava8(names1);
        System.out.println(names1);

        String s = "dwdw";
        try{
            System.out.println(Integer.valueOf(s));
        }catch (NumberFormatException e){
            System.out.println("地址码不能为空且只能是数字");
        }*/
        System.out.println(isSunday());

    }

    public static Boolean isSunday(){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            return true;
        } else{
            return false;
        }

    }

    /**
     * 转换时间格式  默认格式 yyyy-MM-dd 00:00:00
     *
     * @param
     * @return
     */
    public static String getHUGHDateString(String... dateStr) {
        String ghhd = "";
        //设置日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (dateStr.length < 1) {
            ghhd = sdf.format(new Date()) + " 00:00:00";
        } else {
            try {
                ghhd = dateStr[0];
                ghhd = sdf.format(sdf.parse(ghhd)) + " 00:00:00";
            } catch (Exception e) {
                System.out.println("8888888888888888");
            }
        }
        return ghhd;
    }


    private static void sortUsingJava8(List<String> s){
        Collections.sort(s,(s1,s2) -> s1.compareTo(s2));
    }
}
