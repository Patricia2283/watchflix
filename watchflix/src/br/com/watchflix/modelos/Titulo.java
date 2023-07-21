package br.com.watchflix.modelos;

public class Titulo {

	private String nome;
	private int anoDeLancamento;
	private String diretor;
	private int duracaoEmMinutos;
	private double somaDasAvaliacoes;
	private boolean incluidoNoPlano;
	private double totalDeAvaliacoes;

	public Titulo(String nome, int anoDeLancamento) {
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;

	}

	public void exibeFichaTecnica() {
		System.out.println(nome);
		System.out.println("Ano de Lançamento: " + anoDeLancamento);
		System.out.println("Duração: " + duracaoEmMinutos + " minutos");

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public double getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	public double getSomaDasAvaliacoes() {
		return somaDasAvaliacoes;
	}

	public boolean IncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}

	public double pegaMedia() {
		double media = somaDasAvaliacoes / totalDeAvaliacoes;
		return media;
	}

	@Override
	public String toString() {
		return nome;
	}

}