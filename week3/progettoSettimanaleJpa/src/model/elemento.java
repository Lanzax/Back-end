package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@NamedQuery(name = "elemento.findByISBN", query = "SELECT e FROM elemento e WHERE e.ISBN = :isbn")
@NamedQuery(name = "elemento.findByTitolo", query = "SELECT e FROM elemento e WHERE e.titolo LIKE :titolo")
public abstract class  elemento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long ISBN;
	private String titolo;
	private LocalDate anno_pubblicazione;
	private Integer numero_pagine;
	public elemento() {
		super();
	}
	public elemento(String titolo, LocalDate anno_pubblicazione, Integer numero_pagine) {
		super();
		this.titolo = titolo;
		this.anno_pubblicazione = anno_pubblicazione;
		this.numero_pagine = numero_pagine;
	}
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public LocalDate getAnno_pubblicazione() {
		return anno_pubblicazione;
	}
	public void setAnno_pubblicazione(LocalDate anno_pubblicazione) {
		this.anno_pubblicazione = anno_pubblicazione;
	}
	public Integer getNumero_pagine() {
		return numero_pagine;
	}
	public void setNumero_pagine(Integer numero_pagine) {
		this.numero_pagine = numero_pagine;
	}
	@Override
	public String toString() {
		return "elemento [ISBN=" + ISBN + ", titolo=" + titolo + ", anno_pubblicazione=" + anno_pubblicazione
				+ ", numero_pagine=" + numero_pagine + "]";
	}
	
	
}
