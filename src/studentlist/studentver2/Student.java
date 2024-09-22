package studentver2;

import java.util.Date;

public class Student extends Person implements IPerson {
    private float GPA;
    private String Major;
    private double tuition;
    private boolean scholarship;
    private static final double Basic_tuition = 10000000;

    public Student(float GPA, String Major, double tuition, boolean scholarship, String ID, String fullName, Date dateOfBirth) {
        super(ID, fullName, dateOfBirth);
        this.GPA = GPA;
        this.Major = Major;
        this.tuition = tuition;
        this.scholarship = scholarship;
        calculateTuition();
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
        calculateTuition();  // Recalculate tuition if GPA changes
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

    public static double getBasic_tuition() {
        return Basic_tuition;
    }

    // Calculate tuition based on GPA
    public void calculateTuition() {
        if (GPA >= 9.0) {
            this.tuition = Basic_tuition * 0.5;
        } else {
            this.tuition = Basic_tuition;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getID());
        System.out.println("Fullname: " + getFullName());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("GPA: " + GPA);
        System.out.println("Major: " + Major);
        System.out.println("Tuition: " + tuition);
        System.out.println("Scholarship: " + (scholarship ? "Yes" : "No"));
    }
}
