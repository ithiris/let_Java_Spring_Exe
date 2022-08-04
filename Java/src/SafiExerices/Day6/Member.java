package SafiExerices.Day6;

import java.util.ArrayList;
import java.util.List;

public class Member {
 List<Member> memberList = new ArrayList<>();
 String name;
 int age;

   public Member(String name, int age){
    this.name = name;
    this.age = age;
    }
 public Member() {}
    public void addMembers(String name,int age){
       this.name = name;
       this.age = age;
     memberList.add(new Member(name, age));
    }
    public void greetAll(){
     memberList.forEach(member -> System.out.println("Name : " + member.name + ", Age : " + member.age));
    }
}
