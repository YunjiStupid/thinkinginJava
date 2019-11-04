package com.java3;

import com.java2.Employee;
import com.java2.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 测试Stream的中间操作
 *
 * @author zhanglei
 * @description
 * @date 2019/7/9
 */
public class StreamAPITest1 {

    @Test
    public void test1(){
        List<Employee> list = EmployeeData.getEmployees();
        list.stream().filter(e -> e.getSalary() > 6000 && e.getAge() > 30).forEach(System.out::println);
        System.out.println();
        list.stream().limit(6).forEach(System.out::println);
        System.out.println();
        list.stream().skip(9).forEach(System.out::println);
        System.out.println();
        list.add(new Employee(1001,"刘强东",40,5000));
        list.add(new Employee(1001,"刘强东",40,5000));
        list.add(new Employee(1001,"刘强东",40,5000));
        list.add(new Employee(1001,"刘强东",40,5000));
        list.add(new Employee(1001,"刘强东",40,5000));
        list.stream().distinct().forEach(System.out::println);

    }

    /**
     * 映射
     *
     * @author zhanglei
     * @date 2019/7/9
     * @return void
     */
    @Test
    public void test2(){
        //map(Function f)————接受一个函数作为参数，将元素转换成其他形式或提取信息，
        // 该函数会应用到每一个元素上，并将其映射为一个新元素
        List<String> list = Arrays.asList("aa","bb","cc","dd");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

        //获取员工姓名长度大于3的员工数据
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().map(Employee::getName)
                .filter(e -> e.length() > 3)
                .forEach(System.out :: println);

        //flatmap(Function f) 接收一个函数作为参数，将流中的每一个值都换成一个流，然后把所有流连接成一个流


    }

    //排序
    @Test
    public void test4(){
        List<Integer> integers = Arrays.asList(12, 32, 42, 23, 56, 45, 76, 35);
        List<Integer> list = integers.stream().sorted().collect(Collectors.toList());
        System.out.println(list);

        List<Employee> employeeList = EmployeeData.getEmployees();
        employeeList.stream()
                .sorted((e1,e2) -> Integer.compare(e1.getAge(),e2.getAge()))
                .forEach(System.out::println);

    }
}
