package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

/**
 * @author shyam CH
 */
public class EmployeeStream {
    public static void main(String[] args) {
        Employee e1= new Employee(2L,"ab",1500L,"IT");
        Employee e2= new Employee(3L,"ab",1500L,"IT");
        Employee e3= new Employee(5L,"c",3500L,"IT");
        Employee e4= new Employee(1L,"d",4500L,"OPS");
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        new EmployeeStream().getEmployee(employeeList);
    }

    private void getEmployee(List<Employee> employeeList){
      Map<Long, Set<Employee>> map=  employeeList.stream().collect(Collectors.groupingBy(e->e.getSal(), TreeMap::new,toSet()));


    }
}
