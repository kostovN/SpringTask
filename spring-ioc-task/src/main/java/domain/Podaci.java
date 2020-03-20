package domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "podaci")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Podaci {
	private String ispitni_rok;
	private String predmet;
	private String profesor;
	private String indeks;
	private int ocena;
	public Podaci() {
		super();
	}
	public Podaci(String ispitni_rok, String predmet, String profesor, String indeks, int ocena) {
		super();
		this.ispitni_rok = ispitni_rok;
		this.predmet = predmet;
		this.profesor = profesor;
		this.indeks = indeks;
		this.ocena = ocena;
	}
	public String getIspitni_rok() {
		return ispitni_rok;
	}
	public void setIspitni_rok(String ispitni_rok) {
		this.ispitni_rok = ispitni_rok;
	}
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public String getIndeks() {
		return indeks;
	}
	public void setIndeks(String indeks) {
		this.indeks = indeks;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	@Override
	public String toString() {
		return "Podaci [ispitni_rok=" + ispitni_rok + ", predmet=" + predmet + ", profesor=" + profesor + ", indeks="
				+ indeks + ", ocena=" + ocena + "]";
	}
	
	

}
