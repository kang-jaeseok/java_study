package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class J20210427_02_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DBConn.getConn();
		
		//Statement stmt = null;
		
		PreparedStatement pstmt = null;
		// 자바에선 default auto commit
		String itemcode;
		String itemname;
		int price;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("itmecode 입력 : "); itemcode = sc.next();		sc.nextLine();
		System.out.print("itmename 입력 : "); itemname = sc.nextLine();
		System.out.print("price 입력 : "); 	price = sc.nextInt();

//		String sql = "insert into item (itemcode, itemname, price) "
//		+ "values('" + itemcode + "', '" + itemname + "', " + price + ")";
		String sql = "insert into item (itemcode, itemname, price) values(?,?,?)";
		System.out.println(sql);
		try {
			//conn.setAutoCommit(false);
			//stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			
			//sql문의 ?에 값 대치
			pstmt.setString(1, itemcode);
			pstmt.setString(2, itemname);
			pstmt.setInt(3, price);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt);
			
			//conn.commit(); //두개 이상의 table에 접근해서 작업을 하는데 commit이나 rollback을 해야 할 경우
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql문 예외");
			e.printStackTrace();
		} finally {

			try {
				
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("프로그램 종료");
	}

}
