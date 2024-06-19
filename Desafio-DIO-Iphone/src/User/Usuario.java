package User;

import Internet.Browser;
import Internet.NavegadorInternet;
import Iphone17.AparelhoTelefonico;
import Iphone17.Telefone;
import MusicPlayer.Ipod;
import MusicPlayer.ReprodutorMusical;
import Myiphone.Iphone;

public class Usuario {
	public static void main(String[] args) {
		
		Iphone celular = new Iphone();
		
		NavegadorInternet browser = new Browser();
		ReprodutorMusical ipod = new Ipod();
		AparelhoTelefonico tel = new Telefone();
		
		browser.adicionarNovaAba();
		ipod.selecionarMusica("Artista: Shalom Margaret - Música: Oceans ");
		tel.ligar("992820915");
		
		System.out.println("10 segundos depois");
		
		browser.atualizarPagina();
		ipod.pausar();
		tel.atender();
		
		
		
	}
}
