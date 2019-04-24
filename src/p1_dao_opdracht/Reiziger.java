package p1_dao_opdracht;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reiziger {
	private String naam;
	// added to actually use dates as that is more useful later on
	private SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-YYYY");
	private Date gbdatum;
	
	
	public Reiziger(String naam, String datum) {
		super();
		this.naam = naam;
		try {
			this.gbdatum = sdf.parse(datum);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public Date getGbdatum() {
		return gbdatum;
	}
	public void setGbdatum(Date gbdatum) {
		this.gbdatum = gbdatum;
	}
	//to string is tijdelijk om de code leesbaarder te maken vanuit de main.
	@Override
	public String toString() {
		return "\nReiziger [naam=" + naam + ", gbdatum=" + gbdatum + "] ";
	}
	

}
