/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aish.vaishno.studentregistrymgmtsys.executer;

import aish.vaishno.studentregistrymgmtsys.annotation.UserDatabaseSetUp;
import aish.vaishno.studentregistrymgmtsys.entity.StudentDetail;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author aishwarya
 */

@Path(value = "student")
@Stateless
public class StudentConsumer {
    
    @UserDatabaseSetUp
    @Inject
    EntityManager em;
 
    @Path(value = "list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<StudentDetail> getTeacherList(){
        String studentListQuery="select st from StudentDetail st";
        Query query=em.createQuery(studentListQuery);
        List<StudentDetail> studentList=query.getResultList();
        return studentList;
    }
}
