package Day1.示例代码找感觉;

import Day1.示例代码找感觉.Employee;

public class EmployeeTest {//String[]究竟是个啥
    public static void main(String[] args){
        Employee employee1 = new Employee("runnoob1");
        Employee employee2 = new Employee("runnoob2");

        employee1.empAge(22);
        employee1.empDesignation("gabsh");
        employee1.empSalary(2500.20);
        employee1.printEmployee();

        employee2.empAge(23);
        employee2.empDesignation("high");
        employee2.empSalary(25000.00);
        employee2.printEmployee();
    }
}
