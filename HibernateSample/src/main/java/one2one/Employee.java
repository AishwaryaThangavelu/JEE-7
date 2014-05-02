/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package one2one;

/**
 *
 * @author aishwarya
 */
public class Employee {

   
    private Integer employeeId;
    private String employeeName;
    private EmployeeAddress employeeAddress;

  

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public EmployeeAddress getEmployeeAddress() {
    return employeeAddress;
    }
    public void setEmployeeAddress(EmployeeAddress employeeAddress) {
    this.employeeAddress = employeeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress=" + employeeAddress + '}';
    }
     
  

        
}
