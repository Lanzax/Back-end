package jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnection {
	String url = "jdbc:postgresql://localhost:5432/";
	String dbName = "jdbcEx";
	String user = "postgres";
	String pass = "root";
	Connection conn;
	Statement st;
	public dbConnection() throws SQLException {
		conn = DriverManager.getConnection(url+dbName, user, pass);
		st = conn.createStatement();
		System.out.println("DB Connesso!!");
	}
	public void inserisciStudente(students s) throws SQLException {
		String sql="INSERT INTO school_students(name,lastname,gender,birthdate,avg,min_vote,max_vote)"+
				"VALUES ('"+s.getName()+"', "
				+ "'"+s.getLastname()+"', "
				+ "'"+s.getGender()+"', "
				+ "'"+s.getBirthdate()+"', "
				+ "'"+s.getAvg()+"', "
				+ "'"+s.getMin_vote()+"', "
				+ "'"+s.getMax_vote()+"') ";
		st.executeUpdate(sql);
		System.out.println(s.getName()+" "+s.getLastname()+" è stato salvato correttamente!!");
	}
	public void modificaStudente(students s) throws SQLException {
		String sql="UPDATE school_students SET'"
				+ "nome = '"+s.getName()+"', "
				+ "lastname = '"+s.getLastname()+"', "
				+ "gender = '"+s.getGender()+"', "
				+ "birthday = '"+s.getBirthdate()+"', "
				+ "avg = '"+s.getAvg()+"', "
				+ "min_vote = '"+s.getMin_vote()+"', "
				+ "max_vote = '"+s.getMax_vote()+"', "
				+ "WHERE id = " + s.getId();
				
		st.executeUpdate(sql);
		System.out.println(s.getName()+" "+s.getLastname()+" è stato modificato correttamente!!");
	}
	public void cancellaStudente(students s) throws SQLException {
		String sql = "DELETE FROM school_students WHERE id = " + s.getId();
		st.executeUpdate(sql);
		System.out.println( s.getName() + " " + s.getLastname() + " eliminato nel DB!!");
	}
}
