/* Generated By:JJTree: Do not edit this line. ASTQueue_suite.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTQueue_suite extends SimpleNode {
  public ASTQueue_suite(int id) {
    super(id);
  }

  public ASTQueue_suite(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=2bc00af2bd5e95184b86001dc9271675 (do not edit this line) */
