/* Generated By:JJTree: Do not edit this line. ASTPredicat_Superieur_Ou_Egal.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTPredicat_Superieur_Ou_Egal extends SimpleNode {
  public ASTPredicat_Superieur_Ou_Egal(int id) {
    super(id);
  }

  public ASTPredicat_Superieur_Ou_Egal(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=5c97c0115be67d2ffea6dffc388b695e (do not edit this line) */
