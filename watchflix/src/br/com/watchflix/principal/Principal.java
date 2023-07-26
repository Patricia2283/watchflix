package br.com.watchflix.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.watchflix.calculos.CalculadoraDoTempo;
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
		System.out.println("Média das avaliações:" + meuFilme.pegaMedia());

		System.out.println("\n*******************************\n");

		Filme outroFilme = new Filme("Avatar", 2023);
		outroFilme.setDuracaoEmMinutos(200);
		outroFilme.exibeFichaTecnica();
		outroFilme.avalia(3);
		outroFilme.avalia(2);
		outroFilme.avalia(4);
		System.out.println("Média das avaliações:" + outroFilme.pegaMedia());

		System.out.println("\n*******************************\n");

		Filme maisUmFilme = new Filme("A Bruxa de Blair", 2004);
		maisUmFilme.setDuracaoEmMinutos(120);
		maisUmFilme.exibeFichaTecnica();
		maisUmFilme.avalia(8);
		maisUmFilme.avalia(7);
		maisUmFilme.avalia(6);
		System.out.println("Média das avaliações:" + maisUmFilme.pegaMedia());

		System.out.println("\n*******************************\n");

		List<Filme> meusFilmes = new ArrayList<>();
		meusFilmes.add(meuFilme);
		meusFilmes.add(outroFilme);
		meusFilmes.add(maisUmFilme);
		Collections.sort(meusFilmes);
		System.out.println("A sua lista contém " + meusFilmes.size() + " títulos:" + meusFilmes);

		System.out.println("\n*******************************\n");

		Serie serie = new Serie("Dark", 2017);
		serie.setTemporadas(3);
		serie.setEpisodiosPorTemporada(8);
		serie.setMinutosPorEpisodio(55);
		serie.setDuracaoEmMinutos(serie.getDuracaoEmMinutos());
		serie.exibeFichaTecnica();
		serie.avalia(10);
		serie.avalia(8);
		serie.avalia(9);
		System.out.println("Média das avaliações:" + serie.pegaMedia());

		System.out.println("\n*******************************\n");

		Serie outraSerie = new Serie("The Sinner", 2018);
		outraSerie.setTemporadas(4);
		outraSerie.setEpisodiosPorTemporada(6);
		outraSerie.setMinutosPorEpisodio(50);
		outraSerie.setDuracaoEmMinutos(outraSerie.getDuracaoEmMinutos());
		outraSerie.exibeFichaTecnica();
		outraSerie.avalia(10);
		outraSerie.avalia(10);
		outraSerie.avalia(9.5);
		System.out.println("Média das avaliações:" + outraSerie.pegaMedia());

		System.out.println("\n*******************************\n");

		Serie maisUmaSerie = new Serie("Euphoria", 2022);
		maisUmaSerie.setTemporadas(2);
		maisUmaSerie.setEpisodiosPorTemporada(8);
		maisUmaSerie.setMinutosPorEpisodio(55);
		maisUmaSerie.setDuracaoEmMinutos(maisUmaSerie.getDuracaoEmMinutos());
		maisUmaSerie.exibeFichaTecnica();
		maisUmaSerie.avalia(10);
		maisUmaSerie.avalia(9);
		maisUmaSerie.avalia(9.5);
		System.out.println("Média das avaliações:" + maisUmaSerie.pegaMedia());

		List<Serie> minhasSeries = new ArrayList<>();
		minhasSeries.add(serie);
		minhasSeries.add(outraSerie);
		minhasSeries.add(maisUmaSerie);
		Collections.sort(minhasSeries);
		System.out.println("A sua lista contém " + minhasSeries.size() + " títulos:" + minhasSeries);

		System.out.println("\n************************\n");

		CalculadoraDoTempo calculadora = new CalculadoraDoTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(serie);
		calculadora.inclui(outraSerie);
		calculadora.inclui(maisUmaSerie);
		System.out.println("Quantidade em minutos dos Títulos escolhidos:" + calculadora.getTempoTotal() + " minutos.");

		System.out.println("\n*******************************\n");



	}

}
