/* Generated By:JJTree: Do not edit this line. ASTPredicat_Inegalite.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTPredicat_Inegalite extends SimpleNode {
  public ASTPredicat_Inegalite(int id) {
    super(id);
  }

  public ASTPredicat_Inegalite(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a7cd44cc438ce1b870e824009f489ba3 (do not edit this line) */
