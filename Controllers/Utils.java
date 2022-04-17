package Controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Utils
{

    public static Runnable htpasswd (String path , Object login , Object password) 
    {
       // String command = "htpasswd "+path+" "+ login+" "+password;
       String command = String.format("touch %s",path);
       String command2 = String.format("htpasswd -db %s %s %s",path,login,password);

        try 
        { 
            Runtime.getRuntime().exec(command);
            Runtime.getRuntime().exec(command2);
            
        }
    
        
        catch (IOException e) 
        {
            System.err.println("erreur dans la commande ");
        }
        return null;
    }

    public  static List reader (String file_name)
        {
		    List<String> list = new ArrayList<>();

		    try (BufferedReader br = Files.newBufferedReader(Paths.get(file_name))) 
            {
			    list = br.lines().collect(Collectors.toList());
            
		    } catch (IOException e) 
            {
			    System.out.println("Erreur le fichier :"+file_name+" est introuvable");
		    }
            return list ;
        }

    // transforme le fichier en equivalent du dico en python et retourne la valeur associer a la clef (passer en paramttre )
    public static  String map (String file_path , Object matos) throws IOException
    {
        HashMap<String, String> map = new HashMap<String, String>();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(file_path));
        while ((line = reader.readLine()) != null)
        {
            String[] parts = line.split(":", 2);
    
            if (parts.length >= 2)
            {
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            } 
            else 
            {
                System.out.println("élément inconue : " + line);
            }
        }
    
        for (String value : map.keySet())
        {
            if(matos.equals(value))
                return map.get(value);
            reader.close();
        }
        reader.close();
        return ""; 
    }

   
    
    
}

