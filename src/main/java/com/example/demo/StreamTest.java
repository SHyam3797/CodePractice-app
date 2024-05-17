package com.example.demo;

import jakarta.servlet.ServletOutputStream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class StreamTest {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(7,6,4,6,7,8);
     //Optional<Integer> integer= intList.stream().max(Comparator.comparing(i->i));
     List<Integer> doubuleLIst=   intList.stream().map(i->i*2).collect(Collectors.toList());
    //Integer in= integer.isPresent()?integer.get():0;
        doubuleLIst.stream().forEach(System.out::println);
        Employee e1= new Employee(1L,"a",500L,"IT");
        Employee e2= new Employee(2L,"b",1500L,"IT");
        Employee e3= new Employee(3L,"c",3500L,"IT");
        Employee e4= new Employee(4L,"d",4500L,"OPS");
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        new StreamTest().empStreamTest(employeeList);
    }

    public  void empStreamTest(List<Employee> empList){
        Optional<Employee> employeeOptional= empList.stream().filter(e->e.getDept()=="IT").max(Comparator.comparing(Employee::getSal));
        System.out.println(employeeOptional.isPresent()?employeeOptional.get():"NO IT EMployee"  );

    }
}
