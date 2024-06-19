package Internet;

public class Browser implements NavegadorInternet{

	public void exibirPagina(String url) {
		System.out.println("Exibindo a pagina da web: " + url);
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba");
		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando a página");		
	}
	
}
