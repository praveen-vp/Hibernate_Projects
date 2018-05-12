package com.pvp.enc.employee;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "Employee_Mob_Register")
public class EmployeeMobReg {

	@Id
	@GeneratedValue(generator = "empIdGenerator") // name of the empId (primary key generator)
	@GenericGenerator(name = "empIdGenerator", strategy = "foreign",
			parameters = { @Parameter(value = "employee", name = "property") })
	private int empId;

	private String Mobile_Number;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empId")
	private Employee employee;

	/**
	 * 
	 */
	public EmployeeMobReg() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param empId
	 * @param mobile_Number
	 * @param employee
	 */
	public EmployeeMobReg(int empId, String mobile_Number, Employee employee) {
		this.empId = empId;
		Mobile_Number = mobile_Number;
		this.employee = employee;
	}

	public String getMobile_Number() {
		return Mobile_Number;
	}

	public void setMobile_Number(String mobile_Number) {
		Mobile_Number = mobile_Number;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
}
