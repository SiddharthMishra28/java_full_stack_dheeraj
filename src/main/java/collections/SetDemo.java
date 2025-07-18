package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Dheeraj");
        mySet.add("Sid");
        mySet.add("Bhabani");
        mySet.add("Satish");
        mySet.add("Sid");
        mySet.add("Bhabani");
        mySet.add("Satish");
        mySet.add("Sid");
        mySet.add("Bhabani");
        mySet.add("Satish");
        mySet.add("Sid");
        mySet.add("Bhabani");
        mySet.add("Satish");
        System.out.println(mySet); // DOESN'T ALLOW REPETITIONS
    }
}
