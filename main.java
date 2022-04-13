
import java.util.ArrayList;
import java.util.List;

import Controllers.Agents;
import Controllers.Index;
import Controllers.utils;

public class main {

public static void main(String[] args) throws Exception 
{
   Index index = new Index();
   Agents agent = new Agents();
   int i = 0 ; 
  // utils.map("/home/lorenzo/Documents/mspr/java/matos/liste.txt");
   for (Object name_agent :utils.reader("/home/lorenzo/Documents/mspr/java/agents/staff.txt"))
   { 
     System.out.println(name_agent);
     index.generate_index(name_agent, "/home/lorenzo/Documents/mspr/java/vues/index.html");
     for (Object fiche_agent :utils.reader("/home/lorenzo/Documents/mspr/java/agents/"+name_agent+"/"+name_agent+".txt"))
      {  
        if ( i < 3) 
        {
          System.out.println(fiche_agent);
          agent.generate_header_page( fiche_agent, "/home/lorenzo/Documents/mspr/java/vues/"+name_agent+".html");

        }

         
      }
   }

}
}


// class utils qui regroupe les fonction passe partout ( lecture  , ecriture  des fichiers  )
// class index qui permet de crée l'index 