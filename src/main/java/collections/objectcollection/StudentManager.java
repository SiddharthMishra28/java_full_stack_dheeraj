package collections.objectcollection;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class StudentManager {
    public static void main(String[] args) {
        College college = new College();
        college.setCollegeName("ABC College");
        college.setInTime("10AM");
        college.setOutTime("5PM");
        college.setLocation("Pune");

        Branch entc = new Branch();
        entc.setbName("Electronics and Telecomm");
        entc.setbCode("ENTC25");

        Branch mech = new Branch();
        mech.setbName("Mechanical Engineering");
        mech.setbCode("MECH25");

        Student dheeraj = new Student();
        dheeraj.setName("Dheeraj");
        dheeraj.setPhone("38210381");
        dheeraj.setRollNo(1);

        Student sid = new Student();
        sid.setName("Sid");
        sid.setPhone("38210381");
        sid.setRollNo(2);

        Student satish = new Student();
        satish.setName("Satish");
        satish.setPhone("38210381");
        satish.setRollNo(3);

//        List<Student> entcStudents = new LinkedList<>();
//        entcStudents.add(dheeraj);
//
//        entc.setStudentList(entcStudents);
        entc.setStudentList(List.of(dheeraj));
        mech.setStudentList(List.of(satish, sid));

        college.setBranchSet(Set.of(entc, mech));

        System.out.println(college);
    }
}
