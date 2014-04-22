/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aish.vaishno.studentregistrymgmtsys.annotation;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aishwarya
 */
@Singleton
public class UserDBEntityManager {
    
    @Produces
    @UserDatabaseSetUp
    @PersistenceContext(unitName = "studentMgmtSys")
    private EntityManager em;
    
    
    
}
