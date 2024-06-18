package Mensseger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="tlg"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("face"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new TelegranMessenger();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();

		smi.validarConectadoInternet();
	}
}


