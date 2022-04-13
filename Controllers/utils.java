package Controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class utils 
{

    public  static List reader (String path)
        {
            String fileName = path;
		    List<String> list = new ArrayList<>();

		    try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) 
            {
			    list = br.lines().collect(Collectors.toList());
            
		    } catch (IOException e) 
            {
			    System.out.println("Erreur le fichier :"+path+" est introuvable");
		    }
            return list ;
        }

    // transforme le fichier en equivalent du dico en python 
    public static  String map (String path , Object matos) throws IOException
    {
        String filePath = path;
        HashMap<String, String> map = new HashMap<String, String>();
    
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null)
        {
            String[] parts = line.split(":", 2);
    
            if (parts.length >= 2)
            {
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            } else {
                System.out.println("ligne ignorer : " + line);
            }
        }
    
        for (String value : map.keySet())
        {
            
            if(matos.equals(value))
                return map.get(value);
                reader.close();
        }
        reader.close();
        return null;
    }

    
    
}

