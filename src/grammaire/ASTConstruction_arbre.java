/* Generated By:JJTree: Do not edit this line. ASTConstruction_arbre.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTConstruction_arbre extends SimpleNode {
  public ASTConstruction_arbre(int id) {
    super(id);
  }

  public ASTConstruction_arbre(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e2095052bc8c4aff3d392b7d308fa0d4 (do not edit this line) */