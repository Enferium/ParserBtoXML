/* Generated By:JJTree: Do not edit this line. ASTSubstitution_precondition.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTSubstitution_precondition extends SimpleNode {
  public ASTSubstitution_precondition(int id) {
    super(id);
  }

  public ASTSubstitution_precondition(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=97392017b158cfbfd5a67b116f554db2 (do not edit this line) */
