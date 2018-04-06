package Constructor;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SupperClass {

	public static void main(String args[]){  
		
		System.out.println("MySql Database connection started");
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc.mysql://localhost:3306/sonno", "root","root");
			Statement smt=conn.createStatement();
			ResultSet res =smt.executeQuery("");
			while(res.next()){
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3));
			}
			conn.close();
		}catch(Exception ie){
			System.out.println(ie);
	}
		System.out.println("Database connection end");
}
}
