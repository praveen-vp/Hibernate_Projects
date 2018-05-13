package com.pvp.enc.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	private String name;
	private String job;
	private String department;

	@Override
	public String toString() {
		return String.format(
				"Employee [empId=%s, name=%s, job=%s, department=%s]", empId,
				name, job, department);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @param empId
	 * @param name
	 * @param job
	 * @param department
	 */
	public Employee(int empId, String name, String job, String department) {
		this.empId = empId;
		this.name = name;
		this.job = job;
		this.department = department;
	}

	public Employee() {

	}
}
