public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 =(short) numeroNormal;

        /*
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo a linha 25 vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */


         final double VALOR_DE_PI = 3.14;

System.out.println(VALOR_DE_PI);




    }
}
