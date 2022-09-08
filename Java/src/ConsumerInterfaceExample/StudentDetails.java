package ConsumerInterfaceExample;

public class StudentDetails {
    private String firstName;
    private String lastName;

    public StudentDetails(String firstName,String lastName){
        this.firstName =firstName;
        this.lastName =lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString()
    {

        // Returning attributes of Student
        return this.getFirstName() + " " + this.getLastName() + " ";

    }
}
