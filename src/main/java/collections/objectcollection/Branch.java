package collections.objectcollection;

import java.util.List;

public class Branch {
    private String bName;
    private String bCode;
    private List<Student> studentList;

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbCode() {
        return bCode;
    }

    public void setbCode(String bCode) {
        this.bCode = bCode;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "bName='" + bName + '\'' +
                ", bCode='" + bCode + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
