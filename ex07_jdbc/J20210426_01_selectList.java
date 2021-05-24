package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class J20210426_01_selectList {
	static Connection conn; //필드는 자동 초기화
//	static Statement stmt;
//	static ResultSet rs;
	public static void main(String[] args) {
		//static은 객체가 만들어기전에 메모리에 올라감
		//객체를 만들지 않아도 접근 가능
		//static 메소드 안에서는 static를 써야한다.
		//static Connection conn;은 static필드로 선언
		// oracle DB connection
		//Connection conn = null; //지역변수 반드시 초기화 필요
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Loading complete");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("Connection Success");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver does not exist.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Connection fail");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//접속 실패 시 종료A
		if(conn == null) {
			
			System.exit(0);
		}
		//db 정보 select
		Statement stmt = null;
		ResultSet rs = null;
		List<Countries> clist = new ArrayList<>();
		try {
			//
			stmt = conn.createStatement();
			//세미콜론 빼야함
			String sql = "select * from countries where region_id = 2";
			//조회 
			rs = stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				String country_id =  rs.getString("country_id");
				String country_name = rs.getString("country_name");
				int region_id = rs.getInt("region_id");
				//Countries c = new Countries(country_id, country_name, region_id);
				//clist.add(c);
				clist.add(new Countries(country_id, country_name, region_id));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQL Exception");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)	rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("-----------------------------------------");
		//출력(출력하는 부분과 받아오는 부분이 다르게)
		for(Countries c : clist) {
			System.out.printf("%2s\t%-25s\t%2s\n", c.getCountry_id(), c.getCountry_name(), c.getRegion_id());
		}
		System.out.println("------------------------------------------");
		for(int i = 0; i < clist.size(); i++) {
			Countries c = clist.get(i);
			System.out.printf("%2s\t%-25s\t%2s\n", c.getCountry_id(), c.getCountry_name(), c.getRegion_id());
			
			//System.out.printf("%2s\t%-25s\t%2s\n", clist.get(i).getCountry_id(),clist.get(i).getCountry_name(),clist.get(i).getRegion_id());
		}
	}

}
