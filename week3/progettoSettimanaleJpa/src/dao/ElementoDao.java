package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.elemento;

public  class ElementoDao implements iElemento {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progettoSettimanaleJpa");
    static EntityManager em = emf.createEntityManager();
	@Override
	public void salvaElemento(elemento el) {
		em.getTransaction().begin();
		em.persist(el);
		em.getTransaction().commit();
		System.out.println("Elemento salvato correttamente!!!");
	}
	@Override
	public void eliminaElemento(long i) {
		em.getTransaction().begin();
        elemento el = em.find(elemento.class, i);
        em.remove(el);
		em.getTransaction().commit();
		System.out.println("Elemento eliminato correttamente!!!");
	}
	@Override
    public elemento trovaElemento(long codiceISBN) {
        TypedQuery<elemento> query = em.createNamedQuery("elemento.findByISBN", elemento.class);
        System.out.println("Elemento trovato tramite codice ISBN!!" + "Codice ISBN: " + codiceISBN);
        query.setParameter("isbn", codiceISBN);
        List<elemento> risultati = query.getResultList();
        for (elemento elem : risultati) {
            System.out.println("Titolo del libro: " + elem.getTitolo());
        }
        
        return null;
    }

	@Override
    public List<elemento> ricercaPerTitolo(String titolo) {
        TypedQuery<elemento> query = em.createNamedQuery("elemento.findByTitolo", elemento.class);
        query.setParameter("titolo", "%" + titolo + "%");
        List<elemento> risultati = query.getResultList();
        
        for (elemento ris : risultati) {
            System.out.println("Titolo del libro: " + ris.getTitolo());
        }
        
        return risultati;
    }
    



}