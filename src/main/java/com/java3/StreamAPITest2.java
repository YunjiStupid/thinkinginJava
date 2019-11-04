package com.java3;

import com.java2.Employee;
import com.java2.EmployeeData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author zhanglei
 * @description
 * @date 2019/7/10
 */
public class StreamAPITest2 {

    //匹配与查找
    @Test
    public void test1(){
        //allMatch(Preicate e)————检查是否匹配所有元素
    }

    //收集
    @Test
    public void test2(){
        List<Employee> employeeList = EmployeeData.getEmployees();
        List<Employee> result = employeeList.stream().filter(e -> e.getSalary() > 5000).collect(Collectors.toList());
        result.stream().forEach(System.out::println);
        //System.out.println(result);

        List<Optional<Employee>> sss = new ArrayList<>();

        Optional<Employee> dw;
    }

}
