/* Generated By:JJTree: Do not edit this line. ASTAbstractConstants.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTAbstractConstants extends SimpleNode {
  public ASTAbstractConstants(int id) {
    super(id);
  }

  public ASTAbstractConstants(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=03da1ed0b17725dd0427481ac50b475f (do not edit this line) */