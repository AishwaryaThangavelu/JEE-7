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
public class Theatre {

    private Integer theatreId;
    private String theatreName;
    private Set<Movie> movieSet;
    
    public Integer getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(Integer theatreId) {
        this.theatreId = theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

 

    public Set<Movie> getMovieSet() {
        return movieSet;
    }

    public void setMovieSet(Set<Movie> movieSet) {
        this.movieSet = movieSet;
    }
    

}
