/* Generated By:JJTree: Do not edit this line. ASTInjection_totale.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTInjection_totale extends SimpleNode {
  public ASTInjection_totale(int id) {
    super(id);
  }

  public ASTInjection_totale(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=718084a122b849a457ff38b53eec24e4 (do not edit this line) */