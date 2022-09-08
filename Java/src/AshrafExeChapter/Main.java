package AshrafExeChapter;


import javax.swing.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*InstanceCountExample instanceCountExample1 = new InstanceCountExample();
        instanceCountExample1.name = "Babu";

        InstanceCountExample instanceCountExample2 = new InstanceCountExample();
        instanceCountExample2.name = "Karthik";

        InstanceCountExample instanceCountExample3 = new InstanceCountExample();
        instanceCountExample3.name = "Babu";

        InstanceCountExample instanceCountExample4 = new InstanceCountExample();
        instanceCountExample4.name = "Babu";

        System.out.println("class instance count" +instanceCountExample4.instanceCount);
        System.out.println("class scoped variable state count" + InstanceCountExample.count);

        // Arraylist allowed duplicate value  haseSet not allowed duplicate value
        List<InstanceCountExample> instanceCountExampleList = new ArrayList<>();
        instanceCountExampleList.add(instanceCountExample1);
        instanceCountExampleList.add(instanceCountExample2);

        instanceCountExampleList.add(instanceCountExample3);
        instanceCountExampleList.add(instanceCountExample4);

        System.out.println(instanceCountExampleList.size());

        System.out.println(instanceCountExample1.equals( instanceCountExample3 ));

        Set<InstanceCountExample> instanceCountExampleSet = new HashSet<>();
        instanceCountExampleSet.add(instanceCountExample1);
        instanceCountExampleSet.add(instanceCountExample2);

        instanceCountExampleSet.add(instanceCountExample3);
        instanceCountExampleSet.add(instanceCountExample4);


        System.out.println(instanceCountExampleSet.size());*/


        JButton b = new JButton();

            try{
                FileWriter fw=new FileWriter("/home/fazila/Documents/workspace/textFile5.txt");
                fw.write( String.valueOf( b ) );
                fw.close();
            }catch(Exception e){System.out.println(e);}
            System.out.println("Success...");
        }


}
