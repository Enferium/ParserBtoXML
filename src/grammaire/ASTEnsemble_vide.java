/* Generated By:JJTree: Do not edit this line. ASTEnsemble_vide.java Version 6.0 */
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

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3c0211cbad629b98290fe01a7e18e3f4 (do not edit this line) */
