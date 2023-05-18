package UTILS;

import javax.persistence.EntityManager;

import MODEL.Evento;

public class EventiDao {
	EntityManager em;

	public EventiDao(EntityManager entityManager) {
		super();
		this.em = entityManager;
	}
	
	public void saveEvento(Evento e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
	}
	public Evento readEvento(Integer num) {
		return em.find(Evento.class, num);
	}
}
