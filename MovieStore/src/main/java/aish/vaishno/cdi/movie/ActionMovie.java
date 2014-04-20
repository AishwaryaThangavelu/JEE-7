/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aish.vaishno.cdi.movie;


import aish.vaishno.cdi.annotation.EMovieType;
import aish.vaishno.cdi.annotation.VariousMovie;

/**
 *
 * @author aishwarya
 */
@VariousMovie(type = EMovieType.ACTION)
public class ActionMovie implements IMovie{

    @Override
    public String name() {
        return "The Rise of Empire";
    }
    
}
