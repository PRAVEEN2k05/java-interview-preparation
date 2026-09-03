package Basics_01;

import java.util.Scanner;

public class Final_StringImmutability {
    //4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int x = 20;
        System.out.println(x);
        //x = 50;  cannot do this operation
        Child children = new Child();

        children.details();
    }
}

class Parent{
    final void details(){
        System.out.println("Hello");
    }
}
class Child extends Parent{
    /*void details(){
        Cant do this because details() method is final
    }*/
}

final class Animal{
    void sound(){
        System.out.println("Makes sound");
    }
}

/*class Dog extends Animal{
    void sound(){
        System.out.println("Barks");         /////Can't be done because Animal class if final
    }
}*/


