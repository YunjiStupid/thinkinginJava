package com.factory.testjdk;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author zhanglei
 * @description
 * @date 2019/9/24
 */
public class TestJDK {
    public static void main(String[] args) throws ParseException{
     /*    Calendar instance = Calendar.getInstance();
        System.out.println(instance.getTime());
        System.out.println(instance);
        System.out.println(Locale.getDefault(Locale.Category.FORMAT));
        Map map = new HashMap<>();
        map.put(null,null);

        System.out.println(map.get(null));
*/
        /*DateFormat dateFormat1 = DateFormat.getDateInstance();
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");



        System.out.println(dateFormat1);
        System.out.println(dateFormat2);

        Date parse1 = dateFormat1.parse("2012-12-31");
        Date parse2 = dateFormat2.parse("2012-12-31");
        System.out.println(parse1.toString());
        System.out.println(parse2.toString());*/


        /*BigDecimal multiply = new BigDecimal("48").multiply(new BigDecimal("23")).multiply(new BigDecimal("234").divide(BigDecimal.valueOf(10000)));
        System.out.println(multiply);
        multiply = new BigDecimal("25.8345");
        System.out.println(multiply);
        BigDecimal bigDecimal = multiply.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal);*/

        String string = "dwdw";
        String s = JSONObject.toJSONString(string);
        System.out.println(s);

    }
}
