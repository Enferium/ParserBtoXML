/* Generated By:JJTree: Do not edit this line. ASTEnsemble_chaines.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTEnsemble_chaines extends SimpleNode {
  public ASTEnsemble_chaines(int id) {
    super(id);
  }

  public ASTEnsemble_chaines(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=018e599bddb0f753af9c2380b7da07bd (do not edit this line) */
