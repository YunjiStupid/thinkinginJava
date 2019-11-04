package com.java3;

import com.java2.Employee;
import com.java2.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author zhanglei
 * @description
 * @date 2019/7/9
 */
public class StreamAPITest {


    @Test
    public  void test1(){
        List<Employee> employees = EmployeeData.getEmployees();

        //返回一个顺序流
        employees.stream();

        Stream<Employee> stream2 = employees.parallelStream();
    }

    @Test
    public  void test2(){
        Employee e1 = new Employee(1001,"Tom");
        Employee e2 = new Employee(1002,"Jerry");
        Employee[] arr = new Employee[]{e1,e2};
        Stream<Employee> ss = Arrays.stream(arr);
    }


}
