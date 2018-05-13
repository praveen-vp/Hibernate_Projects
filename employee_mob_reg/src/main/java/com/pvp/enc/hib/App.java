package com.pvp.enc.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pvp.enc.employee.Employee;
import com.pvp.enc.employee.EmployeeMobReg;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("Praveen");
		emp.setDepartment("java");
		emp.setJob("programmer");

		System.out.println(emp.toString());

		EmployeeMobReg empReg = new EmployeeMobReg();
		empReg.setMobile_Number("9745639305");

		// adding employee to empReg
		empReg.setEmployee(emp);

		Configuration conf = new Configuration().configure()
				.addAnnotatedClass(EmployeeMobReg.class);

		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();

		session.save(empReg);
		tx.commit();
		session.close();
	}
}
