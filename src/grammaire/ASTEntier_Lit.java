/* Generated By:JJTree: Do not edit this line. ASTEntier_Lit.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTEntier_Lit extends SimpleNode {
  public ASTEntier_Lit(int id) {
    super(id);
  }

  public ASTEntier_Lit(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=badae2a8d5b40e2b718fcc61ebdb03d3 (do not edit this line) */