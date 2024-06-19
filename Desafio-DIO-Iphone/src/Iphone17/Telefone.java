package Iphone17;

public class Telefone implements AparelhoTelefonico {

	public void ligar(String numero) {
		System.out.println("Ligando para o número: " + numero);
	}

	public void atender() {
		System.out.println("Atendendo a ligação");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o correio de voz");
	}
	
}
