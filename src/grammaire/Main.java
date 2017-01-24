package grammaire;


import java.io.File;
import java.io.FileReader;

import visitor.XMLgenerator;

public class Main {

	
	public static void main(String args[]) throws Exception {
		
		String fichier = "coffeeMachine";
	    ParserB parser = new ParserB(new FileReader(new File("./src/grammaire/b/" + fichier + ".mch")));
	    XMLgenerator g = new XMLgenerator();
	    try {
	    	/* Génération de l'AST */
	    	SimpleNode parserTree = parser.Machine_abstraite();
		    ASTMachine root = (ASTMachine) parser.getRoot();    
		    g.setRoot(root);
		    
	    	g.start();
	    	/* Affichage de l'AST */
	    	System.out.println("\n ***** AST  *****\n");
	    	
	    	/* Méthode Dump de SimpleNode Modifiée pour qu'elle retourne un String */
	    	parserTree.dump("->");
	    	
	    	g.save("./output/" + fichier + ".ebm");
	    } catch(Exception e) {
	    	System.out.println(e.getMessage());
	    	e.printStackTrace();
	    }
	   
	    
	}

}
