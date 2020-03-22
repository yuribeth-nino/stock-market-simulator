package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import data.DataSource;
/**
*
* @author Ana Velazco, Yuribeth Contreras
*/
public class DataSource {
	
	private String db = "jdbc:mysql://mydbinstance.czxjatizn5kf.eu-west-1.rds.amazonaws.com:3306/sotckmarket?useSSL=false";
    private String un = "test";
    private String pw = "Strachatella.15**51.";
	
	private  Connection conn;
	private Statement stmt;
	
	private static DataSource instance = new DataSource();
	
	private DataSource() {

		try{
			
			// Get a connection to the database
			conn = DriverManager.getConnection( db, un, pw ) ;

			// Get a statement from the connection
			stmt = conn.createStatement() ;
			
		}
		catch( SQLException se ){
			System.out.println( "SQL Exception:" ) ;

			// Loop through the SQL Exceptions
			while( se != null ){
				System.out.println( "State  : " + se.getSQLState()  ) ;
				System.out.println( "Message: " + se.getMessage()   ) ;
				System.out.println( "Error  : " + se.getErrorCode() ) ;

				se = se.getNextException() ;
			}
		}
		catch( Exception e ){
			System.out.println( e ) ;
		}
		
	}
	
	// THIS IS GOING TO BE A GENERIC METHOD TO DO
	// ANY SELECT STATEMENT THAT WE PASS IN USING THE
	// QUERY VARIABLE
	public ResultSet select(String query) {
		// Execute the query
		ResultSet rs = null;
		try {
			 rs = stmt.executeQuery( query ) ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	// THIS IS GOING TO BE A GENERIC METHOD TO DO
	// ANY INSERT STATEMENT THAT WE PASS IN USING THE 
	// QUERY VARIABLE
	public boolean save(String query) {
		
		try {
			
			// NOTE THAT HERE WE WON'T NEED
			// ANY RESULT SET, AS AN INSERT STATEMENT
			// DOES NOT RETURN VALUES
			stmt.execute( query );
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
	}
	
	// AND FINALLY WE HAVE A SEPARATE METHOD TO 
	// CLOSE THE STATEMENT AND THE CONNECTION
	public void closing() {
		try {
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static DataSource getInstance() {
		return instance;
	}


}
