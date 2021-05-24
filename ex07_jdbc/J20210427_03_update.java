package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J20210427_03_update {
	public static void main(String[] args) {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		
		//String sql = "update item set itemname = '제로콜라' where itemcode = '8802'";
		String itemname = "칠성사이다";
		String itemcode = "8801";
		String sql = "update item set itemname = ? where itemcode = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, itemname);
			pstmt.setString(2, itemcode);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
