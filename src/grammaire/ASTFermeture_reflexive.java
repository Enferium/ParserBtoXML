/* Generated By:JJTree: Do not edit this line. ASTFermeture_reflexive.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTFermeture_reflexive extends SimpleNode {
  public ASTFermeture_reflexive(int id) {
    super(id);
  }

  public ASTFermeture_reflexive(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ec03e0aec2577119be091366439d1292 (do not edit this line) */