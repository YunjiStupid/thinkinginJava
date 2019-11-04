package com.testASCII;

import com.sun.deploy.util.ArrayUtil;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @author zhanglei
 * @description
 * @date 2019/8/15
 */
public class ASCIITest {
    public static void main(String[] args) throws Exception {
        /*BigDecimal number = new BigDecimal(1998);
        System.out.println(number);
        number = number.setScale(1,BigDecimal.ROUND_HALF_UP);
        System.out.println(number);
        System.out.println(number.toString());*/
        //int i = 1/0;
        Date date = new Date();


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);

        String ss = "";
        //dwdwdw
        System.out.println(ss.length());

        System.out.println("************************");


        Date d =sdf.parse(ss);
        System.out.println(d.getTime());


        String format = sdf.format(date);
        boolean before = d.before(date);

        System.out.println(before);

        /*System.out.println(date);

        System.out.println(date.getTime());*/

        /*String s = "1123 + 123 + 2233.";
        String s2 = "dwsda + adw + dwdw";

        if(!String.valueOf(s.charAt(0)).matches("^[0-9]*$")
                || !String.valueOf(s.charAt(s.length()-1)).matches("^[0-9]*$")){
            System.out.println("s订单信息有误");
        }
        if(!String.valueOf(s2.charAt(s2.length()-1)).matches("^[0-9]*$")
                || !String.valueOf(s2.charAt(0)).matches("^[0-9]*$")){
            System.out.println("s2订单信息有误");
        }*/
        /*String [] string = s.split("\\+");
        String [] string2 = s2.split("\\+");
        String[] result = new String[string.length + string2.length];
        System.arraycopy(string, 0, result, 0, string.length);
        System.arraycopy(string2, 0, result, string.length, string2.length);
        for(String number : result){
            try{
                if(Integer.valueOf(number.trim()) >= 999){
                    System.out.println("哈哈哈哈");
                }
            }catch (NumberFormatException e){
                System.out.println("1111111");
                break;
            }
        }
        Arrays.stream(string).forEach(System.out::println);
        System.out.println(s.length());*/

    }
}
