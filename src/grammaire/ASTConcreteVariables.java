/* Generated By:JJTree: Do not edit this line. ASTConcreteVariables.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTConcreteVariables extends SimpleNode {
  public ASTConcreteVariables(int id) {
    super(id);
  }

  public ASTConcreteVariables(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=33e2ad11077de1181adf617747365d14 (do not edit this line) */
