package OOPS_02;

import java.util.Scanner;
/*Encapsulation is the process of bundling data and the methods that operate on that data
inside a class, while restricting direct access to the internal state.*/

public class AccessModifiers {
    public static void main(String[] args) {
        Bank b = new Bank();
       // b.name;   not possible because name is private in Bank clas
        b.getname(); //we can use the method to access the private variable. Only code inside Bank can directly access it.
        b.deposit();
        b.getBalance();

    }
}

class Bank{
    Scanner sc = new Scanner(System.in);
    private String name;
    private double balance;

    /*Now outside code cannot directly modify the balance.
Instead, we provide controlled methods:*/
    public void getname(){
        System.out.println(name);
    }

    public void deposit(){
        System.out.print("Enter amount to deposit : ");
        int amount = sc.nextInt();
        if(amount > 0){
            balance += amount;
        }
    }
    public void getBalance(){
        System.out.println("Balance : " + balance);
    }
}


//PROTECTED
class Animals{
    protected String name;
}

class Dog extends Animals{
    void display(){
        name  = "Dog";                    //A sub class can access a protected variable
        System.out.println(name);
    }
}


/*DEFAULT*/
class Student {

    String name;
}

/*then name has package-private/default access.
It can be accessed by classes in the same package.
But not from an unrelated class in another package.*/