package SafiExerices.Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {
 List<Member> memberList = new ArrayList<>();
 String name;
 int age;

   public Member(String name, int age){
    this.name = name;
    this.age = age;
    }
 public Member() {}
    public void addMembers(Scanner input){
     System.out.println("Please Enter the name");
     name = input.next();
     System.out.println("Please Enter the age");
     age = input.nextInt();
     memberList.add(new Member(name, age));
    }
    public void greetAll(){
     memberList.forEach(member -> System.out.println("Name : " + member.name + ", Age : " + member.age));
    }
}
