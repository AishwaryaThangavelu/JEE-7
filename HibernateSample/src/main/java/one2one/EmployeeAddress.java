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
public class EmployeeAddress {
    
    private Integer empAddId;
    private String empAddstate;
    private String empAddcountry;
    private Employee employee;


    public Integer getEmpAddId() {
        return empAddId;
    }

    public void setEmpAddId(Integer empAddId) {
        this.empAddId = empAddId;
    }

    public String getEmpAddstate() {
        return empAddstate;
    }

    public void setEmpAddstate(String empAddstate) {
        this.empAddstate = empAddstate;
    }

    public String getEmpAddcountry() {
        return empAddcountry;
    }

    public void setEmpAddcountry(String empAddcountry) {
        this.empAddcountry = empAddcountry;
    }
    
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
