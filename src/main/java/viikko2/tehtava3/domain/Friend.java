package viikko2.tehtava3.domain;

public class Friend {
    private String firstName;
    private String lastName;

    public Friend(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Friend() {
        this.firstName="";
        this.lastName="";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Friend [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}
