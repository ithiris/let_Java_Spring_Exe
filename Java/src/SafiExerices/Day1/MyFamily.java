package SafiExerices.Day1;

import java.util.ArrayList;

public class MyFamily {

    static ArrayList<Person> families = new ArrayList<Person>();

    public static ArrayList<Person> showMyfamilyMembersDetails() {
        families.add( new Person("ithiris",36,"chennai","me" ));
        families.add( new Person("fazila",30,"ramanadapuram","sister" ));
        families.add( new Person("jesila",39,"tutocorin","sister" ));
        families.add( new Person("yasmeen",54,"eral","mother" ));
        families.add( new Person("yosuf",60,"eral","father" ));
        return families;
    }


}
