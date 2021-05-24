package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ex07_jdbc.DBConn;

public class J20210427_09_memberDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String userid = "zzzz";
		String sql = "delete from member where userid= ?";
					  
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건");
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
