package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ex07_jdbc.DBConn;

public class J20210427_08_memberUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String passwd = "7777";
		String userid = "zzzz";
		String sql = "update member set passwd = ? where userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, passwd);
			pstmt.setString(2, userid);
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
