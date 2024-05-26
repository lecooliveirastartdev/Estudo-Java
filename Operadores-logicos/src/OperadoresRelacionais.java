public class OperadoresRelacionais {

    public static void main(String[] args) {
        // EX:

        /*
         * == Quando desejamos verificar se uma variável é IGUAL A outra.
         * 
         * != Quando desejamos verificar se uma variável é DIFERENTE da outra.
         * 
         * > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
         * 
         * >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
         * 
         * < Quando desejamos verificar se uma variável é MENOR QUE outra.
         * 
         * <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
         * 
         */

        // EX:

        // classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é igual a numeroDois " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é igual a numeroDois " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numeroUm é igual a numeroDois " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("numeroUm é igual a numeroDois " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("numeroUm é igual a numeroDois " + simNao);

        // EX:

        /*
         * if (numero1 > numero2)
         * System.out.print("Numero 1 maior que numero 2");
         * 
         * if (numero1 < numero2)
         * System.out.print("Numero 1 menor que numero 2");
         * 
         * if (numero1 >= numero2)
         * System.out.print("Numero 1 maior ou igual que numero 2");
         * 
         * if (numero1 <= numero2)
         * System.out.print("Numero 1 menor ou igual que numero 2");
         * 
         * if (numero1 != numero2)
         * System.out.print("Numero 1 é diferente de numero 2");
         * 
         */

    }

}

// EX:

/*
 * // ComparacaoAvancada.java
 * public static void main(String[] args) {
 * 
 * String nome1 = "JAVA";
 * String nome2 = "JAVA";
 * 
 * System.out.println(nome1 == nome2); //true
 * 
 * String nome3 = new String("JAVA");
 * 
 * System.out.println(nome1 == nome3); //false
 * 
 * String nome4 = nome3;
 * 
 * System.out.println(nome3 == nome4); //true
 * 
 * //equals na parada
 * System.out.println(nome1.equals(nome2)); //??
 * System.out.println(nome2.equals(nome3)); //??
 * System.out.println(nome3.equals(nome4)); //??
 */

// EX:
/*
 * // ComparacaoAvancada.java
 * public static void main(String[] args) {
 * 
 * int numero1 = 130;
 * int numero2 = 130;
 * System.out.println(numero1 == numero2); //true
 * 
 * Integer numero1 = 130;
 * Integer numero2 = 130;
 * 
 * System.out.println(numero1 == numero2); //false
 * 
 * // A razão pela qual o resultado é false, é devido o Java tratar os valores
 * // Como objetos a partir de agora.
 * // Qual a solução ?
 * // Quando queremos comparar objetos, usamos o método equals
 * 
 * System.out.println(numero1.equals(numero2));
 * }
 * 
 */

// EX:

/*
 * == versus equals: Existe uma relevância forte em realizar comparações com == e equals na qual precisamos ter uma compreensão de quais as regras seguidas pela linguagem **** , exemplo:

Copy
// ComparacaoAvancada.java
 public static void main(String[] args) {
        
        int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1 == numero2); //true
        
        Integer numero1 = 130;
        Integer numero2 = 130;

        System.out.println(numero1 == numero2); //false
        
        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals
        
         System.out.println(numero1.equals(numero2)); 
 */