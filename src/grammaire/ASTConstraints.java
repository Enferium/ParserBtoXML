/* Generated By:JJTree: Do not edit this line. ASTConstraints.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTConstraints extends SimpleNode {
  public ASTConstraints(int id) {
    super(id);
  }

  public ASTConstraints(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=15264ae646de9459a8bc4228a31869a7 (do not edit this line) */
