public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        /*
         * ao usar a palavra reservada final, você determina que jamais
         * esta variavel poderá obter outro valor;
         * logo a linha 25 vai apresentar um erro de compilação
         * isso é considerado uma CONSTANTE na linguagem Java
         */

        final double VALOR_DE_PI = 3.14;

        System.out.println(VALOR_DE_PI);

    String meuNome = "Alexandro Oliveira";

    System.out.println(meuNome);

    }
}

/*
// Os oito tipos primitivos em Java são: OS 8 TIPOS PRIMITIVOS DE EM JAVA SÁO:

INTEIROS->

(byte, short, int e long)

TIPOS DE PONTO FLUTUANTE->

(float e double)

TIPOS BOOLEANO->

(true e false)

O tipo boolean representa os valores verdadeiro/falso. Java define os valores ver-
dadeiro e falso usando as palavras reservadas true e false. Logo, uma variável ou 
expressªo de tipo boolean terá um desses dois valores




int, byte, short, long, float, double, boolean e char – esses tipos não são considerados objetos, e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack)
 */