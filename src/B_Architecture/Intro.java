package B_Architecture;

// Java is Platform independent, portable and OOPs language.
// Java follows the WORA principle — Write Once, Run Anywhere.
// Java program written on PC can be run on any device.

//* JAVA code execution cycle Diagram.
/*
[HelloWorld.java]          (Source Code)
        |
        |  Compile using 'javac'
        ↓
[HelloWorld.class]         (Bytecode)
        |
        |  Run using 'java'
        ↓
JVM (Java Virtual Machine)
        ↓
Machine Code Execution
        ↓
Output: Hello, Java!
*/


//! Why is Java Platform Independent.
    // Java code is compiled creating .class file (bytecode).
    // bytecode can be run on any platform.
    // after compiling Java code, we can run the bytecode on any machine.
    //? Bytecode is a Platform independent. JVM is platform-dependent.

//* Relationship between JDK, JRE, JVM.
/*
JDK (Java Development Kit)
│
├── JRE (Java Runtime Environment)
│   ├── JVM (Java Virtual Machine)
│   ├   ├── JIT (Just In Time Compiler)
│   └── Libraries + Classes (to run programs)
│
└── Tools (like javac, debugger, etc. to develop programs)
 */

//* JVM: Java Virtual Machine.
    // is an abstract machine that can run Java Byte code.
    // it interprets or compiles .class a file in to machine code.
    //? JVM can only load and execute the program.
    //? JVM handles garbage collection, memory management, and security.
    //! JVM is platform dependent.
//* JRE: Java Runtime Environment.
    // JRE only provides JVM and required libraries and supporting files.
    //? you can't compile/write code with JRE.
    //? if you have JRE, you can run any Java program.

//* JDK: Java Development Kit
    // JDK is the complete development kit to build Java Application.
    // includes: JDK, javac(compiler), java(JVM launcher), javadoc, javap, jdb etc.
    //? you can write java programs and can compile.

//you can't just download JVM. you need to download JRE.
//* JVM can only load, interpret and execute code.
//* JRE has all the required libraries. you can run any java program using JRE.

//* File name and class name should be same and captalized.
//? one file can only have 1 public class.
//? class can have
//?         - properties, methods, contractor, nested class.



public class Intro {
    //the main method is the starting point of the program.
    // when JVM reads bytecode, JVM calls the main method.

    //public: so that main method can be accessed anywhere.
    //void: return type: not returning anything.

    //Static: static keyword makes method, variable object independent.This method can be called using class name.
    // If you want to invoke any method,
    // you need an object
    // because this is the first method JVM calls object for this method cant be called before the method.
    public static void main(String[] args) {

    }
}
