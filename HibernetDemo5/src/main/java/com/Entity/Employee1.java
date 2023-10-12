package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emptab")
public class Employee1 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="eid")
	private Integer empId;
	
	public Integer getEmpId() {
		return empId;
	}



	public void setEmpId(Integer empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getEmpDept() {
		return empDept;
	}



	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}



	public Double getEmpSal() {
		return empSal;
	}



	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}



	@Column(name="ename")
	private String empName;
	
	@Column(name="dept")
	private String empDept;
	
	@Column(name="sal")
	private Double empSal;
	

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSal=" + empSal
				+ "]";
	}
	


	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee1(String empName, String empDept, Double empSal) {
		super();
		this.empName = empName;
		this.empDept = empDept;
		this.empSal = empSal;
	}



	
	
	

}
