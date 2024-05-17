package com.example.demo;

import java.util.Objects;

/**
 * @author shyam CH
 */
public class Employee {
   private Long id;
   private String name;
   private Long sal;
   private String dept;

    public Employee(Long id, String name, Long sal, String dept) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", dept='" + dept + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSal() {
        return sal;
    }

    public void setSal(Long sal) {
        this.sal = sal;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
