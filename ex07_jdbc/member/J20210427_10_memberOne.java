package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import ex07_jdbc.DBConn;

public class J20210427_10_memberOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		MemberDTO mem = null;
		ResultSet rs = null;
		String userid = "aaaa";
		String sql = "select * from member where userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String passwd = rs.getString("passwd");
				int birthyear = rs.getInt("birthyear");
				Date regdate = rs.getDate("regdate");
				mem = new MemberDTO(userid, passwd, birthyear, regdate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.printf("%s\t%s\t%d\t%s\n", mem.getUserid(), mem.getPasswd(), mem.getBirthyear(), mem.getRegdate());
		
		
	}

}
