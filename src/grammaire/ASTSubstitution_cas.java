/* Generated By:JJTree: Do not edit this line. ASTSubstitution_cas.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTSubstitution_cas extends SimpleNode {
  public ASTSubstitution_cas(int id) {
    super(id);
  }

  public ASTSubstitution_cas(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9bc3c4b60ea01b817b8a07614cb0b43d (do not edit this line) */
