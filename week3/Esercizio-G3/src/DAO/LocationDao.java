package DAO;

import javax.persistence.EntityManager;
import MODEL.Location;
import UTILS.JpaUtil;

public class LocationDao implements ILocationDao {

	public void save(Location l) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();
		System.out.println("EVENTO SALVATO CORRETTAMENTE!!!!!");
	}
	
}
