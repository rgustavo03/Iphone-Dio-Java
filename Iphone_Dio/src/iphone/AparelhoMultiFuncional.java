package iphone;

public class AparelhoMultiFuncional implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	// ReprodutorMusical
	@Override
	public void tocar() {
		System.out.println("Reproduzindo música");
	}
	@Override
	public void pausar() {
		System.out.println("Música pausada");
	}
	@Override
	public void selecionarMusica() {
		System.out.println("Música selecionada");
	}

	// AparelhoTelefonico
	@Override
	public void ligar() {
		System.out.println("Fazendo uma ligação");
	}
	@Override
	public void atender() {
		System.out.println("Chamada atendida...");
	}
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado...");
	}
	
	// NavegadorInternet
	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");
	}
	@Override
	public void adicionarNovaAba() {
		System.out.println("Aba adicionada");
	}
	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");
	}
	
}
