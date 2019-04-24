package p1_dao_opdracht;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ReizigerOracleDaoImpl extends OracleBaseDao implements ReizigerDao{
	
	//temporary arraylist to act as database.
	private ArrayList<Reiziger> reizigers = new ArrayList();	
	public ReizigerOracleDaoImpl() {
		//temporary fake database.
		String date1="01-10-2000";
		String date2="01-10-1323";
		Reiziger r1 = new Reiziger("bibby",date1);
		Reiziger r2= new Reiziger("bobby",date2);
		reizigers.add(r1);
		reizigers.add(r2);

	}
	public ArrayList<Reiziger> findall() {
		// TODO Auto-generated method stub
		//you would make an connection here for now it just returns all reizigers
		return reizigers;
	}

	@Override
	//Ik sla deze over omdat ik hem wil aanpassen later, ik heb alsnog 2 verschillende crud statements.
	public ArrayList<Reiziger> findByGBdatum(String GBdatum) {

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//in het klassediagram staat dat hij een reiziger moet teruggeven? persoonlijk zou ik een boolean gebruiken.
	public Reiziger save(Reiziger r){
		// TODO Auto-generated method stub
		reizigers.add(r);
		return r;
	}

	@Override
	//in het klassediagram staat dat hij een reiziger moet teruggeven? Ik heb deze nog niet gedaan omdat de code vaag is in de originele plaatjes.
	public Reiziger update(Reiziger r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//Een boolean zou boven ook handiger zijn
	public boolean delete(Reiziger r) {
		// TODO Auto-generated method stub
		int arrayLength = reizigers.size();
		reizigers.remove(r);
		if(arrayLength>reizigers.size()) {
			return true;
		}
		return false;
	}

}
