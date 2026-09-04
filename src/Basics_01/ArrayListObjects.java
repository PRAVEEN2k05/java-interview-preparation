package Basics_01;

/*
What is ArrayList actually storing?
This is extremely important.
When you do:
students.add(s1);
the ArrayList doesn't copy the entire Student object.
Conceptually:
students
    ↓
ArrayList

index 0 ───────► Student object 1
index 1 ───────► Student object 2
index 2 ───────► Student object 3
So the ArrayList stores references to the Student objects.

*/

import java.util.ArrayList;

public class ArrayListObjects {

    public static void main(String[] args) {

        ArrayList<SS> SSs = new ArrayList<>();

        SS s1 = new SS("Praveen", 22);
        SS s2 = new SS("Kumar", 21);
        SS s3 = new SS("Rahul", 23);

        SSs.add(s1);
        SSs.add(s2);
        SSs.add(s3);

        System.out.println("SS:");

        for (SS s : SSs) {

            System.out.println("Name : " + s.name);
            System.out.println("Age  : " + s.age);
            System.out.println();
        }
    }
}

class SS {

    String name;
    int age;

    SS(String name, int age) {

        this.name = name;
        this.age = age;
    }
}