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
    // after compiling Java code we can run the bytecode on any machine.
    //? Bytecode is Platform independent. JVM is platform dependent.

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
    // it interprets or compiles .class file in to machine code.
    //? JVM can only load and execute the program.
    //? JVM handles garbage collection, memory management, security.
    //! JVM is platform dependent.
//* JRE: Java Runtime Environment.
    // JRE only provides JVM and required libraries and supporting files.
    //? you can't compile/write code with JRE.

//* JDK: Java Development Kit
    // JDK is the complete development kit to build Java Application.
    // includes: JDK, javac(compiler), java(JVM launcher), javadoc, javap, jdb etc.


public class Intro {
}
