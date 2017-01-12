/* Generated By:JavaCC: Do not edit this line. ParserBVisitor.java Version 6.0_1 */
package grammaire;

public interface ParserBVisitor
{
  public Object visit(SimpleNode node, Object data) throws ParserBException;
  public Object visit(ASTStart node, Object data) throws ParserBException;
  public Object visit(ASTIdent_ren node, Object data) throws ParserBException;
  public Object visit(ASTMachine node, Object data) throws ParserBException;
  public Object visit(ASTEnTete node, Object data) throws ParserBException;
  public Object visit(ASTConstraints node, Object data) throws ParserBException;
  public Object visit(ASTSets node, Object data) throws ParserBException;
  public Object visit(ASTEnsemble node, Object data) throws ParserBException;
  public Object visit(ASTConcreteConstants node, Object data) throws ParserBException;
  public Object visit(ASTAbstractConstants node, Object data) throws ParserBException;
  public Object visit(ASTProperties node, Object data) throws ParserBException;
  public Object visit(ASTValues node, Object data) throws ParserBException;
  public Object visit(ASTValue node, Object data) throws ParserBException;
  public Object visit(ASTConcreteVariables node, Object data) throws ParserBException;
  public Object visit(ASTAbstractVariables node, Object data) throws ParserBException;
  public Object visit(ASTInvariant node, Object data) throws ParserBException;
  public Object visit(ASTInitialisation node, Object data) throws ParserBException;
  public Object visit(ASTOperations node, Object data) throws ParserBException;
  public Object visit(ASTOperation node, Object data) throws ParserBException;
  public Object visit(ASTEnteteOperation node, Object data) throws ParserBException;
  public Object visit(ASTTerme node, Object data) throws ParserBException;
  public Object visit(ASTTermeSimple node, Object data) throws ParserBException;
  public Object visit(ASTEntier_Lit node, Object data) throws ParserBException;
  public Object visit(ASTBoolean_Lit node, Object data) throws ParserBException;
  public Object visit(ASTTerme_record node, Object data) throws ParserBException;
  public Object visit(ASTExpr_tableau node, Object data) throws ParserBException;
  public Object visit(ASTCondition node, Object data) throws ParserBException;
  public Object visit(ASTEqual node, Object data) throws ParserBException;
  public Object visit(ASTNotEqual node, Object data) throws ParserBException;
  public Object visit(ASTLessThan node, Object data) throws ParserBException;
  public Object visit(ASTGreatherThan node, Object data) throws ParserBException;
  public Object visit(ASTLessThanOrEqual node, Object data) throws ParserBException;
  public Object visit(ASTGreatherThanOrEqual node, Object data) throws ParserBException;
  public Object visit(ASTNot node, Object data) throws ParserBException;
  public Object visit(ASTAnd node, Object data) throws ParserBException;
  public Object visit(ASTOr node, Object data) throws ParserBException;
  public Object visit(ASTInstruction node, Object data) throws ParserBException;
  public Object visit(ASTInstruction_corps_operation node, Object data) throws ParserBException;
  public Object visit(ASTInstruction_bloc node, Object data) throws ParserBException;
  public Object visit(ASTInstruciton_variable_locale node, Object data) throws ParserBException;
  public Object visit(ASTInstruction_devient_egal node, Object data) throws ParserBException;
  public Object visit(ASTInstruction_appel_operation node, Object data) throws ParserBException;
  public Object visit(ASTInstruction_sequence node, Object data) throws ParserBException;
  public Object visit(ASTInstruction_conditionnelle node, Object data) throws ParserBException;
  public Object visit(ASTInstruction_cas node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_tant_que node, Object data) throws ParserBException;
  public Object visit(ASTInstruction_assertion node, Object data) throws ParserBException;
  public Object visit(ASTpredicat node, Object data) throws ParserBException;
  public Object visit(ASTUnion node, Object data) throws ParserBException;
  public Object visit(ASTImplication node, Object data) throws ParserBException;
  public Object visit(ASTEquivalence node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_parenthese node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Negation node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Universel node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Existentiel node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Egalite node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Inegalite node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Appartenance node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Not_Appartenance node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Inclusion node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Insclusion_Stricte node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Non_Inclusion node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Non_Inclusion_Stricte node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Inferieur_Ou_Egal node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Strictement_Inferieur node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Strictement_Superieur node, Object data) throws ParserBException;
  public Object visit(ASTPredicat_Superieur_Ou_Egal node, Object data) throws ParserBException;
  public Object visit(ASTExpression node, Object data) throws ParserBException;
  public Object visit(ASTFonction_partielle node, Object data) throws ParserBException;
  public Object visit(ASTFonction_totale node, Object data) throws ParserBException;
  public Object visit(ASTInjection_partielle node, Object data) throws ParserBException;
  public Object visit(ASTInjection_totale node, Object data) throws ParserBException;
  public Object visit(ASTSurjection_partielle node, Object data) throws ParserBException;
  public Object visit(ASTSurjection_totale node, Object data) throws ParserBException;
  public Object visit(ASTBijection_totale node, Object data) throws ParserBException;
  public Object visit(ASTCouple node, Object data) throws ParserBException;
  public Object visit(ASTExpression_primaire node, Object data) throws ParserBException;
  public Object visit(ASTExpression_booleenne node, Object data) throws ParserBException;
  public Object visit(ASTExprArith node, Object data) throws ParserBException;
  public Object visit(ASTMoinsUnaire node, Object data) throws ParserBException;
  public Object visit(ASTSuccesseur node, Object data) throws ParserBException;
  public Object visit(ASTPredecesseur node, Object data) throws ParserBException;
  public Object visit(ASTMaximum node, Object data) throws ParserBException;
  public Object visit(ASTMinimum node, Object data) throws ParserBException;
  public Object visit(ASTCardinal node, Object data) throws ParserBException;
  public Object visit(ASTSomme_generalisee node, Object data) throws ParserBException;
  public Object visit(ASTProduit_generalisee node, Object data) throws ParserBException;
  public Object visit(ASTAddition node, Object data) throws ParserBException;
  public Object visit(ASTSoustraction node, Object data) throws ParserBException;
  public Object visit(ASTProducion node, Object data) throws ParserBException;
  public Object visit(ASTDivision node, Object data) throws ParserBException;
  public Object visit(ASTModulo node, Object data) throws ParserBException;
  public Object visit(ASTPuissance node, Object data) throws ParserBException;
  public Object visit(ASTExpression_d_ensembles node, Object data) throws ParserBException;
  public Object visit(ASTConstruction_d_ensembles node, Object data) throws ParserBException;
  public Object visit(ASTEnsComprehension node, Object data) throws ParserBException;
  public Object visit(ASTUnion_generalisee node, Object data) throws ParserBException;
  public Object visit(ASTIntersection_generalisee node, Object data) throws ParserBException;
  public Object visit(ASTUnion_quantifiee node, Object data) throws ParserBException;
  public Object visit(ASTIntersection_quantifiee node, Object data) throws ParserBException;
  public Object visit(ASTProduit_ensemble node, Object data) throws ParserBException;
  public Object visit(ASTIntervalle node, Object data) throws ParserBException;
  public Object visit(ASTIntersection node, Object data) throws ParserBException;
  public Object visit(ASTConstruction_de_fonctions node, Object data) throws ParserBException;
  public Object visit(ASTLambda_expression node, Object data) throws ParserBException;
  public Object visit(ASTEns_comprehension node, Object data) throws ParserBException;
  public Object visit(ASTTransformée_fonction node, Object data) throws ParserBException;
  public Object visit(ASTTransformée_relation node, Object data) throws ParserBException;
  public Object visit(ASTEvaluation_fonction node, Object data) throws ParserBException;
  public Object visit(ASTExpression_de_relations node, Object data) throws ParserBException;
  public Object visit(ASTIdentite node, Object data) throws ParserBException;
  public Object visit(ASTPremiere_projection node, Object data) throws ParserBException;
  public Object visit(ASTDeuxieme_projection node, Object data) throws ParserBException;
  public Object visit(ASTDomaine node, Object data) throws ParserBException;
  public Object visit(ASTCodomaine node, Object data) throws ParserBException;
  public Object visit(ASTEnsembleRelation node, Object data) throws ParserBException;
  public Object visit(ASTComposition node, Object data) throws ParserBException;
  public Object visit(ASTProduit_direct node, Object data) throws ParserBException;
  public Object visit(ASTProduit_parallele node, Object data) throws ParserBException;
  public Object visit(ASTRestriction_domaine node, Object data) throws ParserBException;
  public Object visit(ASTSoustractions_domaine node, Object data) throws ParserBException;
  public Object visit(ASTRestriction_codomaine node, Object data) throws ParserBException;
  public Object visit(ASTSoustractions_codomaine node, Object data) throws ParserBException;
  public Object visit(ASTSurcharge node, Object data) throws ParserBException;
  public Object visit(ASTExpr_parenthesee node, Object data) throws ParserBException;
  public Object visit(ASTConversion_bool node, Object data) throws ParserBException;
  public Object visit(ASTEnsemble_vide node, Object data) throws ParserBException;
  public Object visit(ASTEnsemble_entier node, Object data) throws ParserBException;
  public Object visit(ASTEnsemble_chaines node, Object data) throws ParserBException;
  public Object visit(ASTEnsemble_booleen node, Object data) throws ParserBException;
  public Object visit(ASTSous_ensembles node, Object data) throws ParserBException;
  public Object visit(ASTSous_ensembles_finis node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_sequence node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_simultanee node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_corps_operation node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_bloc node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_identite node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_devient_egal node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_precondition node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_assertion node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_choix_borne node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_conditionnelle node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_selection node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_cas node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_choix_non_borne node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_definition_locale node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_devient_elt_de node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_devient_tel_que node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_variable_locale node, Object data) throws ParserBException;
  public Object visit(ASTSubstitution_appel_operation node, Object data) throws ParserBException;
  public Object visit(ASTListe_ident node, Object data) throws ParserBException;
  public Object visit(ASTEnsemble_simple node, Object data) throws ParserBException;
}
/* JavaCC - OriginalChecksum=cecdb261ae336cc5895c6b4c1f5cd4bb (do not edit this line) */
