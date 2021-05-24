package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ex07_jdbc.DBConn;

//데이터베이스에 접근하는 메소드들의 모음
//
public class MemberDAO {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	// 전체 조회
	List<MemberDTO> selectList() {
		List<MemberDTO> mlist = new ArrayList<>();
		conn = DBConn.getConn();
		String sql = "select * from member";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String userid = rs.getString("userid");
				String passwd = rs.getString("passwd");
				int birthyear = rs.getInt("birthyear");
				Date regdate = rs.getDate("regdate");
				MemberDTO mdto = new MemberDTO(userid, passwd, birthyear, regdate);
				mlist.add(mdto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
		}

		return mlist;
	}
	// 한건조회

	MemberDTO selectOne(String userid) {
		MemberDTO mdto = null;
		//MemberDTO mdto = new MemberDTO();
		conn = DBConn.getConn();
		String sql = "select * from member where userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if (rs.next()) {

				String passwd = rs.getString("passwd");
				int birthyear = rs.getInt("birthyear");
				Date regdate = rs.getDate("regdate");
//				mdto.setUserid(userid);
//				mdto.setPasswd(passwd);
//				mdto.setRegdate(regdate);
//				mdto.setBirthyear(birthyear);
//				
				mdto = new MemberDTO(userid, passwd, birthyear, regdate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disConnect();
		}

		return mdto;
	}

	// 추가
	int insert(MemberDTO mdto) {
		int cnt = 0;
		conn = DBConn.getConn();
		String sql = "insert into member (userid, passwd, birthyear) values (?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mdto.getUserid());
			pstmt.setString(2, mdto.getPasswd());
			pstmt.setInt(3, mdto.getBirthyear());
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			cnt = 0;
		}finally {
			disConnect();
		}
		return cnt;
	}

	// 수정
	int update(MemberDTO mdto) {
		int cnt = 0;
		conn = DBConn.getConn();
//		String sql = "update member"
//				+ " set passwd = ?, "
//				+ "birthyear = ? "
//				+ "where userid = ?";
		StringBuffer sql = new StringBuffer();
		sql.append("update member ");
		sql.append("set passwd = ?, ");
		sql.append("birthyear = ? ");
		sql.append("where userid = ?");
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, mdto.getPasswd());
			pstmt.setInt(2, mdto.getBirthyear());
			pstmt.setString(3, mdto.getUserid());
			
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disConnect();
		}
		
		return cnt;
	}
	// 삭제

	int delete(String userid) {
		int cnt = 0;
		conn = DBConn.getConn();
		String sql = "delete from member where userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disConnect();
		}
		
		return cnt;
	} 

//	public static void connection() {
//		conn = DBConn.getConn();
//	}
	public static void disConnect() {
		try {
			if (rs != null)		rs.close();
			if (pstmt != null)	pstmt.close();
			if (conn != null)	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
