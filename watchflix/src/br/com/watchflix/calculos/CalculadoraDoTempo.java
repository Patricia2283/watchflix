package br.com.watchflix.calculos;

import br.com.watchflix.modelos.Titulo;

public class CalculadoraDoTempo {
	
	private int tempoTotal;
	
	public void inclui(Titulo titulo) {
		System.out.println("Adicionando a duração em minutos, " + titulo);
		this.tempoTotal += titulo.getDuracaoEmMinutos();
		
	}

	public int getTempoTotal() {
		return tempoTotal;
	}

}
