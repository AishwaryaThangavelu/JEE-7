/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package many2many;

import java.util.Set;

/**
 *
 * @author aishwarya
 */
public class Movie {

   
    private Integer movieId;
    private String movieName;
    private Set<Theatre> theatreSet;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Set<Theatre> getTheatreSet() {
        return theatreSet;
    }

    public void setTheatreSet(Set<Theatre> theatreSet) {
        this.theatreSet = theatreSet;
    }
    
    
}
