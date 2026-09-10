package OOPS_02.Inheritance;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("Praveen");

        Student s3 = new Student("Praveen", 22);

    }
}

class Student {

    String name;
    int age;

    Student() {
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}