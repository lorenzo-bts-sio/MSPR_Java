import Controllers.Agents;
import Controllers.Index;
import Controllers.utils;

public class main {

public static void main(String[] args) throws Exception 
{
   Index index = new Index();
   Agents agent = new Agents();
   int i = 1 ; 
   for (Object name_agent :utils.reader("/home/lorenzo/Documents/mspr/java/agents/staff.txt"))
   { 
     index.generate_index(name_agent, "/home/lorenzo/Documents/mspr/java/vues/index.html");
     for (Object fiche_agent :utils.reader("/home/lorenzo/Documents/mspr/java/agents/"+name_agent+"/"+name_agent+".txt"))
      {  
        if(i == 1 )
          {
            agent.generate_header_page( fiche_agent, "/home/lorenzo/Documents/mspr/java/vues/"+name_agent+".html","nom",1);
          }
        else if (i ==2)
          {
            agent.generate_header_page( fiche_agent, "/home/lorenzo/Documents/mspr/java/vues/"+name_agent+".html","prenom",1);
          }
        else if (i ==3)
          {
            agent.generate_header_page( fiche_agent, "/home/lorenzo/Documents/mspr/java/vues/"+name_agent+".html","poste",3);
          }
        
        else if (i ==4)
          {
            
          }
        
        else 
        {
          
          agent.generate_header_page(utils.map("/home/lorenzo/Documents/mspr/java/matos/liste.txt",fiche_agent), "/home/lorenzo/Documents/mspr/java/vues/"+name_agent+".html","mastos",3);
        }
        i++;

         
      }
   }

}
}


// class utils qui regroupe les fonction passe partout ( lecture  , ecriture  des fichiers  )
// class index qui permet de crée l'index 