package SafiExerices.Day5;

public class Main {
    public static void main(String[] args) {

        Family ithirisFamily = new Family();
        ithirisFamily.addMembers(new Person( "ithiris",36 ));
        ithirisFamily.addMembers(new Person( "ayisha",30,"wife" ));
        ithirisFamily.addMembers(new Person( "fazila",28 ));
        ithirisFamily.addMembers(new Person( "jesila",39 ));
        ithirisFamily.addMembers(new Person( "yasmeen",54,"mother" ));

        ithirisFamily.greet();

        Family safiFamily = new Family();
        safiFamily.addMembers(new Person( "safi",38 ));
        safiFamily.addMembers(new Person( "roshan",30 ));
        safiFamily.addMembers(new Person( "jamriya",58, "mother" ));
        safiFamily.addMembers(new Person( "sadath",40,"brother" ));
        safiFamily.addMembers(new Person( "sameem",30 ));

        safiFamily.greet();
    }
}
