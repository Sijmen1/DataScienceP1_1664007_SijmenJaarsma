package p1_dao_opdracht;
import java.util.Date;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Main {
//1664007, Sijmen Jaarsma
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ReizigerOracleDaoImpl RD1 = new ReizigerOracleDaoImpl();
		

		Reiziger reiziger = new Reiziger("anders babsen", "09-09-2014");
		System.out.println(RD1.save(reiziger));
		System.out.print(RD1.findall());
		System.out.println(RD1.delete(reiziger)+"\n");
		System.out.print(RD1.findall());
	
	}

			
		
		

	

}
