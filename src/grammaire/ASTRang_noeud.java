/* Generated By:JJTree: Do not edit this line. ASTRang_noeud.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTRang_noeud extends SimpleNode {
  public ASTRang_noeud(int id) {
    super(id);
  }

  public ASTRang_noeud(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8af63a6e55af1ba08f6b76a3c0feb867 (do not edit this line) */
