package utfpr.ct.dainf.if62c.pratica;

public class MatrizInvalidaException extends RuntimeException{
   private final int m;
   private final int n;
   
   public MatrizInvalidaException(int m, int n){
      super(String.format("Matriz de %dx%d não pode ser criada", m, n));
      this.m = m;
      this.n = n;
   }
   
   public int getNumLinhas(){
      return m;
   }
   
   public int getNumColunas(){
      return n;
   }
}