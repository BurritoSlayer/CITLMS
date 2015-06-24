package application;
/*
 * Connection to the database
 * 
 * ntacey
 * 2015.5.11
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class DBconnection {
	
	private String showData; /** a string that temporarily holds our output data
							  *  possibly change to a String Builder later?
							  */
	
	DBconnection() {
			try {
				Class.forName("net.sourceforge.jtds.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("SQL Driver error: " + e.getMessage());
			}
	}
	/*
	 * DBconn takes the query we feed it as a string parameter
	 */
	public void query(String str)
   	{      
		test("jdbc:jtds:sqlserver://PC30071:1433/SchoolDistrict;instance=MSSQLServer","ngt","m5w14X55", str);
	}
		
	/*
	 * text requires the databases url, the users id and their password. Also takes in the query we want
	 * as a string parameter
	 */
	public void test(String db_connect_string, String db_userid, String db_password, String str)
 	{
		try 
		{
			Connection conn = DriverManager.getConnection(db_connect_string, db_userid, db_password); //connects to db 
			PreparedStatement ps = conn.prepareStatement(str, Statement.RETURN_GENERATED_KEYS); 
			ResultSet rs = ps.executeQuery();       
			ResultSetMetaData rsmd = rs.getMetaData(); //grabs the dbs meta data which houses how many columns it has
		    System.out.println("querying SELECT * FROM XXX");
		    int columnsNumber = rsmd.getColumnCount();
		    while (rs.next()) { //loops through the data table
		        for (int i = 1; i <= columnsNumber; i++) {
		            String columnValue = rs.getString(i);
		            showData = showData + "\n" + columnValue; //sets our showData to whatever data value was in this slot
		            System.out.println(showData); //prints our show data, which should be our column value plus whatever was in showdata
		            System.out.println(columnValue); //the value of this column's record
		        }
		        System.out.println("");
		    }
		    conn.close(); //closes the connection with our db
		}
		catch (Exception e) //this will catch any issues that come from the db, such as bad connection or invalid column name
		{
			   System.out.println("DBConn test method error: " + e.getMessage());
		}
 	}
	/**
	 * sets our temporary show data
	 * @param string
	 */
	public void setShowData(String string){
		this.showData = string;
	}
	/**
	 * returns our temporary show data
	 * @return
	 */
	public String getShowData(){
		return this.showData;
	}
}
