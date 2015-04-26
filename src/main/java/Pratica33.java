import utfpr.ct.dainf.if62c.pratica.Matriz;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica33 {

    public static void main(String[] args) {
        
        // Criando os objetos
        Matriz primeira = new Matriz(3, 3);
        Matriz segunda = new Matriz(3, 3);
        
        // Criando as variáveis associadas aos objetos
        double[][] m1 = primeira.getMatriz();
        double[][] m2 = segunda.getMatriz();
        
        m1[0][0] = 1.0;
        m1[0][1] = 1.0;
        m1[0][2] = 1.0;
        m1[1][0] = 1.0;
        m1[1][1] = 1.0;
        m1[1][2] = 1.0;
        m1[2][0] = 1.0;
        m1[2][1] = 1.0;
        m1[2][2] = 1.0;
        
        m2[0][0] = 2.0;
        m2[0][1] = 2.0;
        m2[0][2] = 2.0;
        m2[1][0] = 2.0;
        m2[1][1] = 2.0;
        m2[1][2] = 2.0;
        m2[2][0] = 2.0;
        m2[2][1] = 2.0;
        m2[2][2] = 2.0;
        
        // Imprimindo as matrizes originais
        System.out.println("Matriz 1 original: " + primeira);
        System.out.println("Matriz 2 original: " + segunda);
        
        Matriz soma = new Matriz(3, 3);
        Matriz produto = new Matriz(3, 3);
        
        soma = primeira.soma(segunda);
        
        // Imprimindo a matriz soma
        System.out.println("Soma: " + soma);
        
        produto = primeira.prod(segunda);
        
        // Imprimindo a matriz produto
        System.out.println("Produto: " + produto);
        
    }
}
