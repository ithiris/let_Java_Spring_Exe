package SafiExerices.Day1;

public class Person {
    private String name;
    private int age;
    private String place;
    private String relationShip;



    public Person(String name,int age,String place,String relationShip){
        this.name = name;
        this.age = age;
        this.place = place;
        this.relationShip = relationShip;
    }

    @Override
    public String toString() {
        return name + ": " + "{" + age + "," + place + "," + relationShip + "}";
    }
}
