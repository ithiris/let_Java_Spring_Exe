package HashSetExe;

public class Person {
    String name;

    public Person(String name){
        this.name =name;
    }

    @Override
    public boolean equals(Object person){
        if(!(person instanceof  Person)){
            return  false;
        }

        Person other = (Person) person;
        if(other.name.equals(this.name)){
            return  true;
        }
        return false;
    }
}
