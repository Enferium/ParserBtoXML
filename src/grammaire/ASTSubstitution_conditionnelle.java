/* Generated By:JJTree: Do not edit this line. ASTSubstitution_conditionnelle.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTSubstitution_conditionnelle extends SimpleNode {
  public ASTSubstitution_conditionnelle(int id) {
    super(id);
  }

  public ASTSubstitution_conditionnelle(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=bc305cfecf858ecc53229c9a4a8def61 (do not edit this line) */
