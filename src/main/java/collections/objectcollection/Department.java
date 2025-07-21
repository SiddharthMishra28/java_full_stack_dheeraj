package collections.objectcollection;

import java.util.List;

public class Department {
    private int id;
    private String name;
    private String lead;
    private List<Employee> employeeList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public static void main(String[] args) {
        Department d = new Department();

    }
}
