package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // INTERFACE_NAME <TYPE_OF_DATA> variable = new IMPLEMENTATION_CLASS
//        List<String> myStringData = new ArrayList<>();
        List<String> myStringData = new LinkedList<>(); // MORE DATA MAKES DIFFERENCE
        myStringData.add("Data 1");
        myStringData.add("Data 2");
        myStringData.add("Data 3");
        myStringData.add(1, "Data_New");
        System.out.println(myStringData);
        System.out.println(myStringData.get(2));
        System.out.println(myStringData.contains("Data_New"));
    }
}
