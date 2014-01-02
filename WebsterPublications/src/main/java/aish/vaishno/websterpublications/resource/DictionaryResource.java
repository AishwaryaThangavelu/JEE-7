/**
 */

package aish.vaishno.websterpublications.resource;

import aish.vaishno.websterpublications.entity.DictionaryEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author aishwarya
 */
@Path(value = "dictionary")
@Stateless
public class DictionaryResource {
    
    @PersistenceContext(unitName = "webster")
    private EntityManager em;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path(value="wordlist")
    public List<DictionaryEntity> getWordList(){
        Query query=em.createQuery("select d from DictionaryEntity d");
        List<DictionaryEntity> wordList=query.getResultList();
        return wordList;
    }
    
}
