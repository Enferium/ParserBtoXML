/* Generated By:JJTree: Do not edit this line. ASTSubstitution_tant_que.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTSubstitution_tant_que extends SimpleNode {
  public ASTSubstitution_tant_que(int id) {
    super(id);
  }

  public ASTSubstitution_tant_que(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9b9b7f9fb6cce0146b970ae16f65535c (do not edit this line) */
