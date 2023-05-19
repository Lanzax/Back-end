package DAO;

import javax.persistence.EntityManager;
import MODEL.Persona;
import UTILS.JpaUtil;

public class PersonaDao implements IPersonaDao {

	public void save(Persona pr) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(pr);
		em.getTransaction().commit();
		System.out.println("EVENTO SALVATO CORRETTAMENTE!!!!!");
	}
	
}
