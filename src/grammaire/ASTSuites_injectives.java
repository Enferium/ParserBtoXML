/* Generated By:JJTree: Do not edit this line. ASTSuites_injectives.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTSuites_injectives extends SimpleNode {
  public ASTSuites_injectives(int id) {
    super(id);
  }

  public ASTSuites_injectives(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=f82ebfad433439a1c3f14520a1eb7287 (do not edit this line) */