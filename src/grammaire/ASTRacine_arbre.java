/* Generated By:JJTree: Do not edit this line. ASTRacine_arbre.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTRacine_arbre extends SimpleNode {
  public ASTRacine_arbre(int id) {
    super(id);
  }

  public ASTRacine_arbre(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a8db3d591d7315a2309cb0b5fa79bf2b (do not edit this line) */