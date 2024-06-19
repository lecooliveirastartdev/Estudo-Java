package Myiphone;

import Internet.NavegadorInternet;
import Iphone17.AparelhoTelefonico;
import MusicPlayer.ReprodutorMusical;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

	public void ligar(String numero) {
		System.out.println("Ligando para o número: " + numero + " pelo Iphone");
	}

	public void atender() {
		System.out.println("Atendendo a ligação pelo Iphone");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o correio de voz pelo Iphone");
	}

	public void tocar() {
		System.out.println("Tocando uma musiquinha no Iphone");
	}

	public void pausar() {
		System.out.println("A música foi pausada.");
	}

	public void selecionarMusica(String musica) {
		System.out.println("Escutando a música: " + musica + " no Iphone");
	}

	public void exibirPagina(String url) {
		System.out.println("Exibindo a pagina da web: " + url + " pelo Iphone");
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba no Iphone");

	}

	public void atualizarPagina() {
		System.out.println("Atualizando a página no Iphone");
	}

}
