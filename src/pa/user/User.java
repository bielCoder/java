package pa.user;

public class User {
    private String firstname;
    private String lastname;

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String setLastname(String lastname) {
        return this.lastname = lastname;
    }

    public String output() {
        return firstname + " " + lastname;
    }

    public String output(boolean showLastName) {
        if(showLastName)
        {
            return output();
        } else {
            return firstname;
        }
    }


    public String toString()
    {
        return "User {" + "firstname:" + firstname + ", lastname:" + lastname + '}';
    }

}