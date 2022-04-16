package Controllers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Index  {
    
public  void  generate_index(Object name_agent , String path_output) throws IOException {

    BufferedWriter writer = new BufferedWriter(new FileWriter(path_output, true));
    
    writer.write("<!DOCTYPE html>"
           + "<html lang='fr'>"
           + "<head>"
           + "<meta charset='utf-8'>"
           + "<meta http-equiv='X-UA-Compatible' content='IE=edge'>"
           + "<meta name='viewport' content='width=device-width, initial-scale=1'>"
           + "<title>index</title>"      
           + "<link rel='stylesheet' href='./style.css'>"
           + "</head>"
           + "<body>"
          
            );
    writer.write("<li><a href=/"+name_agent +".html >"  + name_agent + "</a> </li> \n");
    writer.write("</ul>");
    writer.flush();
    writer.close();


    BufferedWriter view_agent = new BufferedWriter(new FileWriter("./vues/"+name_agent+".html"));
    view_agent.close();

}
}







