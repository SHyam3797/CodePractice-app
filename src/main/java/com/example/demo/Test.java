package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class Test {

    public static void main(String[] args) {
        Employee e1 = new Employee(1L,"A1",4500L,"IT");
        Employee e2 = new Employee(2L,"A2",1500L,"OPS");
        Employee e3 = new Employee(3L,"A3",2500L,"HR");
        Employee e4 = new Employee(4L,"jayendra",500L,"IT");
        Employee e5 = new Employee(5L,"Shyam",500L,"IT");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        new Test().sortEmployee(employeeList);


    }

    private void sortEmployee(List<Employee> employeeList){
    List<Employee> SortemployeeList =   employeeList.stream().sorted(Comparator.comparing(Employee::getSal)).collect(Collectors.toList());
    List<Employee> SortemployeeList1 =   employeeList.stream().sorted(Comparator.comparing(e->e.getSal(),Comparator.reverseOrder())).collect(Collectors.toList());
    Optional<Employee> maxEmployee =
            employeeList.stream().sorted(Comparator.comparing(Employee::getSal).thenComparing(Employee::getName,String::compareToIgnoreCase).reversed()).filter(e->e.getSal()>1000 && e.getSal()<4000).max(Comparator.comparing(Employee::getSal));


        SortemployeeList.forEach(System.out::println);
        System.out.println("max employee  ");
        maxEmployee.ifPresent(System.out::println);
      //  SortemployeeList2.forEach(System.out::println);
    }
}
