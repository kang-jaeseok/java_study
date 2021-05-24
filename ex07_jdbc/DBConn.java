package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	//컨넥션을 리턴하는 메소드
	public static Connection getConn() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Loading complete");
			conn = DriverManager.getConnection(url, user, passwd);
			//System.out.println("Connection Success");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver does not exist.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Connection fail");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//접속 실패 시 종료
		
		
		if(conn == null) {
			
			System.exit(0);
		}
		
		return conn;
	}
}
