public class User {

    private String firstname;
    private String lastname;



    public String setFirstName(String name) {
        return this.firstname = name;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String setLastName(String name) {
        return this.lastname = name;
    }

    public String getLastName() {
        return this.lastname;
    }

    public String getFullname() {
        return this.firstname + " " + this.lastname;
    }
}
