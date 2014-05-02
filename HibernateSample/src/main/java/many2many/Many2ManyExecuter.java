/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package many2many;

import aish.vaishno.hibernatesample.HibernateUtil;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;

/**
 *
 * @author aishwarya
 */
public class Many2ManyExecuter {
    
    public static void main(String[] args){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Theatre t1=new Theatre();
        t1.setTheatreName("theatre 1");
        Theatre t2=new Theatre();
        t2.setTheatreName("t2");
        
        Set<Theatre> theatreSet=new HashSet<Theatre>();
        theatreSet.add(t1);
        theatreSet.add(t2);
        
        Movie movie=new Movie();
        movie.setMovieName("m1");
        movie.setTheatreSet(theatreSet);
        
        session.save(movie);
        session.getTransaction().commit();
        
        List<Movie> movieList=session.createCriteria(Movie.class).list();
        for (Movie movie1 : movieList) {
            for(Theatre theatre:movie1.getTheatreSet()){
                System.out.println("theatreSet=> "+theatre);
            }
            System.out.println("movie=> "+movie1.getMovieName());
        }
        
    }
    
}
