package HashSetExe;

public class Main {
    public static void main(String[] args) {

        String str1 = "123";
       String str2 = "123";
        System.out.println(str1.getClass());
      System.out.println(str1==str2);



      String str3 = new String("123");
     String str4 = new String("123");
        System.out.println(str3.getClass()); // its check the type
      System.out.println(str3 == str4); // it treate the  as primitive
        Person person1 = new Person("ithiris");
        Person person2 = new Person( "ithiris");

        System.out.println(person1.equals(person2));
    }
}
