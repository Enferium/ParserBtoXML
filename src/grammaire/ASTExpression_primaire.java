/* Generated By:JJTree: Do not edit this line. ASTExpression_primaire.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTExpression_primaire extends SimpleNode {
  public ASTExpression_primaire(int id) {
    super(id);
  }

  public ASTExpression_primaire(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=30bb487aa7c8c3821b6f796ee8c8f5d2 (do not edit this line) */
