package studentlist;

import java.util.ArrayList;
import java.util.Date;

public class StudentList {

    private ArrayList<Student> students;

    public StudentList() {
        this.students = new ArrayList<>();
    }

    public void addStudent(StudentList student) {
        student.addStudent(student);
    }

    public void update(String ID, String Fullname, Date dateOfBirth, float GPA, String major) {
        for (Student student : students) {
            if (student.getID().equals(ID));
            student.setFullname(Fullname);
            student.setDateOfBirth(dateOfBirth);
            student.setGPA(GPA);
            student.setMajor(major);
            return;

        }
        System.out.println("Student with ID :" + ID + "not found");
    }

   

    public void deleteStudent(String ID) {
        students.removeIf(student -> student.getID().equals(ID));
    }
 public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public Student findHighestgpaStudent() {
        if (students.isEmpty()) {
            return null;
        }

        Student highestgpaStudent = students.get(0);
        for (Student student : students) {
            if (student.getGPA() > highestgpaStudent.getGPA()) {
                highestgpaStudent = student;
            }

        }
        return highestgpaStudent;

    }

    void update(String newID, String newname, int newAge, double newGPA, String newMajor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void updateStudent(String newID, String newname, int newAge, double newGPA, String newMajor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
