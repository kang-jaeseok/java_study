package ex07_jdbc.sales;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class junittest {

	@Test
	void test() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list = sdao.dayItemSalesList();
		for(Map<String,Object> map : list) {
			System.out.println(map);
		}
		System.out.println("------------");
		
		for(Map<String,Object> map : list) {
			System.out.print(map.get("saledate") + " ");
			System.out.print(map.get("seq") + " ");
			System.out.print(map.get("itemcode") + " ");
			System.out.print(map.get("itemname") + " ");
			System.out.print(map.get("qty") + " ");
			System.out.print(map.get("amount") + " ");
			System.out.println();
			
		}
		System.out.println("------------");
		
	}
	
	@Test
	void test2() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list = sdao.DayItemSummarySales();
		for(Map<String, Object> map : list) {
			System.out.print(map.get("saledate") + " ");
			System.out.print(map.get("itemcode") + " ");
			System.out.print(map.get("itemname") + " ");
			System.out.print(map.get("qty") + " ");
			System.out.print(map.get("amount") + " ");
			System.out.println();
		}
	}
	@Test
	void test3() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list = sdao.ItemSummarySales();
		for(Map<String, Object> map : list) {
//			System.out.print(map.get("itemcode") + " ");
//			System.out.print(map.get("itemname") + " ");
//			System.out.print(map.get("qty") + " ");
//			System.out.print(map.get("amount") + " ");
//			System.out.println();
			System.out.printf("%s %s %d %d\n", map.get("itemcode"), map.get("itemname"), map.get("qty"), map.get("amount"));
		}
	}
}

