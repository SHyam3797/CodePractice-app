package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class EmployeeGroup {
    public static void main(String[] args) {
        Employee e1 = new Employee(1L,"abs",100L,"IT");
        Employee e2 = new Employee(1L,"bbs",100L,"IT");
        Employee e3 = new Employee(1L,"cbs",200L,"IT");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        new EmployeeGroup().findEmployee(employeeList);
    }

    private void findEmployee(List<Employee> list){
        Comparator<Employee> employeeComparator = (o1, o2) ->{
            if(o1.getSal() > o2.getSal()) return 1;
            if (o1.getSal()<o2.getSal()) return -1;
            else return 0;
        };


    Map<Long,List<Employee>> map =    list.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).collect(Collectors.groupingBy(Employee::getSal));
        //.collect(Collectors.groupingBy(Employee::getSal));
    map.forEach((k,v)->System.out.println(k+" "+v));
    }
}
