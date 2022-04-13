package Controllers;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Agents{
    
    public  void  generate_header_page(Object ficher_agent , String path_output) throws IOException {

        
        BufferedWriter writer = new BufferedWriter(new FileWriter(path_output, true ));
           
       writer.write("<li><a href=/"+ficher_agent +".html >"  + ficher_agent + "</a> </li> \n");
       writer.write("</ul>");
       writer.flush();
       writer.close();
        
    }
    
    
    }

    

