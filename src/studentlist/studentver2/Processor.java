package studentver2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\n\t------MENU-------");
                System.out.println("1. Add a new Student");
                System.out.println("2. Update a Student by ID");
                System.out.println("3. Delete a Student by ID");
                System.out.println("4. Display all Students");
                System.out.println("5. Find the Student with the highest GPA");
                System.out.println("6. Scholarship Students");
                System.out.println("7. Total Tuition");
                System.out.println("0. Exit");
                choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1: {
                        System.out.println("Enter ID:");
                        String ID = scanner.nextLine();
                        System.out.println("Enter Fullname:");
                        String fullname = scanner.nextLine();
                        System.out.println("Enter Date of Birth (dd/MM/yyyy):");
                        String dateOfBirthString = scanner.nextLine();
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        Date dateOfBirth = null;
                        try {
                            dateOfBirth = sdf.parse(dateOfBirthString);
                        } catch (ParseException e) {
                            System.out.println("Wrong format");
                            break;
                        }
                        System.out.println("Enter GPA:");
                        float GPA = scanner.nextFloat();
                        scanner.nextLine();
                        System.out.println("Enter Major:");
                        String Major = scanner.nextLine();
                        boolean scholarship = GPA >= 9;
                        Student student = new Student(GPA, Major, Student.getBasic_tuition(), scholarship, ID, fullname, dateOfBirth);
                        studentList.addStudent(student);
                        System.out.println("Student added successfully");
                        break;
                    }
                    case 2: {
                        System.out.println("Enter ID to update:");
                        String newID = scanner.nextLine();
                        System.out.println("Enter Fullname:");
                        String newFullname = scanner.nextLine();
                        System.out.println("Enter Date of Birth (dd/MM/yyyy):");
                        String dateOfBirthString = scanner.nextLine();
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        Date dateOfBirth = null;
                        try {
                            dateOfBirth = sdf.parse(dateOfBirthString);
                        } catch (ParseException e) {
                            System.out.println("Wrong format");
                            break;
                        }
                        System.out.println("Enter GPA:");
                        float GPA = scanner.nextFloat();
                        scanner.nextLine();  // Consume newline
                        boolean hasScholarship = GPA >= 9;
                        System.out.println("Enter Major:");
                        String Major = scanner.nextLine();
                        studentList.updateStudent(GPA, Major, Student.getBasic_tuition(), hasScholarship, newID, newFullname, dateOfBirth);
                        System.out.println("Update successfully");
                        break;
                    }
                    case 3: {
                        System.out.println("Enter ID to delete:");
                        String deleteID = scanner.nextLine();
                        studentList.deleteStudent(deleteID);
                        System.out.println("Student deleted");
                        break;
                    }
                    case 4: {
                        studentList.displayAllStudent();
                        break;
                    }
                    case 5: {
                        Student highestStudent = studentList.findHightestGPAStudent();
                        if (highestStudent != null) {
                            System.out.println("The student with the highest GPA:");
                            highestStudent.displayInfo();
                        } else {
                            System.out.println("No students found.");
                        }
                        break;
                    }
                    case 6: {
                        var scholarshipStudents = studentList.findScholarshipStudent();
                        if (!scholarshipStudents.isEmpty()) {
                            System.out.println("Scholarship Students:");
                            for (Student student : scholarshipStudents) {
                                student.displayInfo();
                            }
                        } else {
                            System.out.println("No scholarship students found.");
                        }
                        break;
                    }
                    case 7: {
                        double totalTuition = studentList.calculateTotalStudent();
                        System.out.println("Total tuition: " + totalTuition);
                        break;
                    }
                    case 0: {
                        System.out.println("Exit");
                        break;
                    }
                    default: {
                        System.out.println("Invalid choice, please try again.");
                        break;
                    }
                }
            } while (choice != 0);
        }
    }
}
