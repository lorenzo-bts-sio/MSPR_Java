package Controllers;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Agents{
    
    public  void  generate_agent_page(Object ficher_agent , String path_output , String name_div , int number) throws IOException {

        
        BufferedWriter writer = new BufferedWriter(new FileWriter(path_output, true ));
       
       if (name_div=="nom")
       {
        writer.write("<!DOCTYPE html> \n"
           + "<html lang='fr'>\n"
           + "<head>\n"
           + "<meta charset='utf-8'>\n"
           + "<meta http-equiv='X-UA-Compatible' content='IE=edge'>\n"
           + "<meta name='viewport' content='width=device-width, initial-scale=1'>\n"
           + "<title>"+ficher_agent+"</title>\n"      
           + "<link rel='stylesheet' href='styles.css'>\n"
           + "</head>\n"
           + "<body>\n"
           + "<button onclick='window.location.href='/'>Retour</button>\n"

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
        
    }
    
    
    }

    

