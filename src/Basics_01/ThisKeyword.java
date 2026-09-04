package Basics_01;

public class ThisKeyword {

    public static void main(String[] args) {

        Studentss s1 = new Studentss("Praveen", 22);
        Studentss s2 = new Studentss("Kumar", 21);

        s1.display();
        s2.display();
    }
}

class Studentss {

    String name;
    int age;

    Studentss(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println("Name : " + this.name);
        System.out.println("Age  : " + this.age);
        System.out.println();
    }
}