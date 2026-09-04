package Basics_01;

public class Constructors {
    public static void main(String[] args) {
        Employees epm1 = new Employees();
        Employees emp2 = new Employees("Kumar", 20, 400000, "CSE");
        Employees emp3 = new Employees("Kumar", 20, 400000);

        emp2.display();
        emp3.display();
    }
}

class Employees{
    String name;
    int age;
    double salary;
    String department;

    Employees(){

    }

    public Employees(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public Employees(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = "N/A";
    }

    public void display(){
        System.out.println("Employee details" + " \nName : " + name +"\nAge : "+ age +"\nSalary : " + salary +"\nDepartment : " + department);
        System.out.println();
    }
}