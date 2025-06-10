package com.proceduralprogramming;

public class SingleDimensionalArrayDemo {
    public static void main(String[] args) {
       // <DATA_TYPE>[] <VARIABLE_NAME> = {...values comma separated};
       // <DATA_TYPE>[] <VARIABLE_NAME> = new <DATA_TYPE>[size];
       //  Access / Output - <VARIABLE_NAME>[index which is 0 based];
       // Indexes counting always starts from 0
       String[] students = new String[5];
       students[0] = "Dheeraj";
       students[1] = "Bhabani";
       students[2] = "Santosh";
       students[3] = "Rakesh";
       students[4] = "Rishab";
//       students[5] = "rima"; ARRAY INDEX OUT OF BOUNDS EXCEPTION

        int[] roll_numbers = {1, 2, 3, 4, 5}; // NOT TRULY DYNAMIC
    }
}
