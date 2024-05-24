public class OperadoresLogico {
    public static void main(String[] args) throws Exception {

        /*
             OPERADORES LOGICOS
             
         * classe Operadores.java
         * String nome = "ALEXANDRO";
         * int idade = 22;
         * double peso = 68.5;
         * char sexo = 'M';
         * boolean doadorOrgao = false;
         * Date dataNascimento = new Date();
         * 
         * // classe Operadores.java
         * double soma = 10.5 + 15.7;
         * int subtração = 113 - 25;
         * int multiplicacao = 20 * 7;
         * int divisao = 15 / 3;
         * int modulo = 18 % 3;
         * double resultado = (10 * 7) + (20 / 4);
         */

        // classe Operadores.java
        String nomeCompleto = "LINGUAGEM " + "JAVA ";

        System.out.println(nomeCompleto);

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

    }
}
