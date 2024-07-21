package usuario;

import iphone.AparelhoMultiFuncional;

public class Pessoa {
	public static void main(String[] args) {
		AparelhoMultiFuncional iphone = new AparelhoMultiFuncional();
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		System.out.println("");
		
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		System.out.println("");
		
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	}
}
