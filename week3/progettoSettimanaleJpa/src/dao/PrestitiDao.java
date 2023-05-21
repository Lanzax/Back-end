package dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.prestiti;


public class PrestitiDao implements IPrestitiDao {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progettoSettimanaleJpa");
    static EntityManager em = emf.createEntityManager();
	@Override
	public void salvaPrestito(prestiti pst) {
		em.getTransaction().begin();
		em.persist(pst);
		em.getTransaction().commit();
		System.out.println("Prestito salvato correttamente!!!");
	}
	@Override
	public List<prestiti> ricercaPrestitoTessera(int numeroTessera) {
	    TypedQuery<prestiti> query = em.createQuery("SELECT p FROM prestiti p WHERE p.utente.numeroTessera = :numeroTessera AND p.data_restituzione_prestito_effettiva IS NULL", prestiti.class);
	    query.setParameter("numeroTessera", numeroTessera);
	    return query.getResultList();
	}
	@Override
	public List<prestiti> ricercaPrestitiScaduti() {
	    TypedQuery<prestiti> query = em.createQuery("SELECT p FROM prestiti p WHERE p.data_restituzione_prestito_prevista < :today AND p.data_restituzione_prestito_effettiva IS NULL", prestiti.class);
	    query.setParameter("today", LocalDate.now());
	    return query.getResultList();
	}
}