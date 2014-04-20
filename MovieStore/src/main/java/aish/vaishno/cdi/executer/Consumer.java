/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aish.vaishno.cdi.executer;


import aish.vaishno.cdi.annotation.EMovieType;
import aish.vaishno.cdi.annotation.VariousMovie;
import aish.vaishno.cdi.movie.IMovie;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author aishwarya
 */
@Path(value = "movie")
public class Consumer{
    
    //@EJB
    @Inject
    @VariousMovie(type = EMovieType.ACTION)
    private IMovie movie;
    
    
    
    @Path(value = "name")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getMovieName(){
        return "Hi, I am watching "+movie.name();
    }
   

    
}
