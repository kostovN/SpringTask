package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import config.MyConfig;
import domain.Podaci;
import report.IReport;

@Component(value = "main")
public class Main {

	private IReport report;

	public static void main(String[] args) {

		BeanFactory container = new AnnotationConfigApplicationContext(MyConfig.class);
		Main main = container.getBean("main",Main.class);
		Podaci podaci1 = container.getBean("podaci",Podaci.class);
		podaci1.setIndeks("123/2012");
		podaci1.setIspitni_rok("sept1");
		podaci1.setOcena(7);
		podaci1.setPredmet("mat02");
		podaci1.setProfesor("prof01");
		main.addPodaci(main.report, podaci1);
		
		Podaci podaci2 = container.getBean("podaci",Podaci.class);
		podaci1.setIndeks("13/2011");
		podaci1.setIspitni_rok("sept1");
		podaci1.setOcena(5);
		podaci1.setPredmet("inf02");
		podaci1.setProfesor("prof09");
		main.addPodaci(main.report, podaci2);
		
		Podaci podaci3 = container.getBean("podaci",Podaci.class);
		podaci1.setIndeks("3/2012");
		podaci1.setIspitni_rok("okt1");
		podaci1.setOcena(9);
		podaci1.setPredmet("rs06");
		podaci1.setProfesor("prof01");
		main.addPodaci(main.report, podaci3);
		main.printReport(main.report);

	}
	
	private void printReport(IReport report2) {
		report2.report("sept1");
		
	}

	void addPodaci(IReport report, Podaci podaci) {
		//poziv service-a
		report.save(podaci);
	}
	
	@Autowired
	@Qualifier(value = "reportPoRoku")
	public void setReport(IReport report) {
		this.report = report;
	}
	
	
}
