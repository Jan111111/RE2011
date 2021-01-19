package j;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Emp implements Comparable<Emp>{
    String name;
    int age;
    String gender;
    double salary;

    public Emp() {

    }
    public Emp(String name,int age, String gender,double salary) {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public int compareTo(Emp o) {
        return o.getAge()-this.getAge();
    }



}


