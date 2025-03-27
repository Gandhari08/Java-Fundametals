package A_OppsIntro;

//! There is no operator overloading in java.


//* OOPS: Object-Oriented Programing: Organising Software design around data, or objects rather than functions and logic.
    // Objects: Objects are instance of a class and a real word entity.each object has properties and functionality(methods).

    // Class: Is a Template to create an objects, defining their properties and functionality that are common to all objects of that type.

    // to create an object we need a Class.

    // Student is a template to create an object of Student type.
        // the properties of Student are called data variables.
        // updateAddress(), getAge() and Student() are methods that work on data variable.

    // each object of Student type has its own properties and methods.

//* How to create Objects
    //1. using new Keyword.
        // ClassName variableName= new Constructor.
        // ! new keyword is used to create and allocate(in heap) memory for an object of a class.


//* Procedural, vs OOPS
    // Program is divided into parts called functions, program is divide into objects.
    // Does not provide proper way to hide data, Object provides data hiding.
        // gives importance to function over data, gives more importance to data.
        //Data is tight coupled. Data is closely coupled.
    //! OverLoading, Inheritance is not possible.
    // Pascal, C, FORTRAN  VS Java, C#, Python, C++.

//* 4 Pillars of OOPS: Data Abstraction, Encapsulation, Polymorphism, Inheritance.

//* 1. Data Abstraction: hiding the internal implementation. As a user we only see essential functionality of the user.
    // when you press the break of car the car stops. we as a user only know that when we press break the car stops. the car company Abstracted the implementation of the break.
    // ! WHY
        // The purpose of abstraction is so you can ignore details that aren't relevant to you. When I'm working with a list of objects, I normally want to add, remove, and iterate. I don't want to worry about resizing an underlying array or adding and removing linked nodes.
    // !HOW
        // In Java, we can achieve this abstraction using abstract class, Interface.
    //! Increases security and confidentiality.


//* 2. Data Encapsulation/Hiding:  bundles the data and the code working on the data(methods) in a single unit.

    //! Why
        // let's say age is public property. then the user can enter -10 which is valid for the data type but not logical for age property.
        // so if we make age a private and declare getter and setter. we can declare logic for a valid age. the logic(functionality) is hidden from the user.
        //! Data abstraction will give full control over the properties to the class.
    //! HOW
        // we can achieve this by declaring properties and methods as private and declaring setters and getters.
    //! Loosely coupled code and better control and security.

//* 3. Inheritance: Capability of a class to inherit properties and methods from their parent class.
    //! WHY
        // because we don't want to rewrite them again in the child class.
        // gives Hierarchical relationship between new class(subclasses) and existing class(superclass)
    //! HOW
        // using keyword extends and through interface.
        // types: single, Multilevel, hierarchical.
        //        Multiple inheritance- using Interface.
    //! Code reusability, achieving polymorphism using inheritance.

    //! Why is multiple inheritance not possible without Interface.
        // Let's say we have 2 class having same method name applyBrakes(), but different implementation.
        // and these 2 class are inherited by a subclass.
        // when the subclass calls applyBrakes(), then the compiler gets confuse which class method should I call.
        // so this is the reason we can achieve multiple inheritance.

        // with Interfaces, we can hack around to get this behaviour.
        // if the 2 superclasses are Interfaces.
        // then the subclass will not have any confusion about which applyBrakes() I need to call.
        // because the Interface will only have method declaration. the subclass need to implement the method.

//* 4. Polymorphism: A same method behaves differently in different situation.
    //Types: Compile type, static polymorphism, Method overloading.
    //       Run Time, Dynamic polymorphism, Method overriding.

    //* A. Method overloading:
        // Method overloading means defining multiple methods with same name in the same class/subclass, but different parameters.
        // java has the all the information need to know which method to call during compile time.
        // method can have same returnType, access modifier, exception
        // ! but must have different argument list or sequence of the argument list.
        // ! only on the bases of arguments overloading is done.
            // int sum(int a, int b)
            // int sum(int x, int y)
            // String sum(int m, int n)
            // this is not overloading.
            // because all the 3 methods have same signature sum(int, int) and java will not consider returnType when resolving overloads.
        //! method can be overloaded in the same class or in a subclass.

    //* B. Method overriding:
        // Method overriding happens when a subclass provides its own version of method that it inherits from superclass.
        //! the method should have same returnType, access modifier, parameters types and sequence but different implementation.
        // when java sees a method it will check the implementation of the method in the class. if not found then java will check in the superclass for the implementation.

    //!WHY
        //we need overloading for flexibility. so that different inputs are processed.
        // we need overriding for Runtime polymorphism: behaviour depends on actual class.
    //!How
        // Overloading and OverRiding is achieved through Inheritance.


/*
class Veh{
    public void print(){
        System.out.println("Veh");
    }
}

class Car extends Veh{
    public void print(){
        System.out.println("CAR");
    }
}


class Main {
    public static void main(String[] args) {
        Car c1= new Car();
        Veh c2= new Car();
        Veh v1= new Veh();

        c1.print();
        c2.print();
        v1.print();
    }
}

output:
    CAR
    CAR
    Veh

*/

// c1 is of Car reference type which is referencing to Object of type Car.
    // c1 has access to all the methods in Veh and Car.
    //due to runtime polymorphism print() in Car call is called.

// c2 if of Veh reference type which is referencing to Object of type Car.
    // c2 can only access methods in Veh, but can implement print() from the Car class.

//! the reference type determines what methods you can call, while the object type determines which implementation will run (if the method is overridden).

//v1 if of Veh reference type which is referencing to Object of type Veh.
    //v1 has only access to methods in Veh.

public class Intro {
    public static void main(String[] args) {

        //* creating an object
        // ClassName variableName= new Constructor.
        Student enginneringStudent= new Student(23, "hyd", "chetan");
        Student mbaStudent= new Student(24, "mumbai", "ravi");

    }
}
