package com.proceduralprogramming.examples;

public class Student extends Person { // IS-A RELATIONSHIP
    String school;

    public void gotoSchool(String school) {
        this.school = school;
        System.out.println("Going to school "+school);
    }

    public void read(String[] subjects) {
        for(int i=0; i<subjects.length; i++) {
            System.out.println("Completing homework for "+subjects[i]);
        }
    }

    public static void main(String[] args) {
        Student bhabani = new Student();
        bhabani.firstName = "Bhabani";
        bhabani.lastName = "Panda";
        bhabani.age = 24;
        bhabani.weight = 72;
        bhabani.height = 5.7f;
        bhabani.gotoSchool("Dav School");
        bhabani.greet();
        bhabani.read(new String[]{"physics", "maths", "english"});
    }
}
