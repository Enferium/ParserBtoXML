/* Generated By:JJTree: Do not edit this line. ASTDeuxieme_projection.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTDeuxieme_projection extends SimpleNode {
  public ASTDeuxieme_projection(int id) {
    super(id);
  }

  public ASTDeuxieme_projection(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7eba80b96478bbe0432eb0ca551b0e53 (do not edit this line) */
