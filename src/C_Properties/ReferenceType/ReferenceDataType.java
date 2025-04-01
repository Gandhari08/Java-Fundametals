package C_Properties.ReferenceType;

//* Non-Primitive or Reference Type
    // Class, String, Interface, Array

//* 1.Class
    //* new keyword is used to create reference type objects.
        // Employee employee_1= new Employee()
        // when ever you are using new keyword, a new memory is created in Heap memory.
        // employee_1 object is the reference to the memory that was created in the Heap.
        // employee_1 holds the reference to actual memory in the Heap.

    //? In Java, there is only Pass by Value.

//* 2. String: Immutable.
    // Strings are stored in special memory called String pool.
    // In the String pool, only 1 copy of the value is stored.
    // If any of the other variables has the same value, the 2 variables are pointed to the same memory.

    //*String Literal: a sequence of characters enclosed in ""
        // String s1= "Hello";
        // String s2= "Hello";
        //?Memory Management: both s1,s2 are String literals that are stored in String pool.
        //? Both the String literal will point to the same memory.

    //* String Object
        //String s3= new String("Hello");
        //String s4= new String("Hello");
        //?Memory Management:This is not considered String literal and is not stored in String Pool.The Object is stored in Heap Memory.
        //? s3 and s4 are not holding the same address.

    //* Comparing String Literal and String Object.
        //! == check address is same or not.
        //! .equals() checks values are same or not.

        // s1 == s2 true
        // s1 == s3 false

        // s1.equals(s2) true
        // s1.equals(s3) true

//* 3. Interface:
    // Similar to class.
    //? You can't create Object of Interface.
    //? you can create a Reference of Interface to hold the Object.

//* 4. Array: Sequence of memory that holds variables of the same type.
    // int[] arr= {1,2,3,4,5}
    // int[] arr= new int[5]
    // using new keyword memory is allocated for 5 items.
    // arr holds the reference to the Array.
    //!No, Java does not guarantee that arrays are stored in a continuous memory block. JVM decided.
    //*2D array
        // int[][] arr= new int[2][];
        // row size is mandatory.
        // each row holds reference to another 1D array.

//* 5. Wrapper Class:
    // In generics you can only pass Class as Generic type. If you want to pass int, error. In this case, Wrapper class are useful.
    //Wrapper classes allow primitive to be used in Collection.

    //? auto boxing: Java automatically converts primitives to wrapper objects.
    //? unboxing: Java automatically converts wrapper objects to primitives.

    //! Wrapper class are Immutable.
        // Wrapper class are final class so they can't be inherited.
        // Wrapper class properties are also final, so they can't change values after the object is created.
        // If we update the value. A new object is created and the reference to the object will be held by the variable.

public class ReferenceDataType {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2= "Hello";
        String s3= new String();

        System.out.println(s1==s2);     //true
        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s3); //flase
        System.out.println(s1.equals(s3));//true.


        // Interface Reference variable and Object variable relation.
            //!the reference type determines what methods you can call, while the object type determines which implementation will run (if the method is overridden).

        Person teacher_1= new Teacher();
        Person engineer_1= new Engineer();
        Teacher teacher_2= new Teacher();
        Engineer engineer_2= new Engineer();


        //* Array
            int[] arr= new int[5];
            int[] arr1= {1,2,3,4,5};
            int[][] arr2= new int[3][];
    }
}
