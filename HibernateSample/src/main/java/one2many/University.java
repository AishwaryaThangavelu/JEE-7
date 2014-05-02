/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package one2many;

import java.util.Set;

/**
 *
 * @author aishwarya
 */
public class University {
    
    private Integer univId;
    private String univName;
    private Set<Student> studentSet;

    public Integer getUnivId() {
        return univId;
    }

    public void setUnivId(Integer univId) {
        this.univId = univId;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    @Override
    public String toString() {
        return "University{" + "univId=" + univId + ", univName=" + univName + ", studentSet=" + studentSet + '}';
    }
    
    
}
