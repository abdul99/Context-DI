package abdul.cdi.examples;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CDIBean {

	// the container injects it
	  @PersistenceContext
	  private EntityManager em;

	  // just use it
	  public void someMethod(Movie someEntity) {
	    this.em.persist(someEntity);
	  }
	  
	  
}
