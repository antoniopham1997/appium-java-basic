package lesson_08;

import java.util.ArrayList;
import java.util.List;

public class Salary extends Employee{

    public static void main(String[] args) {
        Employee fte1 = new FullTimeEmployee();
        Employee fte2 = new FullTimeEmployee();
        Employee fte3 = new FullTimeEmployee();
        Employee cont1 = new Contractor();
        Employee cont2 = new Contractor();

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(fte1);
        employeeList.add(fte2);
        employeeList.add(fte3);
        employeeList.add(cont1);
        employeeList.add(cont2);

        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }

        System.out.println("Total salary is: " + totalSalary);
    }
}
