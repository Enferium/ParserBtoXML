/* Generated By:JJTree: Do not edit this line. ASTBoolean_Lit.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTBoolean_Lit extends SimpleNode {
  public ASTBoolean_Lit(int id) {
    super(id);
  }

  public ASTBoolean_Lit(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b68f510d4e0280270289ef2d960c114c (do not edit this line) */
