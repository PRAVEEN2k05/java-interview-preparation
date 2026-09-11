package OOPS_02.Inheritance;

public class ConstructorInheritance {

    public static void main(String[] args) {

        Chil Chil = new Chil("Praveen", 22);

        Chil.display();
    }
}

class Par {

    String name;

    Par(String name) {

        this.name = name;

        System.out.println("Par constructor");
    }
}

class Chil extends Par {

    int age;

    Chil(String name, int age) {

        super(name);

        this.age = age;

        System.out.println("Chil constructor");
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}