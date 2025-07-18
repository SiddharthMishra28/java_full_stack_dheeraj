package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> studentRecords = new HashMap<>();
        studentRecords.put(1, "Dheeraj");
        studentRecords.put(2, "Bhabani");
        studentRecords.put(3, "Satish");
        System.out.println(studentRecords);
        System.out.println(studentRecords.get(3));
    }
}
