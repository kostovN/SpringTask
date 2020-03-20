package report.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dao.PodaciDao;
import domain.Podaci;
import report.IReport;

@Component(value = "reportPoRoku")
public class ReportPoRoku implements IReport{

	private PodaciDao podaciDao;
	
	public void report(String param) {
		
		int broj_studenata =0;
		List<Podaci> podaciLista = podaciDao.getPodaciLista();
		for (Podaci podaci : podaciLista) {
			if(podaci.getOcena()>5 && podaci.getIspitni_rok().equals(param)) {
				broj_studenata++;
			}
		}
		System.out.println("Broj studenata koji su polozili neki ispit u roku : " + param +" je: " +broj_studenata);
		
		
	}
	
	@Autowired
	@Qualifier(value = "podaciDao")
	public void setPodaciDao(PodaciDao podaciDao) {
		this.podaciDao = podaciDao;
	}

	public void save(Podaci podaci) {
		podaciDao.save(podaci);
	}

}
