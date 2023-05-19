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
			/*
			libri libro1 = new libri();
			libro1.setTitolo("Titolo del libro");
			libro1.setAnno_pubblicazione(LocalDate.of(2010, 12, 2));
			libro1.setNumero_pagine(200);
			libro1.setAutore("Autore del libro");
			libro1.setGenere("Genere del libro");

			El.salvaElemento(libro1);
			*/
			/*
			riviste riviste1 = new riviste();
			riviste1.setTitolo("Titolo del libro");
			riviste1.setAnno_pubblicazione(LocalDate.of(2010, 12, 2));
			riviste1.setNumero_pagine(200);
			riviste1.setPeriodicita(periodicita.MENSILE);

			el.salvaElemento(riviste1);
			*/
			
		}catch(Exception e) {
			System.out.println("ERRORE! "+e);
		}finally {
			emf.close();
			em.close();
		}
		
	}

}
