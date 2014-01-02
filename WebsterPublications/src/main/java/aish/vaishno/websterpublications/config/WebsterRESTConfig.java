/*
 */

package aish.vaishno.websterpublications.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author aishwarya
 */
@javax.ws.rs.ApplicationPath("webresources")
public class WebsterRESTConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(aish.vaishno.websterpublications.resource.DictionaryResource.class);
    }
    
}
