// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 26.0;
        double novoSaldo = 0.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);

        } else if (saldo == valorSolicitado ) {

            System.out.println("Valor sacado "  + valorSolicitado + " Seu novo saldo e : " +  novoSaldo);

        } else
            System.out.println("Saldo insuficiente");

       

    }

}