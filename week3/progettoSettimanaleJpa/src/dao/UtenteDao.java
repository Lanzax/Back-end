package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.utente;

public class UtenteDao implements IUtenteDao {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progettoSettimanaleJpa");
    static EntityManager em = emf.createEntityManager();
	@Override
	public void salvaUtente(utente ut) {
		em.getTransaction().begin();
		em.persist(ut);
		em.getTransaction().commit();
		System.out.println("Utente salvato correttamente!!!");
	}
}
