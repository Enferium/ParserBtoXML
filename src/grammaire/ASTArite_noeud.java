/* Generated By:JJTree: Do not edit this line. ASTArite_noeud.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTArite_noeud extends SimpleNode {
  public ASTArite_noeud(int id) {
    super(id);
  }

  public ASTArite_noeud(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e8220a02bf9860c583ccd6824f8515b1 (do not edit this line) */
