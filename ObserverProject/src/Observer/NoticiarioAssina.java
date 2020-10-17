package Observer;

public class NoticiarioAssina extends Noticiario {
	
	public NoticiarioAssina(Noticia noticia)
	{
		this.noticia = noticia;
		this.noticia.attach(this);
	}	
	
	@Override
	public void NotificaNoticia() {
		System.out.println("Dia: " + this.noticia.getDia());
		System.out.println("Mês: " + this.noticia.getMes());
		System.out.println("Tema: " + this.noticia.getTopico());
		System.out.println("Notícia: " + this.noticia.getTextoNoticia());
		
	}

}
