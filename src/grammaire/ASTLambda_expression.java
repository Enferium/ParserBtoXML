/* Generated By:JJTree: Do not edit this line. ASTLambda_expression.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTLambda_expression extends SimpleNode {
  public ASTLambda_expression(int id) {
    super(id);
  }

  public ASTLambda_expression(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=26545cc83136eb2accb865ce84bb1d9a (do not edit this line) */
