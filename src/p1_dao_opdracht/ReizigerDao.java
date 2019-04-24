package p1_dao_opdracht;

import java.util.ArrayList;

public interface ReizigerDao {
	// deze class kan nu nog helemaal niks.
	public ArrayList<Reiziger> findall();
	public ArrayList<Reiziger> findByGBdatum(String GBdatum);
	public Reiziger save(Reiziger r);
	public Reiziger update(Reiziger r);
	public boolean delete(Reiziger r);
	public void closeConnection();
	
}
