package DAO;

import javax.persistence.EntityManager;


import MODEL.Evento;
import UTILS.JpaUtil;

public class EventoDao implements IEventoDao {

	public void save(Evento e) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("EVENTO SALVATO CORRETTAMENTE!!!!!");
	}
	
}
