/* Generated By:JJTree: Do not edit this line. ASTProduit_direct.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTProduit_direct extends SimpleNode {
  public ASTProduit_direct(int id) {
    super(id);
  }

  public ASTProduit_direct(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=004343aeb3b99800526082258c38e42c (do not edit this line) */