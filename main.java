import Controllers.agent;
import Controllers.index;

public class main {

public static void main(String[] args) throws Exception {
    index index = new index() ;
    index.generate_index(); 
    agent agent = new agent();
    agent.reader(); 
}

}