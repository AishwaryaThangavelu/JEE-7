/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one2one;

import aish.vaishno.hibernatesample.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author aishwarya
 */
public class One2OneExecuter {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employee employee = new Employee();
        //   employee.setEmployeeId(2);
        employee.setEmployeeName("Kala");

        EmployeeAddress empAddress = new EmployeeAddress();
        //  empAddress.setEmpAddId(2);
        empAddress.setEmpAddstate("KPM");
        empAddress.setEmpAddcountry("India");
        //  empAddress.setEmpId(2);
        employee.setEmployeeAddress(empAddress);
        empAddress.setEmployee(employee);

        //session.save(employee);
       // session.getTransaction().commit();

        List<Employee> empList = (List<Employee>) session.createCriteria(Employee.class).list();
        for (Employee emp : empList) {
            System.out.println("emp=> " + emp.getEmployeeAddress());
        }
    }

}
