package com.proceduralprogramming;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        // <DATA_TYPE>[][] <VARIABLE_NAME> = new <DATA_TYPE>[rowSize][colSize];
        // <DATA_TYPE][][] <VARIABLE_NAME> = {
        //                                   {1,2,3,4,5},
        //                                   {6,7,8,9,0}
        //                                   }
        String[][] employees = new String[5][2];
        employees[0][0] = "Dheeraj";
        employees[0][1] = "Dheeraj@test.com";
        employees[1][0] = "Bhabani";
        employees[1][1] = "Bhabani@test.com";

        String[][] employees2 = {
                {"Dheeraj", "dheeraj@test.com"}, //0 ROW
                //  0            1
                {"Bhabani", "bhabani@test.com"}, //1 ROW
                //  1            1
                {"Santosh", "santosh@test.com"}  //2 ROW
                //  2            1
        };
        System.out.println(employees2[1][1]);
    }
}
