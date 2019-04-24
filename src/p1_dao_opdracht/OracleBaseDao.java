package p1_dao_opdracht;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
//this class is still not used here.
public abstract class OracleBaseDao {
	
	
// assumed it is a sql.connection.
	protected Connection getconnection() {
		return null;
	}
// this would probably get a variable to know how to close the connection.
	public void closeConnection() {
	}

}
