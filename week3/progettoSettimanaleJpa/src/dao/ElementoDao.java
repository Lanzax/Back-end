package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.elemento;

public  class ElementoDao implements iElemento {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progettoSettimanaleJpa");
    static EntityManager em = emf.createEntityManager();
    
	public void salvaElemento(elemento el) {
		em.getTransaction().begin();
		em.persist(el);
		em.getTransaction().commit();
		System.out.println("Elemento salvato correttamente!!!");
	}


}