package grammaire;


import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String args[]) throws Exception {
		
	    ParserB parser = new ParserB(new FileReader(new File("./src/grammaire/b/coffeeMachine.mch")));
	    
	    try {
	    	/* G�n�ration de l'AST */
	    	@SuppressWarnings("static-access")
	    	SimpleNode parserTree = parser.Start();
	    	
	    	/* Affichage de l'AST */
	    	System.out.println("\n ***** AST  *****\n");
	    	
	    	/* M�thode Dump de SimpleNode Modifi�e pour qu'elle retourne un String */
	    	parserTree.dump("->");
	    	
	    	
	    	//System.out.println(output);
	    
	    } catch(Exception e) {
	    	System.out.println(e.getMessage());
	    	e.printStackTrace();
	    }
	   
	    
	}

}
