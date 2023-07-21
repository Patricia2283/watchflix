package br.com.watchflix.calculos;

public class FiltroRecomendacao {

	//private String recomendacao;
	
	public void filtra(Classificavel classificavel) {
		if (classificavel.getClassificacao() > 4) {
			System.out.println("Está entre os títulos preferidos do momento.");
		} else if (classificavel.getClassificacao() >= 2) {
			System.out.println("Esse título está bem avaliado no momento.");
		}else {
			System.out.println("Assista e dê a sua avaliação.");
		}
	}
}
