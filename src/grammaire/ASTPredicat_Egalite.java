/* Generated By:JJTree: Do not edit this line. ASTPredicat_Egalite.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTPredicat_Egalite extends SimpleNode {
  public ASTPredicat_Egalite(int id) {
    super(id);
  }

  public ASTPredicat_Egalite(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=90dee760ae74926c4b095e932b7dbe9e (do not edit this line) */
