package Basics_01;

/*
JDK  - Java Development Kit
       Used to develop Java applications.
       Contains development tools such as javac.

JRE  - Java Runtime Environment
       Provides the environment required to run Java applications.

JVM  - Java Virtual Machine
       Executes Java bytecode.

Flow:

.java
  ↓
javac
  ↓
.class (Bytecode)
  ↓
JVM
  ↓
Execution

Bytecode is platform independent.
JVM is platform dependent.
*/

public class JdkJreJvm {

    public static void main(String[] args) {

        System.out.println("Java Execution Flow");

        System.out.println(".java file");
        System.out.println("      ↓");
        System.out.println("javac compiler");
        System.out.println("      ↓");
        System.out.println(".class file / Bytecode");
        System.out.println("      ↓");
        System.out.println("JVM");
        System.out.println("      ↓");
        System.out.println("Machine Code");
        System.out.println("      ↓");
        System.out.println("Program Execution");
    }
}