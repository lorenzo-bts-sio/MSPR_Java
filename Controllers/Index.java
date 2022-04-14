package Controllers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Index  {
    
public  void  generate_index(Object name_agent , String path_output) throws IOException {

    BufferedWriter writer = new BufferedWriter(new FileWriter(path_output, true));
       
    writer.write("<li><a href=/"+name_agent +".html >"  + name_agent + "</a> </li> \n");
    writer.write("</ul>");
    writer.flush();
    writer.close();


    BufferedWriter view_agent = new BufferedWriter(new FileWriter("/home/lorenzo/Documents/mspr/java/vues/"+name_agent+".html"));
    view_agent.close();

}
}







