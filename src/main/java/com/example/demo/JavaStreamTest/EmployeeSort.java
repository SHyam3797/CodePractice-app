package com.example.demo.JavaStreamTest;

import com.example.demo.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee(1L,"AA",13000L,"IT");
        Employee e2 = new Employee(2L,"AB",12000L,"IT");
        Employee e3 = new Employee(3L,"Ac",100L,"IT");
        Employee e4 = new Employee(4L,"AD",1000L,"IT");
        EmployeeSort employeeSort = new EmployeeSort();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
       // employeeSort.sortEmployee(employeeList);
        EmployeeThirdHieghst employeeThirdHieghst = new EmployeeThirdHieghst();
      //  employeeThirdHieghst.getThirdHiegst(employeeList);
        employeeThirdHieghst.getAllThirdHighst(employeeList);
    }



    private void sortEmployee(List<Employee> employeeList){
        List<Employee>  employeeList1 =employeeList.stream().sorted(Comparator.comparing(Employee::getSal)).collect(Collectors.toList());
        employeeList1.forEach(System.out::println);
    }
}
