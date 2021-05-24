package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class J20210427_01_emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DBConn.getConn();
		Statement stmt = null;
		ResultSet rs = null;
		List<EmployeeDTO> emp = new ArrayList<>();
		
		try {
			stmt = conn.createStatement();
			String sql = "select employee_id, first_name, salary, hire_date from employees "
					+ "where salary >= 10000 order by salary desc";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int employee_id = rs.getInt("employee_id");
				String first_name = rs.getString("first_name"); 
				int salary = rs.getInt("salary");
				Date hire_date = rs.getDate("hire_date");
			
				EmployeeDTO empdto = new EmployeeDTO(employee_id, first_name, salary, hire_date);
				emp.add(empdto);
				
				//emp.add(new EmployeeDTO(employee_id, first_name, salary, hire_date));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				if(rs != null)   rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();	
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(EmployeeDTO dto : emp)
			System.out.printf("%3d\t%-10s\t%-5d\t%-20s\n", dto.getEmployee_id(), dto.getFirst_name().toUpperCase(), 
					dto.getSalary(), dto.getHire_date());
		
	}

}
