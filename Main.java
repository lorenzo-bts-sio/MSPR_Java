import Controllers.Agents;
import Controllers.Index;
import Controllers.Utils;

public class Main {

public static void main(String[] args) throws Exception 
{
   Index index = new Index();
   Agents agent = new Agents();
   int i = 1 ; 
   for (Object name_agent :Utils.reader("/home/lorenzo/Documents/mspr/java/agents/staff.txt"))
   { 
     index.generate_index(name_agent, "/home/lorenzo/Documents/mspr/java/vues/index.html"); 
     i =1;
     for (Object fiche_agent :Utils.reader("/home/lorenzo/Documents/mspr/java/agents/"+name_agent+"/"+name_agent+".txt"))
      { 
        if(i == 1 )
          {
            // champs contenant le nom de la personne 
            agent.generate_agent_page( fiche_agent, "/home/lorenzo/Documents/mspr/java/vues/"+name_agent+".html","nom",1);
          }
        else if (i ==2)
          {
            // champs contenant le prenom de la personne 
            agent.generate_agent_page( fiche_agent, "/home/lorenzo/Documents/mspr/java/vues/"+name_agent+".html","prenom",1);
          }
        else if (i ==3)
          {
            // champs contenant le poste 
            agent.generate_agent_page( fiche_agent, "/home/lorenzo/Documents/mspr/java/vues/"+name_agent+".html","poste",3);
          }
        
        else if (i ==4)
          {
            // champs contenant le mot de passe 
          }
        
        else 
        {
          // champs contenant la liste du matos pris 
          agent.generate_agent_page(Utils.map("/home/lorenzo/Documents/mspr/java/matos/liste.txt",fiche_agent), "/home/lorenzo/Documents/mspr/java/vues/"+name_agent+".html","mastos",3);
        }
        i++;

         
      }
   }

}

}


