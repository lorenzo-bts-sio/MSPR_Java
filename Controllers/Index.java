package Controllers;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.WriteAbortedException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.sound.sampled.Line;


public class Index  {
    
public  void  generate_index(Object name_agent , String path_output) throws IOException {

    BufferedWriter writer = new BufferedWriter(new FileWriter(path_output, true));
       
    writer.write("<li><a href=/"+name_agent +".html >"  + name_agent + "</a> </li> \n");
    writer.write("</ul>");
    writer.flush();
    writer.close();


    BufferedWriter view_agent = new BufferedWriter(new FileWriter("/home/lorenzo/Documents/mspr/java/vues/"+name_agent+".html"));
    view_agent.close();

}

public  void  generate_page(String path_input , BufferedWriter output) throws IOException{

   BufferedReader input = new BufferedReader(new FileReader(path_input));
   // BufferedWriter writer = new BufferedWriter(new FileWriter(path_output));

    String line = input.readLine();

    output.write(line+"\n");
    output.flush();
    output.close();


}

public List reader (String path)
{
    String fileName = path;
		List<String> list = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

			//br returns as stream and convert it into a List
			list = br.lines().collect(Collectors.toList());
            

		} catch (IOException e) {
			e.printStackTrace();
		}
	
		//list.forEach(System.out.println(list.toLowerCase()));
        return list ;

        

	}
}





