package OOPS_02;

public class AccessModifiersPractice {

    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        obj.publicValue = 10;

        obj.defaultValue = 20;

        obj.protectedValue = 30;

        // obj.privateValue = 40; // ERROR

        obj.display();
    }
}

class AccessDemo {

    public int publicValue;

    int defaultValue;

    protected int protectedValue;

    private int privateValue;

    void display() {

        privateValue = 40;

        System.out.println("Public    : " + publicValue);
        System.out.println("Default   : " + defaultValue);
        System.out.println("Protected : " + protectedValue);
        System.out.println("Private   : " + privateValue);
    }
}