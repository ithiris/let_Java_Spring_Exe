package CollectionSortExe;

public class Student {
    int rollNo;
    String name;
    String address;

    // Constructor
    public Student(int rollNo, String name, String address) {
        // This keyword refers to current instance itself
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    // Method of Student class
    // To print student details in main()
    public String toString()
    {

        // Returning attributes of Student
        return this.rollNo + " " + this.name + " "
                + this.address;
    }

}
