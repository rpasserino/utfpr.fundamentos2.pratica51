import utfpr.ct.dainf.if62c.pratica.Matriz;
import utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException;
import utfpr.ct.dainf.if62c.pratica.ProdMatrizesIncompativeisException;
import utfpr.ct.dainf.if62c.pratica.SomaMatrizesIncompativeisException;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica51{

    public static void main(String[] args) {
        Matriz orig, other, invalida, tentar, soma, prod;
        orig = other = invalida = tentar = soma = prod = null;

        try{
           tentar = new Matriz(2, 1);
           orig = new Matriz(3, 2);
           other = new Matriz(2, 3);
           invalida = new Matriz(-5, 4);
        }
        catch(MatrizInvalidaException mie){
           System.out.println(mie.getLocalizedMessage());
        }
        
        
        double[][] m = orig.getMatriz();
        double[][] o = other.getMatriz();
        double[][] t = tentar.getMatriz();
        m[0][0] = 1;
        m[0][1] = 1;
        m[1][0] = 2;
        m[1][1] = 2;
        m[2][0] = 3;
        m[2][1] = 3; 
        o[0][0] = 1;
        o[0][1] = 2;
        o[0][2] = 3;
        o[1][0] = 1;
        o[1][1] = 2;
        o[1][2] = 3;
        t[0][0] = 1;
        t[1][0] = 2;
    //    Matriz transp = orig.getTransposta();
        try{
        soma = orig.soma(orig);
        prod = orig.prod(other);
        Matriz prod2 = tentar.prod(other);
        Matriz soma2 = tentar.soma(orig);
        }
        catch(ProdMatrizesIncompativeisException | SomaMatrizesIncompativeisException mi){
           System.out.println(mi.getLocalizedMessage());
        }
        System.out.println(orig);
        System.out.println(other);
        System.out.println(tentar);
    //    System.out.println("Matriz transposta: " + transp);
        System.out.println(soma);
        System.out.println(prod);
    }
}