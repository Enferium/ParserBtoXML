package visitor;

import java.io.FileOutputStream;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import grammaire.*;

public class XMLgenerator implements ParserBVisitor {

	private Element racine = new Element("MACHINE");
	private Document document = new Document(racine);
	private Node root;

	public XMLgenerator() {

	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void start() throws ParserBException {
		root.jjtAccept(this, null);
	}

	public void save(String file) {
		try {
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(document, new FileOutputStream(file));
		} catch (java.io.IOException e) {
			System.out.println("Problème dans la sauvegarde du fichier XML");
			e.printStackTrace();
		}
	}

	public Object visit(SimpleNode node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTIdent_ren node, Object data) throws ParserBException {
		if (data.toString().contains("EVENT")) {
			Attribute val = new Attribute("name", node.getIdent());
			((Element) data).setAttribute(val);
		} else {
			Element var = new Element("CVariable");
			((Element) data).addContent(var);
			Attribute val = new Attribute("val", node.getIdent());
			var.setAttribute(val);
		}
	
		return null;
	}

	public Object visit(ASTMachine node, Object data) throws ParserBException {
		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) { // visit clauses
			node.jjtGetChild(i).jjtAccept(this, data);
			i++;
		}
		return null;
	}

	public Object visit(ASTEnTete node, Object data) throws ParserBException {
		Attribute name = new Attribute("name", node.getIdent());
		racine.setAttribute(name);
		return null;
	}

	public Object visit(ASTConstraints node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSets node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTEnsemble node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTConcreteConstants node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTAbstractConstants node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTProperties node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTValues node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTValue node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTConcreteVariables node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTAbstractVariables node, Object data) throws ParserBException {
		Element vars = new Element("VARIABLES");
		racine.addContent(vars);

		int i = 0;
		while (i < node.jjtGetNumChildren()) { // visit liste ident
			node.jjtGetChild(i).jjtAccept(this, vars);
			i++;
		}
		return null;
	}

