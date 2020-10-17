package Observer;

import java.util.ArrayList;
import java.util.List;

public class Noticia {
	private String textoNoticia;
	private int dia;
	private int mes;
	private String topico;
	private List<Noticiario> noticiarios = new ArrayList<Noticiario>();	
	
	public String getTextoNoticia() {
		return textoNoticia;
	}

	public void setTextoNoticia(String textoNoticia) {
		this.textoNoticia = textoNoticia;
		NotifyAllNoticiarios();
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
		NotifyAllNoticiarios();
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
		NotifyAllNoticiarios();
	}

	public String getTopico()
	{
		return topico;
	}
	
	public void setTopico(String topico)
	{
		this.topico = topico;
		NotifyAllNoticiarios();		
	}	
			
	public Noticia(String textoNoticia, int dia, int mes, String topico)
	{
		this.textoNoticia = textoNoticia;
		this.dia = dia;
		this.mes = mes;
		this.topico = topico;
	}		
	
	public void attach(Noticiario noticiario)
	{
		noticiarios.add(noticiario);
		NotifyAllNoticiarios();
	}
	
	public void dettach(Noticiario noticiario)
	{
		noticiarios.remove(noticiario);
	}

	public void NotifyAllNoticiarios() {
		// TODO Auto-generated method stub
		for (Noticiario noticia : noticiarios)
		{
			noticia.NotificaNoticia();
		}
	}
	
	
}
