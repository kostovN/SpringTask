package report;

import domain.Podaci;

public interface IReport {
	void report(String param);

	void save(Podaci podaci);
}
