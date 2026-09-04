package Basics_01;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<studs> students = new ArrayList<>();

        // Creating objects
        studs s1 = new studs("Ram", 20);
        studs s2 = new studs("Ravi", 30);
        // Adding objects
        students.add(s1);
        students.add(s2);
        // Size
        System.out.print("Number of students : " + students.size());
        System.out.println();

        // Retrieve using index
        studs std = students.get(0);
        std.display();
        // Direct retrieval
        System.out.println("Second student:");
        students.get(1).display();

        // Modify object
        students.get(0).name = "Praveen R";

        System.out.println("After modification:");
        students.get(0).display();

        System.out.println();

        // Enhanced for loop
        System.out.println("All students:");

        for (studs s : students) {

            s.display();
        }

        // Remove object
        students.remove(1);

        System.out.println("After removing third student:");
        System.out.println("Number of students : " + students.size());
    }
}


class studs{
    String name;
    int age;

    studs(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
