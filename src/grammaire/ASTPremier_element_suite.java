/* Generated By:JJTree: Do not edit this line. ASTPremier_element_suite.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaire;

public
class ASTPremier_element_suite extends SimpleNode {
  public ASTPremier_element_suite(int id) {
    super(id);
  }

  public ASTPremier_element_suite(ParserB p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserBVisitor visitor, Object data) throws ParserBException {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=cd43db52cf1b49c0591679bf8ac97dcc (do not edit this line) */
