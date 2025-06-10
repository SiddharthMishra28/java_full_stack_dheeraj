package com.proceduralprogramming.examples;

import java.util.Scanner;

public class ErollmentPortalArrays {
    public static void main(String[] args) {
        System.out.println("############ WELCOME TO ENROLLMENT PORTAL ############");
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students you wish to enroll:");
        count = sc.nextInt();
        sc.nextLine(); // TO CONSUME THE /n or ENTER KEY CHARACTER
        String[][] studentData = new String[count][3];
        for(int i=0; i<count; i++) {
            System.out.println("Enter Name of Student "+(i+1));
            studentData[i][0] = sc.nextLine();
            System.out.println("Enter Email of Student "+(i+1));
            studentData[i][1] = sc.nextLine();
            System.out.println("Enter Phone Number of Student "+(i+1));
            studentData[i][2] = sc.nextLine();
        }
        System.out.println("Current Student Directory Data:");
        for(int j=0; j<count; j++) {
            for(int k=0; k<3; k++){
                System.out.print(studentData[j][k]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
