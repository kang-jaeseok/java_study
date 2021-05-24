package ex07_jdbc.sales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ex07_jdbc.DBConn;

public class SalesDAO {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	//일일 상품 판매 리스트
	List<Map<String, Object>> dayItemSalesList(){
		
		List<Map<String, Object>> list = new ArrayList<>();
		conn = DBConn.getConn();
		StringBuffer sb = new StringBuffer();
		sb.append("select s.saledate, s.seq,  s.itemcode, i.itemname, s.qty, s.amount ");
		sb.append("from sales s ");
		sb.append("join item i ");
		sb.append("on (s.itemcode = i.itemcode) ");
		sb.append("order by  s.saledate, qty");
		try {
			
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				
				String saledate = rs.getString("saledate");
				int seq = rs.getInt("seq");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				//System.out.printf("%s %d %s %s\t%d %d\n", saledate, seq, itemcode, itemname, qty, amount);
				Map <String, Object> map = new HashMap<>();
				map.put("saledate", saledate);
				map.put("seq", seq);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disConnect();
		}
		
		return list;
	}
	List<Map<String, Object>> DayItemSummarySales() {
		conn = DBConn.getConn();
		StringBuffer sb = new StringBuffer();
		List<Map<String, Object>> list = new ArrayList<>();
		
		sb.append("select s.saledate, s.itemcode, i.itemname, sum(s.qty) qty, sum(s.amount) amount ");
		sb.append("from sales s ");
		sb.append("join item i ");
		sb.append("on (s.itemcode = i.itemcode) ");
		sb.append("group by s.saledate, s.itemcode, i.itemname ");
		sb.append("order by s.saledate, qty");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String saledate = rs.getString("saledate");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				Map<String, Object> map = new HashMap<>();
				map.put("saledate", saledate);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disConnect();
		}
		
		
		return list;
	}
	List<Map<String, Object>> ItemSummarySales() {
		conn = DBConn.getConn();
		StringBuffer sb = new StringBuffer();
		List<Map<String, Object>> list = new ArrayList<>();
		
		sb.append("select s.itemcode, i.itemname, sum(s.qty) qty, sum(s.amount) amount ");
		sb.append("from sales s ");
		sb.append("join item i ");
		sb.append("on (s.itemcode = i.itemcode) ");
		sb.append("group by s.itemcode, i.itemname ");
		sb.append("order by s.itemcode");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				Map<String, Object> map = new HashMap<>();
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
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
