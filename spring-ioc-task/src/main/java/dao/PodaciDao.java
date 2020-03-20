package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import domain.Podaci;

@Component(value = "podaciDao")
public class PodaciDao {
	private List<Podaci> podaciLista;
	public PodaciDao() {
		podaciLista=new ArrayList<Podaci>();
	}
	public void save (Podaci podaci) {
		podaciLista.add(podaci);
	}
	public List<Podaci> getPodaciLista() {
		return podaciLista;
	}
	
	
	
}
