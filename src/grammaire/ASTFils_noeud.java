/* Generated By:JJTree: Do not edit this line. ASTFils_noeud.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTFils_noeud extends SimpleNode {
  public ASTFils_noeud(int id) {
    super(id);
  }

  public ASTFils_noeud(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=1c763218a76c82daae0c711dc5988f16 (do not edit this line) */