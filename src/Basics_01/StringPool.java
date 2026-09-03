package Basics_01;

public class StringPool {

    public static void main(String[] args) {

        // String literals use the String Pool
        String a = "Java";
        String b = "Java";

        System.out.println("String Pool:");
        System.out.println(a == b);          // true
        System.out.println(a.equals(b));     // true


        // new String() creates a new String object
        String c = new String("Java");
        String d = new String("Java");

        System.out.println("\nUsing new String():");
        System.out.println(c == d);          // false
        System.out.println(c.equals(d));     // true


        // Comparing pooled String with a new String
        System.out.println("\nPool vs Heap:");
        System.out.println(a == c);          // false
        System.out.println(a.equals(c));     // true
    }
}