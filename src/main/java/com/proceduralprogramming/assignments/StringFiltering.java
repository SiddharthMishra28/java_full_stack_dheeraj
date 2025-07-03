package com.proceduralprogramming.assignments;

public class StringFiltering {
    //4851EF12G
    public static void main(String[] args) {
//        String alphaNum = "1312sad32sddf43%$$sadad32fgrg43AASDDDER56SVCD2sadas2##RD";
        String alphaNum = "4851EF12G";
        // FILTER OUT ALPHABETS
        char[] myChars = alphaNum.toCharArray();
        for(int i=0; i<myChars.length; i++) {
            if(((int)myChars[i] >= 65 && (int)myChars[i] <= 90) || ((int)myChars[i] >= 97 && (int)myChars[i] <= 122)) {
//                System.out.print(myChars[i]);
            }else {
                System.out.println(myChars[i]);
            }
        }
    }
}
