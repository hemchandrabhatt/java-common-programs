package Constructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ChildClass extends SupperClass {

	String driverName = "com.mysql.jdbc.Driver";
	String connectionPath = "jdbc:mysql://localhost:3306/databaseNmae";
	String userName = "root";
	String userPassword = "root";
	String query = "Select * from Table";

	public void getDataBaseConnection() {
		
		try {
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(connectionPath +" "+userName+" "+userPassword);
			java.sql.Statement smt = conn.createStatement();
			ResultSet res = smt.executeQuery("query");
			while(res.next()){
				System.out.println(res.getInt(1) +" "+ res.getString(2) +" "+ res.getString(3));
			}
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
