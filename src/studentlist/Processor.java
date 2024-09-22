package studentlist;

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
                System.out.println("\n\t-------MENU-------");
                System.out.println("1.Add a new Student :");
                System.out.println("2.Update a Student by ID: ");
                System.out.println("3.Delete a Student by ID :");
                System.out.println("4.Display all Student:");
                System.out.println("5.Find the Student with the highest GPA :");
                System.out.println("0.Exit!");
                System.out.println("Enter your choice :");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Nhap ID");
                        String ID = scanner.nextLine();
                        System.out.println("Nhap Fullname:");
                        String Fullname = scanner.nextLine();
                        System.out.println("Date of birth = ");
                        
                        String dateOfbithString = scanner.nextLine();
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        Date dateOfBirth = null;
                        try {
                            dateOfBirth = sdf.parse(dateOfbithString);
                            
                        } catch (ParseException e) {
                            System.out.println("Wrong Format");
                            break;
                        }
                        System.out.println("GPA :");
                        double GPA = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Major :");
                        String major = scanner.nextLine();
                        
                        break;

                    //Update Student
                    case 2:
                        System.out.println("Enter student ID to update :   ");
                        String updateID = scanner.nextLine();
                        System.out.println("Enter New Student name :");
                        String newname = scanner.nextLine();
                        System.out.println("Enter DateOfBirth :");
                        String newdateOfbithString = scanner.nextLine();
                        SimpleDateFormat sdfupdate = new SimpleDateFormat("dd/MM/yyyy");
                        Date newdateOfBirth = null;
                        try {
                            newdateOfBirth = sdfupdate.parse(newdateOfbithString);
                            
                        } catch (ParseException e) {
                            System.out.println("Wrong Format");
                            break;
                        }
//                    System.out.println("Enter new age :");
//                    int newAge = scanner.nextInt();
                        System.out.println("Enter new GPA student :");
                        double newGPA = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Enter new Major :");
                        String newMajor = scanner.nextLine();
                        scanner.nextLine();
//                    studentList.updateStudent(updateID, newname, newGPA, newMajor);
                        studentList.updateStudent(updateID, newname, choice, newGPA, newMajor);
                        System.out.println("Update successfully");
                        break;
                    
                    case 3:
                        System.out.println("EnterStudent to delete :");
                        String deleteID = scanner.nextLine();
                        studentList.deleteStudent(deleteID);
                        break;
                    case 4:
                        studentList.displayAllStudents();
                        break;
                    case 5:
                        Student highestGPAStudent = studentList.findHighestgpaStudent();
                        if (highestGPAStudent != null) {
                            System.out.println("Student with the highest GPA");
                            highestGPAStudent.displayInfo();
                        } else {
                            System.out.println("No student");
                        }
                        break;
                    case 0:
                        System.out.println("Exit ");
                        break;
                    default:
                        System.out.println("Try again");
                        break;
                }
                
            } while (choice != 0);
        }
        
    }
    
}
