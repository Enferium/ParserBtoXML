/* Generated By:JJTree: Do not edit this line. ASTSubstitution_selection.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTSubstitution_selection extends SimpleNode {
  public ASTSubstitution_selection(int id) {
    super(id);
  }

  public ASTSubstitution_selection(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d2632b207a662d26b30cb3464eba1167 (do not edit this line) */
