package Controllers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Index {
    
public  Runnable  generate_index(Object name_agent , String path_output,  int number ) throws IOException {

    BufferedWriter writer = new BufferedWriter(new FileWriter(path_output, true));
    
    if (number == 1)
    {
    writer.write("<!DOCTYPE html>\n"
           + "<html lang='fr'>\n"
           + "<head>\n"
           + "<meta charset='utf-8'>\n"
           + "<meta http-equiv='X-UA-Compatible' content='IE=edge'>\n"
           + "<meta name='viewport' content='width=device-width, initial-scale=1'>\n"
           + "<title>index</title>\n"      
           + "<link rel='stylesheet' href='./style.css'>\n"
           + "</head>\n"
           + "<body>\n"
          
            );
    }
    else 
    {
        writer.write("<li><a href=/"+name_agent +".html >"  + name_agent + "</a> </li> \n");
        writer.write("</ul>");
    }
    writer.flush();
    writer.close();


    BufferedWriter view_agent = new BufferedWriter(new FileWriter("./vues/"+name_agent+".html"));
    view_agent.close();
    
    return null;

}
}







