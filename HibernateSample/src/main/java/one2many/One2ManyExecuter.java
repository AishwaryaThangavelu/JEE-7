/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package one2many;

import aish.vaishno.hibernatesample.HibernateUtil;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.LogMF;
import org.hibernate.Session;

/**
 *
 * @author aishwarya
 */
public class One2ManyExecuter {
    
    public static void main(String[] args){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Student st1=new Student();
        st1.setStudentName("cascade 1");
        
        Student st2=new Student();
        st2.setStudentName("Cascade 2");
        
        
        
        Set<Student> studentSet=new HashSet<Student>();
        studentSet.add(st1);
        studentSet.add(st2);
        
        University university=new University();
        university.setUnivName("Cascade");
        university.setStudentSet(studentSet);
       
        st1.setUniversity(university);
        st2.setUniversity(university);
        
        session.save(university);
     //   session.save(st1);
      //  session.save(st2);
        session.getTransaction().commit();
        
        
        List<University> univList=session.createQuery("from University").list();
        for (University univ : univList) {
            for (Student student:univ.getStudentSet()){
                System.out.println("student=> "+student.getStudentName());
            }
                  
            System.out.println("Univ=> "+university.getUnivName());
        }
        
    }
    
}
