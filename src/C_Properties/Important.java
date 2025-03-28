package C_Properties;


//* Type conversion
    //* Implicit conversion
        // byte → short → int → long → float → double
        // conversion happens when you are assigning value or in arithmetic operation.

    //* Explicit conversion
        // You're converting from a larger to a smaller data type.
        // You must use type casting, and data might be lost (overflow, truncation).

    //! Java does not allow conversion from/to boolean.
    //? when arithmetic operation happens between byte, short values are implicitly converted to int.

//* Kinds of variables
    //* 1.memberVariables / Instance variable:
        // Declared inside class but outside methods.
        //? LifeTime: Created when the object is created and destroyed with the object.
        //? Initialized: by constructor

    //* 2. Local variable:
        // Declare inside a method.
        //? Lifetime: Created when the method is called and destroyed after the method ends.
        //? Initialized: must be initialized before use.

    //* 3. class variable/ static:
        // Declared with the static keyword inside a class but outside any method.
        // belongs to the class and share the same instance with all the objects.
        //? LifeTime: loaded when the class is loaded.
        //? Initialized: explicitly.

    //* 4. Parameter Variable:
        // Variables declared in method/constructor parameter lists.
        //? lifetime: created when the method is called and destroyed when the method is removed from stack.
        //? Initialized: values are passed through method calling.

//! CONSTANT VARIABLE:
    // static final int CONSTANT_VARIABLE= 123;
    // static makes the variable independent of an object;
    // final makes the variable immutable.
    //? value must be given beforehand.



class Employee{
    int memberVariable;
    static int staticVariable= 100;

    //Parameterized constructor.
    Employee(int a) {
        this.memberVariable=a;
    }


    public void dummyMethod(){
        byte localVariable= 111;
        System.out.printf("local Variable" + localVariable);
    }

    //Method parameter.
    public int dummyMethod2(int a, int b){
        return a+b;
    }
}





public class Important {
    public static void main(String[] args) {

    }
}
