package MusicPlayer;

public class Ipod implements ReprodutorMusical{

	public void tocar() {
		System.out.println("Tocando uma musiquinha.");
	}

	public void pausar() {
		System.out.println("A música foi pausada.");
	}

	public void selecionarMusica(String musica) {
		System.out.println("Escutando a música: " + musica); 
	}
	
}
