/* Generated By:JJTree: Do not edit this line. ASTEnsemble_vide.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTEnsemble_vide extends SimpleNode {
  public ASTEnsemble_vide(int id) {
    super(id);
  }

  public ASTEnsemble_vide(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=945883af6eb0ee34f75fd09d6e13f7ef (do not edit this line) */