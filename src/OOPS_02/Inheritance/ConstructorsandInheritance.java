package OOPS_02.Inheritance;

public class ConstructorsandInheritance {
    public static void main(String[] args) {
        Child c = new Child();

    }
}

class Parent{
    Parent(){
        System.out.println("Parents are called");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Children are called");
    }
}