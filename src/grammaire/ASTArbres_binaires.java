/* Generated By:JJTree: Do not edit this line. ASTArbres_binaires.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTArbres_binaires extends SimpleNode {
  public ASTArbres_binaires(int id) {
    super(id);
  }

  public ASTArbres_binaires(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=595a7b30db2d7aa79330d8f36a0d7aa2 (do not edit this line) */