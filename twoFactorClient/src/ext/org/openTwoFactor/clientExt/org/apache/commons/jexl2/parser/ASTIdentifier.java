/* Generated By:JJTree: Do not edit this line. ASTIdentifier.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.openTwoFactor.clientExt.org.apache.commons.jexl2.parser;

public
class ASTIdentifier extends JexlNode {
  public ASTIdentifier(int id) {
    super(id);
  }

  public ASTIdentifier(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4afdfb6da58ad2f56325a94cdd6fd84e (do not edit this line) */