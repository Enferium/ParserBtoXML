/* Generated By:JJTree: Do not edit this line. ASTExpression_booleenne.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTExpression_booleenne extends SimpleNode {
  public ASTExpression_booleenne(int id) {
    super(id);
  }

  public ASTExpression_booleenne(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b959a5bac648251057901e6b79308d32 (do not edit this line) */
