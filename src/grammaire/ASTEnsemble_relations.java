/* Generated By:JJTree: Do not edit this line. ASTEnsemble_relations.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTEnsemble_relations extends SimpleNode {
  public ASTEnsemble_relations(int id) {
    super(id);
  }

  public ASTEnsemble_relations(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d108c6ec51a82b9bbe85d3735b184517 (do not edit this line) */
