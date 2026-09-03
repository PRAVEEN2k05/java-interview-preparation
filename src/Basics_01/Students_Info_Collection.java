package Basics_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Students_Info_Collection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        System.out.print("How many candidates : ");
        int count = sc.nextInt();
        sc.nextLine();//clearing the buffer

        System.out.println("\nEnter Details");

        for(int i=1; i<= count; i++){
            System.out.print("Enter name of student " + i +": ");
            String name = sc.nextLine();
            System.out.print("Enter age " + i + ": ");
            int age = sc.nextInt();
            sc.nextLine();//clearing the buffer

            Student students = new Student(name, age, i);
            list.add(students);
        }

        for(Student s : list){
            s.details();
            System.out.println();
        }

        list.get(0).details();

    }
}

class Student{
    String name;
    int age;
    int s_count;

    Student(String name, int age, int s_count){
        this.name = name;
        this.age = age;
        this.s_count = s_count;
    }
    void details(){
        System.out.println("Name of student " + s_count + ": " + name);
        System.out.println("Age of student " + s_count + ": " + age);
    }
}
