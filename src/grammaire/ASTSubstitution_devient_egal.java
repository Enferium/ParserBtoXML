/* Generated By:JJTree: Do not edit this line. ASTSubstitution_devient_egal.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTSubstitution_devient_egal extends SimpleNode {
  public ASTSubstitution_devient_egal(int id) {
    super(id);
  }

  public ASTSubstitution_devient_egal(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=11ab4577a576009dca05689d2496c144 (do not edit this line) */
