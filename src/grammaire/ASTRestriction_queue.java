/* Generated By:JJTree: Do not edit this line. ASTRestriction_queue.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTRestriction_queue extends SimpleNode {
  public ASTRestriction_queue(int id) {
    super(id);
  }

  public ASTRestriction_queue(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4f4dfd823cea8b0cf5dc93d33b4a19af (do not edit this line) */
