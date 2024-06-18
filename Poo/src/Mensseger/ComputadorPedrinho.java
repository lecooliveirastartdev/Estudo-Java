package Mensseger;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		// abrindo MSN Messenger
		System.out.println(".........");
		MSNMessenger msn = new MSNMessenger();
		System.out.println("->MSNMenssager");
		msn.enviarMensagem();
		msn.receberMensagem();

		System.out.println("..........");
		FacebookMessenger face = new FacebookMessenger();
		System.out.println("->FACEBOOK");
		face.enviarMensagem();
		face.receberMensagem();

		System.out.println("...........");
		TelegranMensseger tlg = new TelegranMensseger();
		System.out.println("->TELEGRAN");
		tlg.enviarMensagem();
		tlg.receberMensagem();

	}

}
