package Basics_01;

public class StaticKeyword {

    public static void main(String[] args) {

        PP s1 = new PP("Praveen", 22);
        PP s2 = new PP("Kumar", 21);
        PP s3 = new PP("Rahul", 23);

        s1.display();
        s2.display();
        s3.display();

        System.out.println("College : " + PP.college); // Don't have to create an object to access the static variable because it belongs to the class
    }
}

class PP {

    String name;
    int age;

    static String college = "ABC College";

    PP(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("College : " + college);
        System.out.println();
    }
}