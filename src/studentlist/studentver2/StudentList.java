package studentver2;

import java.util.ArrayList;
import java.util.Date;

public class StudentList {

    private ArrayList<Student> students;

    public StudentList() {
        this.students = new ArrayList<>();
    }

    public StudentList(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // add student
    public void addStudent(Student student) {
        students.add(student);
    }

    // update student
    public void updateStudent(float GPA, String Major, double tuition, boolean scholarship, String ID, String fullName, Date dateOfBirth) {
        for (Student student : students) {
            if (student.getID().equals(ID)) {
                student.setFullName(fullName);
                student.setDateOfBirth(dateOfBirth);
                student.setGPA(GPA);
                student.setMajor(Major);
                student.setTuition(tuition);
                student.setScholarship(scholarship);
                return;
            }
        }
        System.out.println("Student with ID: " + ID + " not found");
    }

    // delete student
    public void deleteStudent(String ID) {
        students.removeIf(student -> student.getID().equals(ID));
    }

    // display all students
    public void displayAllStudent() {
        for (Student student : students) {
            student.displayInfo();
        }
    }

    // find the student with the highest GPA
    public Student findHightestGPAStudent() {
        if (students.isEmpty()) {
            return null;
        }
        Student highestGPAStudent = students.get(0);
        for (Student student : students) {
            if (student.getGPA() > highestGPAStudent.getGPA()) {
                highestGPAStudent = student;
            }
        }
        return highestGPAStudent;
    }

    // find students with a scholarship
    public ArrayList<Student> findScholarshipStudent() {
        ArrayList<Student> scholarshipStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.isScholarship()) {
                scholarshipStudents.add(student);
            }
        }
        return scholarshipStudents;
    }

    // calculate total tuition of all students
    public double calculateTotalStudent() {
        double totalTuition = 0;
        for (Student student : students) {
            totalTuition += student.getTuition();
        }
        return totalTuition;
    }
}
