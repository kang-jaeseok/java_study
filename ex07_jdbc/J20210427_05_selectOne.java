package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class J20210427_05_selectOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String itemcode = "8803";
		String sql = "select * from item\r\n" + 
				"where itemcode = ?";
		ItemDTO idto = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, itemcode);
			rs = pstmt.executeQuery();
			if(rs.next()) { //rs는 처음에 header 위치. rs.next()한번 해야함 //data가 한건있다면
				
//				String itemname = rs.getString("itemname");
//				int price = rs.getInt("price");
//				String bigo = rs.getString("bigo");
//				Date regdate = rs.getDate("regdate");
//				idto = new ItemDTO(itemcode, itemname, price, bigo, regdate);
				idto = new ItemDTO(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDate(5));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-------------------------------------------");
		System.out.printf("%s\t%s\t%d\t%s\t%s \n", idto.getItemcode(), idto.getItemname(), idto.getPrice(), idto.getBigo(), idto.getRegdate());
		System.out.println("-------------------------------------------");
	}

}
