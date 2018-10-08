package ca.qc.rasssaker.modele;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

 public class DBManager {
	private static Connection con;
	private static Statement stm;
	private static String serverName;
	private static String database;
	private static String user;
	private static String password;
	private static int port;
	
	public static Connection createConnection(String serverName, String database, String user, String password, int port) throws ClassNotFoundException, SQLException{

		Class.forName("com.mysql.jdbc.Driver");	
		DBManager.serverName = serverName;
		DBManager.database = database;
		DBManager.user = user;
		DBManager.password = password;
		DBManager.port = port;
		
		String connectionUrl = "jdbc:mysql://"+ serverName + ":" + port + "/" + database + "?user=" + user + "&password="+password+"&useSSL=false";

		con = DriverManager.getConnection(connectionUrl);
		JOptionPane.showMessageDialog(null,"Connection Succesful");
		return con;
	}
	
	public static int executeUpdate(String requete) throws SQLException{
			Statement stm = con.createStatement();
			int nombreLigne = stm.executeUpdate(requete);
			stm.close();
			return nombreLigne;
	}
	
	public static ResultSet executeQuery(String requete) throws SQLException{
		Statement stm = con.createStatement();
		ResultSet res = stm.executeQuery(requete);
		return res;
	}
	
	public static void fermerConnection() throws SQLException{
		con.close();
	}
	
}
