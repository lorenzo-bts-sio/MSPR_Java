package Controllers;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class agent{
    
    public void reader() throws IOException{

    BufferedReader reader = new BufferedReader(new FileReader("/home/lorenzo/Documents/mspr/java/agents/staff.txt"));

    String line = reader.readLine();


    while(line != null) 
    {

        BufferedReader reader2 = new BufferedReader(new FileReader("/home/lorenzo/Documents/mspr/java/agents/"+line+"/"+line+".txt"));
        String line2 = reader2.readLine();
        while(line2 != null)
        {
            System.out.println(line2);
        }
        

    }
    
    

    
    }

    

}