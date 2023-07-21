package br.com.watchflix.principal;

import java.util.ArrayList;

import br.com.watchflix.calculos.CalculadoraDoTempo;
import br.com.watchflix.calculos.FiltroRecomendacao;
import br.com.watchflix.modelos.Episodio;
import br.com.watchflix.modelos.Filme;
import br.com.watchflix.modelos.Serie;

public class Principal {

	public static void main(String[] args) {

		Filme meuFilme = new Filme("O Iluminado", 1980);
		meuFilme.setDuracaoEmMinutos(120);

		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(10);
		meuFilme.avalia(10);
		meuFilme.avalia(10);

		System.out.println("Soma das avalições: " + meuFilme.getSomaDasAvaliacoes());
		System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

		System.out.println("\n*******************************\n");

		Filme outroFilme = new Filme("Filme:Avatar", 2023);
		outroFilme.setDuracaoEmMinutos(200);
		outroFilme.exibeFichaTecnica();
		outroFilme.avalia(3);
		outroFilme.avalia(1);
		outroFilme.avalia(4);

		// System.out.println("Quantidade de avaliações: " +
		// outroFilme.getTotalDeAvaliacoes());
		System.out.println("Soma das avalições: " + outroFilme.getSomaDasAvaliacoes());
		System.out.println("Média das avaliações: " + outroFilme.pegaMedia());

		System.out.println("\n*******************************\n");

		Filme maisUmFilme = new Filme("Filme:A Bruxa de Blair", 2004);
		maisUmFilme.setDuracaoEmMinutos(120);
		maisUmFilme.exibeFichaTecnica();
		maisUmFilme.avalia(8);
		maisUmFilme.avalia(7);
		maisUmFilme.avalia(6);
		System.out.println("Soma das avalições: " + maisUmFilme.getSomaDasAvaliacoes());
		System.out.println("Média das avaliações: " + maisUmFilme.pegaMedia());

		System.out.println("\n*******************************\n");

		ArrayList<Filme> meusFilmes = new ArrayList<>();
		meusFilmes.add(meuFilme);
		meusFilmes.add(outroFilme);
		meusFilmes.add(maisUmFilme);
		System.out.println("A sua lista contém " + meusFilmes.size() + " títulos:" + meusFilmes);

		System.out.println("\n*******************************\n");

		Serie serie = new Serie("Série:Dark", 2017);
		serie.setTemporadas(3);
		serie.setEpisodiosPorTemporada(8);
		serie.setMinutosPorEpisodio(55);
		serie.setDuracaoEmMinutos(serie.getDuracaoEmMinutos());
		serie.exibeFichaTecnica();

		// System.out.println(("Duração de tempo para maratonar Dark: " +
		// serie.getDuracaoEmMinutos()) + " minutos.");

		serie.avalia(10);
		serie.avalia(8);
		serie.avalia(9);
		System.out.println("Quantidade de avaliações: " + serie.getTotalDeAvaliacoes());
		System.out.println("Soma das avalições: " + serie.getSomaDasAvaliacoes());
		System.out.println("Média das avaliações: " + serie.pegaMedia());

		System.out.println("\n*******************************\n");

		Serie outraSerie = new Serie("Série:The Sinner", 2018);
		outraSerie.setTemporadas(4);
		outraSerie.setEpisodiosPorTemporada(6);
		outraSerie.setMinutosPorEpisodio(50);
		outraSerie.setDuracaoEmMinutos(outraSerie.getDuracaoEmMinutos());
		outraSerie.exibeFichaTecnica();

		// System.out.println(
		// ("Duração de tempo para maratonar The Sinner: " +
		// outraSerie.getDuracaoEmMinutos()) + " minutos.");

		outraSerie.avalia(10);
		outraSerie.avalia(10);
		outraSerie.avalia(9.5);

		System.out.println("Quantidade de avaliações: " + outraSerie.getTotalDeAvaliacoes());
		System.out.println("Soma das avalições: " + outraSerie.getSomaDasAvaliacoes());
		System.out.println("Média das avaliações: " + outraSerie.pegaMedia());

		System.out.println("\n************************\n");

		CalculadoraDoTempo calculadora = new CalculadoraDoTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(serie);
		calculadora.inclui(outraSerie);
		System.out.println("Quantidade em minutos dos Títulos escolhidos:" + calculadora.getTempoTotal() + " minutos.");

		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		filtro.filtra(outroFilme);

		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(serie);
		episodio.setTotalVisualizacoes(50);
		filtro.filtra(episodio);

	}

}
