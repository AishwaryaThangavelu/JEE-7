/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aish.vaishno.studentregistrymgmtsys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author aishwarya
 */
@Entity
@Table(name = "srms_ma_student")
public class StudentDetail {
    
    @Id
    @Column(name = "st_id",nullable = false)
    private Long id;
    
    @Column(name = "st_name",nullable = false)
    private String studentName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "StudentDetail{" + "id=" + id + ", studentName=" + studentName + '}';
    }
    
    
    
}
