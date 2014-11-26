package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Luiz
 */
public class ProdMatrizesIncompativeisException extends MatrizesIncompativeisException{
   private final Matriz m1;
   private final Matriz m2;
  
   public ProdMatrizesIncompativeisException(Matriz m1, Matriz m2){
      super(m1, m2, String.format(
            "Matrizes de %dx%d e %dx%d não podem ser multiplicadas",
            m1.getMatriz().length, m1.getMatriz()[0].length,
            m2.getMatriz().length, m2.getMatriz()[0].length));
        this.m1 = getM1();
        this.m2 = getM2();
   }
}