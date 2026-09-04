package Basics_01;

public class ObjectReferences {

    public static void main(String[] args) {

        People s1 = new People("Praveen", 22);

        People s2 = s1;

        System.out.println("Before modification:");

        System.out.println("s1 name : " + s1.name);
        System.out.println("s2 name : " + s2.name);

        System.out.println();
        System.out.print("Are s1 and s2 referring to the same object? : ");
        System.out.println(s1 == s2);

        s2.name = "Kumar";

        System.out.println("After modification:");
        System.out.println("s1 name : " + s1.name);
        System.out.println("s2 name : " + s2.name);


    }
}

class People {

    String name;
    int age;

    People(String name, int age) {

        this.name = name;
        this.age = age;
    }
}