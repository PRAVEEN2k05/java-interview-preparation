package OOPS_02.Encapulation;

public class Encapsulation {
    public static void main(String[] args) {
        Employees emp = new Employees();
        emp.setName("Kumar");
        emp.setAge(20);
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
    }
}

/*Here we will have an idea about getters and setters*/
class Employees{
    private String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*Encapsulation Isn't Just Getters and Setters
    This is a common interview trap.
    Many beginners memorize:
    Encapsulation = private variables + getters/setters.

            That's an oversimplification.
    Getters/setters are a common implementation technique, but encapsulation is really about:
    Controlling access to an object's internal state and preserving its valid state/invariants.*/
}