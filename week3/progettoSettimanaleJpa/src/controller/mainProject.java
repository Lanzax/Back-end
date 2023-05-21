package controller;


import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.*;
import utils.periodicita;
import dao.*;
public class mainProject {

	
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("progettoSettimanaleJpa");
	static EntityManager em=emf.createEntityManager();

	public static void main(String[] args) {
		
		try {
			ElementoDao el=new ElementoDao();
			UtenteDao ut=new UtenteDao();
			PrestitiDao pst=new PrestitiDao();

			libri libro1 = new libri();
			libro1.setTitolo("Titolo3");
			libro1.setAnno_pubblicazione(LocalDate.of(2012, 12, 2));
			libro1.setNumero_pagine(200);
			libro1.setAutore("Autore3");
			libro1.setGenere("Genere3");

		//	el.salvaElemento(libro1);

			
			riviste riviste1 = new riviste();
			riviste1.setTitolo("Rivista");
			riviste1.setAnno_pubblicazione(LocalDate.of(2010, 12, 2));
			riviste1.setNumero_pagine(200);
			riviste1.setPeriodicita(periodicita.MENSILE);

			//el.salvaElemento(riviste1);
			
			//el.eliminaElemento(3);
			//el.trovaElemento(3);
			//el.ricercaPerTitolo("Tito");

			utente utente1 = new utente();
			utente1.setNome("Giovanni");
			utente1.setCognome("Bianchi");
			utente1.setData_di_nascita(LocalDate.of(2002,12,12));
			
			//ut.salvaUtente(utente1);

			prestiti  prestito1=new prestiti();
			prestito1.setUtente(utente1);
			prestito1.setElemento(libro1);
			prestito1.setData_inizio_prestito(LocalDate.of(2023, 1, 31));
			prestito1.setData_restituzione_prestito_prevista(LocalDate.of(2023, 3, 30));
			pst.salvaPrestito(prestito1);
			
			
		}catch(Exception e) {
			System.out.println("ERRORE! "+e);
		}finally {
			emf.close();
			em.close();
		}
		
	}

}
