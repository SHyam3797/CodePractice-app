package com.example.demo.JavaStreamTest;

import com.example.demo.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class EmployeeThirdHieghst {

    public void getThirdHiegst(List<Employee> employeeList){
     List<Employee> employeeList1=   employeeList.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).limit(3).collect(Collectors.toList());
        employeeList1.forEach(System.out::println);
    }

    public void getAllThirdHighst(List<Employee> employeeList){
   List<Employee> list=     employeeList.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).skip(2).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
