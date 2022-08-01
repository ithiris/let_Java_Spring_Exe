package SafiExerices.Day5;

public class Person {
    String name;
    int age;
    String relationShip;
    String str = "";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.relationShip = str;

    }

    // method OverLoading
    Person(String name, int age, String relationShip) {
        this.name = name;
        this.age = age;
        this.relationShip = relationShip;


    }

    // method overriding
    @Override
    public String toString() {
        return name + " " + age + " " + relationShip;
    }

}
