/* Generated By:JJTree: Do not edit this line. ASTConversion_bool.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTConversion_bool extends SimpleNode {
  public ASTConversion_bool(int id) {
    super(id);
  }

  public ASTConversion_bool(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ba4c9e1dc7c439f00f2e27968be07f68 (do not edit this line) */
