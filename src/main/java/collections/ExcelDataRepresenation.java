package collections;

import java.util.*;

public class ExcelDataRepresenation {
    public static void main(String[] args) {
//        Map<String, String> employeesData = new TreeMap<>();
//        employeesData.put("sid", "sid@test.com");
//        employeesData.put("phone", "382032"); // WILL BE LOST
//        employeesData.put("salary", "20000");
//        employeesData.put("dheeraj", "dheeraj@gmail.com");
//        employeesData.put("phone", "232132");
//        System.out.println(employeesData);

//        List<String> myList = new ArrayList<>();
//        myList.add("sid");
//        myList.add("sid@test.com");
//        myList.add("329213");
//        myList.add("dheeraj");
//        myList.add("dheeraj@gmail.com");
//        myList.add("32133123");
//        System.out.println(myList); // CAN USE CONTAINS TO READ AND MATCH

        // COMPOSITE COLLECTIONS
        List<Map<String, String>> myData = new ArrayList<>();
        Map<String, String> row1 = new HashMap<>();
        row1.put("name", "sid");
        row1.put("email", "sid@test.com");
        row1.put("phone", "8210398213");

        Map<String, String> row2 = new HashMap<>();
        row2.put("name", "dheeraj");
        row2.put("email", "dheeraj@gmail.com");
        row2.put("phone", "3213213");

        Map<String, String> row3 = new HashMap<>();
        row3.put("name", "satish");
        row3.put("email", "satish@hotmail.com");
        row3.put("phone", "2132132121");

        myData.add(row1);
        myData.add(row2);
        myData.add(row3);
        System.out.println(myData);
        System.out.println(myData.get(0).get("phone"));

        // REPRESENT AN ENTIRE EXCEL SHEET INTO A COMPOSITE COLLECTION
        // TARGET INDIVIDUAL SHEETS
        // FROM INDIVIDUAL SHEETS YOU SHOULD BE ABLE TO RETRIEVE INDIVIDUAL ROWS AND CELLS
    }
}
