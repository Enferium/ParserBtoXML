/* Generated By:JJTree: Do not edit this line. ASTEnsemble_entier.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTEnsemble_entier extends SimpleNode {
  public ASTEnsemble_entier(int id) {
    super(id);
  }

  public ASTEnsemble_entier(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d4d325dd5d329d8440de283c4eb39530 (do not edit this line) */
