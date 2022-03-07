package Day1.示例代码找感觉;
import java.io.*;


public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    public Employee(String name){
        this.name = name;//为什么这里要用this.name。因为这是构造函数
    }
    public void empAge(int empAge){
        age = empAge;
    }
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmployee(){
        System.out.println("名字:"+name);
        System.out.println("age:"+age);
        System.out.println("职位:"+designation);
        System.out.println("money:"+salary);
    }
}
