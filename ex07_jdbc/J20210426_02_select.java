package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210426_02_select {
	public static void main(String[] args) {
		Connection conn = DBConn.getConn();
	
		Statement stmt = null;
		ResultSet rs = null;
		List<Regions> list= new ArrayList<>();
		
		
		try {
			stmt = conn.createStatement();
			String sql = "select * from regions order by region_name";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				//
				int region_id = rs.getInt("region_id");
				String region_name = rs.getString("region_name");
				Regions region = new Regions(region_id, region_name);
				//region.setRegion_id(region_id);
				//region.setRegion_name(region_name);
				list.add(region);
				//list.add(new Regions(region_id, region_name));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)	rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("---------------------------------");
		//출력(출력하는 부분과 받아오는 부분이 다르게)
		for(Regions r : list) {
			
			System.out.printf("%2s\t%s\n", r.getRegion_id(), r.getRegion_name());
		}
		System.out.println("---------------------------------");
		for(int i = 0; i < list.size(); i++) {
			Regions r = list.get(i);
			System.out.printf("%2s\t%s\n", r.getRegion_id(), r.getRegion_name());
		}
		
		
		
		
		
	}
}
