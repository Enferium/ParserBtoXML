/* Generated By:JJTree: Do not edit this line. ASTEns_extension.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTEns_extension extends SimpleNode {
  public ASTEns_extension(int id) {
    super(id);
  }

  public ASTEns_extension(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=24823a63e3af46ba1fa9a0d7b297550f (do not edit this line) */
