package com.proceduralprogramming;

import java.lang.reflect.Method;

public class MethodsDemo {
    // <ACCESS_SPECIFIER> <RETURN_TYPE> <NAME_OF_METHOD>(...arguments) {
    // ....
    // ....
    // return <RETURN_TYPE_VALUE> // optional for void
    // }

     public boolean oddOrEven(int num) {
         if(num % 2 == 0) {
             return true;
         }
         return false;
     }

    public static void main(String[] args) {
        MethodsDemo demo = new MethodsDemo(); //  RESERVES MEMORY,
        System.out.println(demo.oddOrEven(11)); // ASKS THE JAVA COMPILER TO PROCESS THIS INTO HEX// CREATES AN INSTANCE
    }
}
