/* Generated By:JJTree: Do not edit this line. ASTInstruction_conditionnelle.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTInstruction_conditionnelle extends SimpleNode {
  public ASTInstruction_conditionnelle(int id) {
    super(id);
  }

  public ASTInstruction_conditionnelle(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9443b2c09b18651f23933c7ae9caee68 (do not edit this line) */
