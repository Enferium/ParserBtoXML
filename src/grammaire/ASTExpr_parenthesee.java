/* Generated By:JJTree: Do not edit this line. ASTExpr_parenthesee.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTExpr_parenthesee extends SimpleNode {
  public ASTExpr_parenthesee(int id) {
    super(id);
  }

  public ASTExpr_parenthesee(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=897284a4a1deb6af00a398bb57612b68 (do not edit this line) */
