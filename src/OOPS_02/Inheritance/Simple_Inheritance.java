package OOPS_02.Inheritance;

public class Simple_Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Makes Sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Barksss");
    }
}