package Basics_01;


public class PrimitiveReference {

    public static void main(String[] args) {

        // Primitive type
        int a = 10;
        int b = 10;

        System.out.println("Primitive comparison:");
        System.out.println(a == b);  // true


        // Reference type
        PrimitiveStudent s1 = new PrimitiveStudent("Praveen", 22);
        PrimitiveStudent s2 = new PrimitiveStudent("Praveen", 22);

        System.out.println("\nReference comparison:");
        System.out.println(s1 == s2);        // false
        System.out.println(s1.equals(s2));   // false
    }
}


class PrimitiveStudent {

    String name;
    int age;

    PrimitiveStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}