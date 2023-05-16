package jdbcProject;

import java.sql.SQLException;
import java.time.LocalDate;

public class mainProject {

	public static void main(String[] args)  {
		dbConnection db;
		try {
			db = new dbConnection();
			students s1=new students( "luigi","iossa","m",LocalDate.of(1999,9,23),12,12,12);
			students s2=new students( "marco","bruti","m",LocalDate.of(1988,10,31),14,14,14);
			students s3=new students( "asia","ricoria","f",LocalDate.of(2001,2,07),8,8,8);
			db.cancellaStudente(5);
		} catch (SQLException e) {			
			e.printStackTrace();
		}

	}

}
