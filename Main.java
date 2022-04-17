import Controllers.Agents;
import Controllers.Index;
import Controllers.Utils;

public class Main {

public static void main(String[] args) throws Exception 
{
   Index index = new Index();
   Agents agent = new Agents();
   int i = 1 ; 
   int j =1 ; 
   for (Object name_agent :Utils.reader("./agents/staff.txt"))
   { 
     new Thread(index.generate_index(name_agent, "./vues/index.html",j)).start();
     i =1;
     j++;
     for (Object fiche_agent :Utils.reader("./agents/"+name_agent+"/"+name_agent+".txt"))
      { 
        if(i == 1 )
          {
            // champs contenant le nom de la personne 
           new Thread(agent.generate_agent_page( fiche_agent, "./vues/"+name_agent+".html","nom",1, name_agent)).start();;
          }
        else if (i ==2)
          {
            // champs contenant le prenom de la personne 
           new Thread(agent.generate_agent_page( fiche_agent, "./vues/"+name_agent+".html","prenom",1,name_agent)).start();;
          }
        else if (i ==3)
          {
            // champs contenant le poste 
           new Thread(agent.generate_agent_page( fiche_agent, "./vues/"+name_agent+".html","poste",3,name_agent)).start();;
          }
        
        else if (i ==4)
          {
            //champs contenant le mot de passe 
            new Thread(Utils.htpasswd("/var/www/groupe2.com/.htpasswd" , name_agent, fiche_agent));
          }
        
        else 
        {
          // champs contenant la liste du matos pris 
         new Thread(agent.generate_agent_page(Utils.map("./matos/liste.txt",fiche_agent), "./vues/"+name_agent+".html","mastos",3,name_agent)).start();;
        }
        i++;

         
      }
   }
}

}


