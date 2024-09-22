
package studentlist;

import com.sun.tools.javac.Main;
import java.lang.invoke.MethodHandles;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person{
    float GPA;
    String major;

    public Student(String ID ,String Fullname,Date dateOfBirth,float GPA , String major) {
        super(ID,Fullname,dateOfBirth);
        this.GPA = GPA;
        this.major = major;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void displayInfo(){
        System.out.println("Nhap ID:"+ getID());
        System.out.println("Nhap Fullname :"+ getFullname());
        System.out.println("Nhap date :"+getDateOfBirth());
        System.out.println("Nhap GPA :"+getGPA());
        System.out.println("Nhap major :"+getMajor());
    }
    
 
//    public static void addStudent() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap ID:");
//        
//        String ID = scanner.nextLine();
//        System.out.println("Nhap Fullname :");
//        String Fullname = scanner.nextLine();
//        String dateOfbithString = scanner.nextLine();
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//            Date dateOfBirth = sdf.parse(dateOfbithString);
//            setDateOfbirth(dateOfBirth);
//        } catch (Exception e) {
//            System.out.println("Wrong Format");
//        } 
//        
//    }
    
    
  
    }
    
    
    
    
