package DAO;

import javax.persistence.EntityManager;


import MODEL.Partecipazione;
import UTILS.JpaUtil;

public class PartecipazioneDao implements IPartecipazioneDao {

	public void save(Partecipazione pt) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(pt);
		em.getTransaction().commit();
		System.out.println("EVENTO SALVATO CORRETTAMENTE!!!!!");
	}
	
}
