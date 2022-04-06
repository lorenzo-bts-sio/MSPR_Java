package Controllers;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class index {

public  void  generate_index() throws IOException{

    BufferedReader reader = new BufferedReader(new FileReader("/home/lorenzo/Documents/mspr/java/agents/staff.txt"));
    BufferedWriter writer = new BufferedWriter(new FileWriter("/home/lorenzo/Documents/mspr/java/vues/index.html"));
    
    String line = reader.readLine();

    writer.write("<img src='/img/logo.jpeg' \n");

    writer.write("<ul> \n");
    while(line != null) {
        
    
        writer.write("<li><a href=/"+line +".html >"  + line + "</a> </li> \n");
        writer.flush();
        BufferedWriter user = new BufferedWriter(new FileWriter("/home/lorenzo/Documents/mspr/java/vues/"+line+".html"));
        

        line = reader.readLine();
    }
    
    writer.write("</ul>");

    reader.close();
    writer.close();

}

}

