package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ex07_jdbc.DBConn;

public class J20210427_07_memberInsert {
	public static void main(String[] args) {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "insert into member (userid, passwd, birthyear) values (?, ?, ?)";
		String userid = "zzzz";
		String passwd = "9999";
		int birthyear = 1999;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, passwd);
			pstmt.setInt(3, birthyear);
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
