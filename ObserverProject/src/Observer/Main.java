package Observer;

public class Main {

	public static void main(String[] args) {
		Noticia noticia = new Noticia("Neymar � vendido para o Barcelona e passa a ser o jogador mais caro da hist�ris do Futebol", 1, 4, "Esporte");
		new NoticiarioAssina(noticia);
		
		noticia.setDia(3);		
		noticia.setMes(12);
		noticia.setTopico("Famosos");
	}
}
