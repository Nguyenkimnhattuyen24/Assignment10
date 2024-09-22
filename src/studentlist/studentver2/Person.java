
package studentver2;

import java.util.Date;

public abstract class Person {
    private String ID ;
    private String fullName;
    private Date  dateOfBirth;

    public Person(String ID, String fullName, Date dateOfBirth) {
        this.ID = ID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public abstract void displayInfo();

   
    
}
