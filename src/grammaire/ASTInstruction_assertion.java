/* Generated By:JJTree: Do not edit this line. ASTInstruction_assertion.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTInstruction_assertion extends SimpleNode {
  public ASTInstruction_assertion(int id) {
    super(id);
  }

  public ASTInstruction_assertion(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=447f3224cc7f159e663ffb67476222f5 (do not edit this line) */
