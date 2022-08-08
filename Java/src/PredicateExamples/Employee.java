package PredicateExamples;

public class Employee {
    private int id;
    private int age;
    private String gender;
    private String firstName;
    private String lastName;

public Employee(int id,int age,String gender, String firstName,String lastName){
    this.id =id;
    this.age = age;
    this.gender =gender;
    this.firstName =firstName;
    this.lastName = lastName;

}
    public Integer getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String toString()
    {

        // Returning attributes of Student
        return this.getGender() + " " + this.getAge() + " ";

    }
}
