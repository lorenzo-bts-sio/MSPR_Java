package Controllers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Agents {
    
    public  Runnable  generate_agent_page(Object ficher_agent , String path_output , String name_div , int number, Object name_agent) throws IOException {

        
        BufferedWriter writer = new BufferedWriter(new FileWriter(path_output, true ));
       
       if (name_div=="nom")
       {
        String path_id_card = "./img/logo.jpeg";
        writer.write("<!DOCTYPE html> \n"
           + "<html lang='fr'>\n"
           + "<head>\n"
           + "<meta charset='utf-8'>\n"
           + "<meta http-equiv='X-UA-Compatible' content='IE=edge'>\n"
           + "<meta name='viewport' content='width=device-width, initial-scale=1'>\n"
           + "<title>"+name_agent+"</title>\n"      
           + "<link rel='stylesheet' href='./style.css'>"
           + "</head>\n"
           + "<body>\n"
           + "<button onclick=window.location.href='/index.html'>Retour</button>\n"
           + "<div Class ='carte-id'> <img src="+path_id_card+"</div> \n"
           + "<div Class ="+ficher_agent+"> <h1>"+ficher_agent+"</h1>\n"

            );
       }
        else if (name_div =="poste")
       {
            writer.write("<h2> Poste : </h2> <div Class="+name_div+"> <h"+number+">"+ficher_agent+"</h"+number+"> </div> <h2> Liste du matériel pris  : </h2> \n");
       }
       else
        {
            writer.write("<div Class="+name_div+"> <h"+number+">"+ficher_agent+"</h"+number+"> </div> \n");
        }
       
       writer.flush();
       writer.close();
    return null;
        
    }
    
    
    
}

    

