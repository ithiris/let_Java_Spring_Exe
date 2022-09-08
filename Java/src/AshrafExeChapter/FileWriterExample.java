package AshrafExeChapter;

import javax.swing.*;
import java.io.FileWriter;

public class FileWriterExample {
    private String line;
    JButton b = new JButton(line);
    public void setOfFiles(){
        try{
        FileWriter fw=new FileWriter("/home/fazila/Documents/workspace/textFile5.txt");
        fw.write( String.valueOf( b ) );
        fw.close();
    }catch(Exception e){System.out.println(e);}
          System.out.println("Success...");
}
}
