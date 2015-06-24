package application;
import java.sql.*;
public class DBConn {

	static private String connectionString = "jdbc:jtds:sqlserver://PC30071:1433/SchoolDistrict;instance=MSSQLServer";
	static private String connString =  "jdbc:jtds:sqlserver://PC30071:1433/SchoolDistrict;instance=MSSQLServer";
	static private String userName = "ngt";
	static private String password = "m5w14X55";
	static private ResultSet rs;
	static private Connection conn;
	
	public DBConn()
	{
		
	}
	
	static void loadDriver(){
		try{
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
		}catch (Exception e){
			System.out.println(String.format("Error: %s", e.getMessage()));
		}
	}
	
	static void createDB() throws SQLException
	{
		loadDriver();
		Connection conn = DriverManager.getConnection(connectionString, userName, password);
		try
		{
			String s = "IF NOT EXISTS(Select * From sys.databases where name = 'LearningDB') CREATE DATABASE LearningDB";
			PreparedStatement ps = conn.prepareStatement(s, Statement.RETURN_GENERATED_KEYS);
			ps.executeUpdate();
			
			s = "IF OBJECT_ID('[LearningDB].[dbo].[Person]', 'U') is null CREATE TABLE [LearningDB].[dbo].[Person](ID bigint NOT NULL PRIMARY KEY IDENTITY(1,1), FirstName varchar(100), LastName varchar(200), Address varchar(254), City varchar(254), State varchar(254), Zipcode varchar(100), Phone1 varchar(20), Phone2 varchar(20), Email varchar(254), RoleID int, Active bit, DistrictID int)";
			ps = conn.prepareStatement(s, Statement.RETURN_GENERATED_KEYS);
			ps.executeUpdate();
			
			s = "IF OBJECT_ID('[LearningDB].[dbo].[Role]', 'U') is null CREATE TABLE [LearningDB].[dbo].[Role](ID int NOT NULL PRIMARY KEY IDENTITY(1,1), Name varchar(254), Description varchar(254), DisplayOrder int, Active bit)";
			ps = conn.prepareStatement(s, Statement.RETURN_GENERATED_KEYS);
			ps.executeUpdate();
			
			s = "IF OBJECT_ID('[LearningDB].[dbo].[Messages]', 'U') is null CREATE TABLE [LearningDB].[dbo].[Messages](ID int NOT NULL PRIMARY KEY IDENTITY(1,1), PersonFromID bigint, Message varchar(254), MessageDate date. PersonToID bigint)";
			ps = conn.prepareStatement(s, Statement.RETURN_GENERATED_KEYS);
			ps.executeUpdate();
			
			s = "IF OBJECT_ID('[LearningDB].[dbo].[Lessons]', 'U') is null CREATE TABLE [LearningDB].[dbo].[Lessons](ID int NOT NULL PRIMARY KEY IDENTITY(1,1), LessonTitle varchar(254), LessonBody varchar(254), GradeLevel int, Active bit, PersonID bigint, DistrictID int)";
			ps = conn.prepareStatement(s, Statement.RETURN_GENERATED_KEYS);
			ps.executeUpdate();
			
			s = "IF OBJECT_ID('[LearningDB].[dbo].[District]', 'U') is null CREATE TABLE [LearningDB].[dbo].[District](ID int NOT NULL PRIMARY KEY IDENTITY(1,1), Name varchar(254), Address varchar(254), City varchar(254), State varchar(254), Zipcode varchar(100), Phone varchar(20), Email varchar(254), WebURL varchar(254), Fax varchar(20), Active bit)";
			ps = conn.prepareStatement(s, Statement.RETURN_GENERATED_KEYS);
			ps.executeUpdate();
			
			s = "IF OBJECT_ID('[LearningDB].[dbo].[Account]', 'U') is null CREATE TABLE [LearningDB].[dbo].[Account](ID int NOT NULL PRIMARY KEY IDENTITY(1,1), UserName varchar(254), Password varchar(254), PersonID bigint, Active bit)";
			ps = conn.prepareStatement(s, Statement.RETURN_GENERATED_KEYS);
			ps.executeUpdate();
		}
		catch (SQLException ex)
		{
			System.out.println("DBConn.createDB: " + ex.getMessage());
		}
		finally
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(String.format("Error: %s", e.getMessage()));
			}
		}
	}
	
	public static void update(String s) throws SQLException
	{
		loadDriver();
		conn = DriverManager.getConnection(connString, userName, password);
		try
		{
			PreparedStatement ps = conn.prepareStatement(s, Statement.RETURN_GENERATED_KEYS);
			ps.executeUpdate();
		}
		catch (SQLException ex)
		{
			System.out.println("DBConn.update: " + ex.getMessage());
		}
	}
	
	public static ResultSet query(String s) throws SQLException
	{
		loadDriver();
		conn = DriverManager.getConnection(connString, userName, password);
		try
		{
			PreparedStatement ps = conn.prepareStatement(s, Statement.RETURN_GENERATED_KEYS);
			rs = ps.executeQuery();
			return rs;
		}
		catch (SQLException ex)
		{
			System.out.println("DBConn.query: " + ex.getMessage());
			return rs;
		}
	}
	
	static void closeConn()
	{
		try {
			conn.close();
		} catch (SQLException ex) {		
			System.out.println("DBConn.closeConn: " + ex.getMessage());
		}
	}
}
