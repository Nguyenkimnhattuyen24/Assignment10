
package studentlist;

import java.util.Date;

public abstract class Person {
    private String ID;
    private String Fullname;
    private Date dateOfBirth;

    public Person(String ID, String Fullname, Date dateOfBirth) {
        this.ID = ID;
        this.Fullname = Fullname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
 
        
    
}
