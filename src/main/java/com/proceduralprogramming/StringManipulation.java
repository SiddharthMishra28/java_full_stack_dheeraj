package com.proceduralprogramming;

import java.util.Locale;

public class StringManipulation {
    public static void main(String[] args) {
        // STRING IS IMMUTABLE
        String organization = "Tata Consultancy Services";
        System.out.println(organization.toUpperCase());
        System.out.println(organization.toLowerCase());
        char[] stringChars = organization.toCharArray();
        for(int i=0; i<stringChars.length; i++) {
            System.out.print(stringChars[i]+"_");
        }
        System.out.println();

        char[] mychars = new char[]{'L', 'A', 'M', 'B', 'O', 'R', 'G', 'H', 'I', 'N', 'I'};
        String myData = new String(mychars);
        System.out.println(myData);

        // REVERSE A STRING
        // 1. Convert to a char array
        // 2. Reverse iterate from back to front
        // Store characters and Pass to string constructor
//        String region = "Europe";
//        char[] regionChars = region.toCharArray();
//        char[] reversedRegionChars = new char[regionChars.length];
//        for(int i=regionChars.length-1; i>=0; i--) { // ARE WE COVERING ALL CONDITONS FOR REVERSAL!!
//            reversedRegionChars[i] = regionChars[i];
//        }
//        System.out.println(new String(reversedRegionChars));

        // STRINGBUILDER - MUTABLE - NOT THREAD SAFE!!
        StringBuilder dataBuilder = new StringBuilder("----- INV1001-IND-INR -------");
        dataBuilder.append("Name | Email | Phone\n");
        dataBuilder.append("Sid | sid@email.com | 8302138\n").append("sada").append("asddad");
        System.out.println(dataBuilder);

        // STRINGBUFFER - THREAD SAFE BY DEFAULT!!
        StringBuffer sb = new StringBuffer("My initial buffered string");
        sb.append("another line");
        System.out.println(sb);

    }
}
