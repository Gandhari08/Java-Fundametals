package C_Properties;

//Variable is a container that holds a value.
    // DataType variableName= value;
    // variable name is camelCase.
    // Constant (static final) variable should be CAPITAL LETTERS.

//? JAVA is static typed (need to specify type while declaring.) and strongly typed (strict range) language

//* Primitive Data types (8 types)
    // byte, short, int, long – for integers
    // float, double – for decimals
    // char – for characters
    // boolean – for true/false

//* 1. char
    // 2 bytes 16 bits.
    // Range: \u0000 (0) to \uffff (65,535)
    //? Default value: \u0000 (0) null character.

    //? char are enclosed in ''(single quote)
    // A(65) - Z(90)
    // a(97) - z(122)
    //? char can be assigned Unicode directly.
    // char can be used in arithmetic operations. because it is stored as number(ASCII/ Unicode) internally.

//* 2. byte: stored in signed 2's complement.
    // 1 byte 8-bits
    // Range: -128(2^7) to 127(2^7-1)
    //? Default value: 0

    //Can store negative values.
    //* If value outside the range compiles time error.

    //! Integer promotion:
    // Arithmetic operations on byte promote it to int automatically.
    // If you type cast explicit to byte, the value is truncated due to overflow.

//* 3. short: stored in signed 2's complement.
    // 2 bytes 16 bits.
    // Range: -32,768 (-2^15) to 32,767 (2^15-1)
    //? Default: 0

    //Can store negative values.
    //* If value outside the range compiles time error.

    //! Integer promotion:
    // Arithmetic operations on byte promote it to int automatically.
    // If you type cast explicit to short, the value is truncated due to overflow.

//* 4. int: stored in signed 2's compliment.
    // 4 bytes 32-bits
    // Range: -2^31 to 2^31-1
    // default: 0

//* 5. long: stored in signed 2's complement.
    // 8 byte 64-bits
    // Range: -2^63 to 2^63-1
    //? default: 0L
    //! you should use the suffix L or l

//* 6. float
    // 32bit IEEE 754 values
    //Range: Approximately ±3.4e−38 to ±3.4e+38
    // Precision: ~6 to 7 decimal digits
    //? Default value: 0.0f
    //? Suffix: Must end with f or F (otherwise it’s treated as a double)

    //! 1bit sign + 8bit exponent + 23bit mantissa.
    //! bias= 127
    //! exponent= 127 + power.

    // float is less precises os occupies less space.

//* 7. double
    // 64bit IEEE 754 values.
    //Range: ±1.7e−308 to ±1.7e+308 (very large range)
    //Precision: ~15 to 16 decimal digits
    //?Default value: 0.0
    //?No suffix needed, but you can use d or D optionally

    //! 1bit sign + 11bit exponent + 52bit mantissa.
    //! bias= 1023
    //! exponent= 1023 + power.

//* 8. boolean
    // 1-bit
    // true or false
    //? Default: false


public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //1. char
        char c1= 'A';
        char c2= 65; //A
        char unicodeChar = '\u0905'; // Unicode for 'अ' in Hindi
        char c3= (char)(c1 + 2);

        //2. byte
        byte b0= -2;
        byte b2= 124;
        byte b3= 12;
        // byte b3= 234; compile time error.
        byte b4= (byte)(b2 + b3); // b1+b2 are converted to int. -120;
        // the addition is done and only the first 8 bits are considered.

        //5. long
        long l1= 100L;

    }
}
