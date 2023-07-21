package br.com.watchflix.modelos;

import br.com.watchflix.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

	private String diretor;

	public Filme(String nome, int AnoDeLancamento) {
		super(nome, AnoDeLancamento);

	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		return (int) pegaMedia() / 2;
	}

}
