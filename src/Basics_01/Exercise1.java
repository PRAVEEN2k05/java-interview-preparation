package Basics_01;

import java.util.ArrayList;
import java.util.Scanner;

//Create three Employee objects with different values. and print their details
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        System.out.print("No of Employees : ");
        int e_no = sc.nextInt();
        sc.nextLine();

        for(int i=1; i<=e_no; i++){
            System.out.println("Enter Employee "+ i + " details");
            System.out.print("Name : ");
            String name = sc.nextLine();
            System.out.print("Age : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Salary : ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Department : ");
            String department = sc.nextLine();
            System.out.println();
            Employee emp = new Employee(name, age, salary, department, i);
            list.add(emp);
        }
        for(Employee emp : list){
            emp.display();
        }
    }
}

class Employee{
    String name;
    int age;
    double salary;
    String department;
    int e_no;

    public Employee(String name, int age, double salary, String department, int e_no) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.e_no = e_no;
    }
    void display(){
        System.out.println("Employee " + e_no +  " details" + " \nName : " + name +"\nAge : "+ age +"\nSalary : " + salary +"\nDepartment : " + department);
    }
}
