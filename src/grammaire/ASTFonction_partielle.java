/* Generated By:JJTree: Do not edit this line. ASTFonction_partielle.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTFonction_partielle extends SimpleNode {
  public ASTFonction_partielle(int id) {
    super(id);
  }

  public ASTFonction_partielle(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=867a225db0bb2fbf3324403f45adfb0e (do not edit this line) */
