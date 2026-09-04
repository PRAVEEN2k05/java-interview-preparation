package Basics_01;
/*This demonstrates another important use of this.
this() calls another constructor in the same class.*/
public class ThisConstructorChaining {

    public static void main(String[] args) {

        Person s1 = new Person();
        s1.display();

        Person s2 = new Person("Praveen", 22);
        s2.display();
    }
}

class Person {

    String name;
    int age;

    Person() {
        this("Unknown", 0);              //IMPORTANT : In no parameter constructor this should be first before any operation
    }

    Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println();
    }
}