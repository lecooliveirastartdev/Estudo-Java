public class OperadoresUnarios {

    public static void main(String[] args) {

        // classe Operadores.java
        int numero = 5;

        // Imprimindo o numero negativo
        System.out.println(- numero);

        // Imprimindo numero positivo
        System.out.println(numero * 1);

        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++ +1);// ops algo de errado não está certo

        // ordem de precedencia conta aqui
        System.out.println(++numero);

        //Use ! para iverter o resultado
        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);
    }

}
