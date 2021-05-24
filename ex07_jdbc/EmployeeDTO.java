package ex07_jdbc;

import java.util.Date;

public class EmployeeDTO {
	private int employee_id;
	private String first_name;
	private int salary;
	private Date hire_date;

	public EmployeeDTO(int employee_id, String first_name, int salary, Date hire_date) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.salary = salary;
		this.hire_date = hire_date;
	}


	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employee_id=" + employee_id + ", first_name=" + first_name + ", salary=" + salary
				+ ", hire_date=" + hire_date + "]";
	}

}