	public Object visit(ASTInvariant node, Object data) throws ParserBException {
		Element inv = new Element("INVARIANT");
		racine.addContent(inv);

		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, inv);
			i++;
		}

		return null;
	}

	public Object visit(ASTInitialisation node, Object data) throws ParserBException {
		Element init = new Element("INITIALISATION");
		racine.addContent(init);

		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, init);
			i++;
		}
		return null;
	}

	public Object visit(ASTOperations node, Object data) throws ParserBException {
		Element evnts = new Element("EVENTS");
		racine.addContent(evnts);

		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, evnts);
			i++;
		}
		return null;
	}

	public Object visit(ASTOperation node, Object data) throws ParserBException {
		Element evnt = new Element("EVENT");
		((Element) data).addContent(evnt);

		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, evnt);
			i++;
		}
		return null;
	}

	public Object visit(ASTEnteteOperation node, Object data) throws ParserBException {
		node.jjtGetChild(0).jjtAccept(this, data);
		return null;
	}

	public Object visit(ASTTerme node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTTermeSimple node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTEntier_Lit node, Object data) throws ParserBException {
		Element num1 = new Element("CNumber");
		((Element) data).addContent(num1);

		Attribute val1 = new Attribute("val", "" + node.getVal());
		num1.setAttribute(val1);
		return null;
	}

	public Object visit(ASTBoolean_Lit node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTTerme_record node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTExpr_tableau node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTCondition node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTEqual node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTNotEqual node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTLessThan node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTGreatherThan node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTLessThanOrEqual node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTGreatherThanOrEqual node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTNot node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTAnd node, Object data) throws ParserBException {
		Element and = new Element("CAnd");
		((Element) data).addContent(and);
		
		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			System.out.println(node.jjtGetChild(i).getClass());
			node.jjtGetChild(i).jjtAccept(this, and);
			i++;
		}
		return null;
	}

	public Object visit(ASTOr node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTInstruction node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTInstruction_corps_operation node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTInstruction_bloc node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTInstruciton_variable_locale node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTInstruction_devient_egal node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTInstruction_appel_operation node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTInstruction_sequence node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTInstruction_conditionnelle node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTInstruction_cas node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution_tant_que node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTInstruction_assertion node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTpredicat node, Object data) throws ParserBException {
		int i = 0;
		while (i < node.jjtGetNumChildren()) {
			node.jjtGetChild(i).jjtAccept(this, data);
			i++;
		}
		return null;
	}

	public Object visit(ASTUnion node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTImplication node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTEquivalence node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPredicat_parenthese node, Object data) throws ParserBException {
		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, data);
			i++;
		}
		return null;
	}

	public Object visit(ASTPredicat_Negation node, Object data) throws ParserBException {
		Element neg = new Element("CNot");
		((Element) data).addContent(neg);
		
		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, neg);
			i++;
		}
		return null;
	}

	public Object visit(ASTPredicat_Universel node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPredicat_Existentiel node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPredicat_Egalite node, Object data) throws ParserBException {
		Element eq = new Element("CEqual");
		((Element) data).addContent(eq);
		
		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, eq);
			i++;
		}
		return null;
	}

	public Object visit(ASTPredicat_Inegalite node, Object data) throws ParserBException {
		Element diff = new Element("CDifferent");
		((Element) data).addContent(diff);
		
		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, diff);
			i++;
		}
		return null;
	}

	public Object visit(ASTPredicat_Appartenance node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPredicat_Not_Appartenance node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPredicat_Inclusion node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPredicat_Insclusion_Stricte node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPredicat_Non_Inclusion node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPredicat_Non_Inclusion_Stricte node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPredicat_Inferieur_Ou_Egal node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPredicat_Strictement_Inferieur node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPredicat_Strictement_Superieur node, Object data) throws ParserBException {
		Element gt = new Element("CGreater");
		((Element) data).addContent(gt);
		
		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, gt);
			i++;
		}
		return null;
	}

	public Object visit(ASTPredicat_Superieur_Ou_Egal node, Object data) throws ParserBException {
		Element gte = new Element("CGreaterOrEqual");
		((Element) data).addContent(gte);
		
		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, gte);
			i++;
		}
		return null;
	}

	public Object visit(ASTExpression node, Object data) throws ParserBException {
		int i = 0;
		while (i < node.jjtGetNumChildren()) {
			node.jjtGetChild(i).jjtAccept(this, data);
			i++;
		}
		return null;
	}

	public Object visit(ASTFonction_partielle node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTFonction_totale node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTInjection_partielle node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTInjection_totale node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSurjection_partielle node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSurjection_totale node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTBijection_totale node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTCouple node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTExpression_primaire node, Object data) throws ParserBException {
		node.jjtGetChild(0).jjtAccept(this, data);
		return null;
	}

	public Object visit(ASTExpression_booleenne node, Object data) throws ParserBException {
		node.jjtGetChild(0).jjtAccept(this, data);
		return null;
	}

	public Object visit(ASTExprArith node, Object data) throws ParserBException {
		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, data);
			i++;
		}
		return null;
	}

	public Object visit(ASTMoinsUnaire node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSuccesseur node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPredecesseur node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTMaximum node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTMinimum node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTCardinal node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSomme_generalisee node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTProduit_generalisee node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTAddition node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSoustraction node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTProducion node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTDivision node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTModulo node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPuissance node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTExpression_d_ensembles node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTConstruction_d_ensembles node, Object data) throws ParserBException {
		int i = 0;
		while (i < node.jjtGetNumChildren()) {
			node.jjtGetChild(i).jjtAccept(this, data);
			i++;
		}
		return null;
	}

	public Object visit(ASTEnsComprehension node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTUnion_generalisee node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTIntersection_generalisee node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTUnion_quantifiee node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTIntersection_quantifiee node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTProduit_ensemble node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTIntervalle node, Object data) throws ParserBException {
		Element dom = new Element("CDomain");
		racine.addContent(dom);

		node.jjtGetChild(0).jjtAccept(this, dom);
		node.jjtGetChild(1).jjtAccept(this, dom);
		return null;
	}

	public Object visit(ASTIntersection node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTConstruction_de_fonctions node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTLambda_expression node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTEns_comprehension node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTTransformee_fonction node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTTransformee_relation node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTEvaluation_fonction node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTExpression_de_relations node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTIdentite node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTPremiere_projection node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTDeuxieme_projection node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTDomaine node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTCodomaine node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTEnsembleRelation node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTComposition node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTProduit_direct node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTProduit_parallele node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTRestriction_domaine node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSoustractions_domaine node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTRestriction_codomaine node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSoustractions_codomaine node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSurcharge node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTExpr_parenthesee node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTConversion_bool node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTEnsemble_vide node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTEnsemble_entier node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTEnsemble_chaines node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTEnsemble_booleen node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSous_ensembles node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSous_ensembles_finis node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution node, Object data) throws ParserBException {
		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, data);
			i++;
		}
		return null;
	}

	public Object visit(ASTSubstitution_sequence node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution_simultanee node, Object data) throws ParserBException {
		Element par = new Element("CParallel");
		((Element) data).addContent(par);
		
		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, par);
			i++;
		}
		return null;
	}

	public Object visit(ASTSubstitution_corps_operation node, Object data) throws ParserBException {
		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) { 
			node.jjtGetChild(i).jjtAccept(this, data);
			i++;
		}
		return null;
	}

	public Object visit(ASTSubstitution_bloc node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution_identite node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution_devient_egal node, Object data) throws ParserBException {
		Element assign = new Element("CAssignement");
		((Element) data).addContent(assign);
		
		int i = 0, childs = node.jjtGetNumChildren();
		while (i < childs) {
			node.jjtGetChild(i).jjtAccept(this, assign);
			i++;
		}
		return null;
	}

	public Object visit(ASTSubstitution_precondition node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution_assertion node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution_choix_borne node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution_conditionnelle node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution_selection node, Object data) throws ParserBException {
		Element select = new Element("Select");
		((Element) data).addContent(select);
		
		Element guard = new Element("Guard");
		select.addContent(guard);
		node.jjtGetChild(0).jjtAccept(this, guard);
		
		Element then = new Element("Then");
		select.addContent(then);
		node.jjtGetChild(1).jjtAccept(this, then);
	
		return null;
	}

	public Object visit(ASTSubstitution_cas node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution_choix_non_borne node, Object data) throws ParserBException {
		Element any = new Element("Any");
		((Element) data).addContent(any);
		
		Element var = new Element("CVariable");
		any.addContent(var);
		Attribute val = new Attribute("val", node.getIdent());
		var.setAttribute(val);
		
		Element wh = new Element("Where");
		any.addContent(wh);
		node.jjtGetChild(0).jjtAccept(this, wh);
		
		Element then = new Element("Then");
		any.addContent(then);
		node.jjtGetChild(1).jjtAccept(this, then);
		return null;
	}

	public Object visit(ASTSubstitution_definition_locale node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution_devient_elt_de node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution_devient_tel_que node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution_variable_locale node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTSubstitution_appel_operation node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTListe_ident node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}

	public Object visit(ASTEnsemble_simple node, Object data) throws ParserBException {
		throw new UnimplementedNodeException("");
		//return null;
	}
}
