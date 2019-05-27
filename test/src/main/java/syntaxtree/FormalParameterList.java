//
// Generated by JTB 1.3.2 DIT@UoA patched
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> FormalParameter()
 * f1 -> FormalParameterTail()
 */
public class FormalParameterList implements Node {
   public FormalParameter f0;
   public FormalParameterTail f1;

   public FormalParameterList(FormalParameter n0, FormalParameterTail n1) {
      f0 = n0;
      f1 = n1;
   }

   public void accept(visitor.Visitor v) throws Exception {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) throws Exception {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) throws Exception {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) throws Exception {
      v.visit(this,argu);
   }
}

