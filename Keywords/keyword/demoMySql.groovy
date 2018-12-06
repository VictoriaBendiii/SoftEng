package keyword


import com.kms.katalon.core.annotation.Keyword

import java.sql.Connection;
import java.sql.DriverManager;


public class demoMySql {

	private static Connection connection = null;

	@Keyword

	def connectDB(String host, String port, String sid, String username, String password){

		Class.forName("oracle.jdbc.driver.OracleDriver")

		if(connection != null && !connection.isClosed()){

			connection.close()
		}
		connection = DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":" + port + ":" + sid, username, password)
		return connection
	}

	@Keyword
	def closeDatabaseConnection() {

		if(connection != null && !connection.isClosed()){

			connection.close()
		}

		connection = null
	}
}
