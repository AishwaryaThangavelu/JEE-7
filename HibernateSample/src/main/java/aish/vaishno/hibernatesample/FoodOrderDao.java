/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aish.vaishno.hibernatesample;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import static org.hibernate.type.TypeFactory.serializable;

/**
 *
 * @author aishwarya
 */
public class FoodOrderDao {
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    
    public List<FoodOrder> getFoodOrderList(){
        //Session session = HibernateSessionFHibernateUtily().openSession();
        return session.createQuery("from FoodOrder").list();
    }
    
    public FoodOrder getParticularFoodOrder(Long id){
       //Session session = HibernateUtil.getHibernateUtil;
        Query query= session.createQuery("from FoodOrder where id= :id")
                .setParameter("id", id);
        return (FoodOrder) query.uniqueResult();
    }
    
    
    public void insertFoodOrder(FoodOrder foodOrder){
        session.beginTransaction();
     //   session.createQuery("insert into FoodOrder(id,itemName) select ")
    }
    
    
    public Integer updateFoodOrder(FoodOrder foodOrder){
      //  Transaction transaction=session.beginTransaction();
        Query query=session.createQuery("update FoodOrder set itemName= :itemName where id= :id");
        query.setParameter("itemName",foodOrder.getItemName());
        query.setParameter("id",foodOrder.getId()); 
        Integer result=query.executeUpdate();
        return result;
    }
    
    public Integer deleteFoodOrder(FoodOrder foodOrder){
        Transaction transaction=session.beginTransaction();
        Query query=session.createQuery("delete FoodOrder where id= :id");
      //  query.setParameter("itemName",foodOrder.getItemName());
        query.setParameter("id",foodOrder.getId()); 
        query.setTimeout(50);
        Integer result=query.executeUpdate();
        transaction.commit();
        return result;
    }
    
    public void getListThroughGetLoad(){
        
        FoodOrder foodOrder=(FoodOrder) session.get(FoodOrder.class, new Long(3));
        System.out.println(foodOrder);
    }
    
    
    public void dummy(){
         Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        System.out.println("session: "+session);
        FoodOrder foodOrder=new FoodOrder();
      // foodOrder.setId(4l);
      // foodOrder.setItemName("Pongal");
     //  session.save(foodOrder);
     //  transaction.commit();
     //  session.flush();
       System.out.println("Insertion successful");
        Query query=session.createQuery("select c from FoodOrder c");
        System.out.println("size: "+query.list());
        session.close();
        HibernateUtil.shutdown();
    }
    
}
