package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

@Entity
public class prestiti {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
@ManyToOne
private utente utente;
@ManyToOne
private elemento elemento;

private LocalDate data_inizio_prestito;
private LocalDate data_restituzione_prestito_prevista;
private LocalDate data_restituzione_prestito_effettiva;

public prestiti() {
	super();
}

public prestiti(utente utente, elemento elemento, LocalDate data_inizio_prestito,
		LocalDate data_restituzione_prestito_prevista, LocalDate data_restituzione_prestito_effettiva) {
	super();
	this.utente = utente;
	this.elemento = elemento;
	this.data_inizio_prestito = data_inizio_prestito;
	this.data_restituzione_prestito_prevista = data_restituzione_prestito_prevista;
	this.data_restituzione_prestito_effettiva = data_restituzione_prestito_effettiva;
}


@PrePersist
private void calcolaData() {
	if(data_inizio_prestito!=null) {
		data_restituzione_prestito_prevista=data_inizio_prestito.plusDays(30);
	}
}


public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public utente getUtente() {
	return utente;
}

public void setUtente(utente utente) {
	this.utente = utente;
}

public elemento getElemento() {
	return elemento;
}

public void setElemento(elemento elemento) {
	this.elemento = elemento;
}

public LocalDate getData_inizio_prestito() {
	return data_inizio_prestito;
}

public void setData_inizio_prestito(LocalDate data_inizio_prestito) {
	this.data_inizio_prestito = data_inizio_prestito;
}

public LocalDate getData_restituzione_prestito_prevista() {
	return data_restituzione_prestito_prevista;
}

public void setData_restituzione_prestito_prevista(LocalDate data_restituzione_prestito_prevista) {
	this.data_restituzione_prestito_prevista = data_restituzione_prestito_prevista;
}

public LocalDate getData_restituzione_prestito_effettiva() {
	return data_restituzione_prestito_effettiva;
}

public void setData_restituzione_prestito_effettiva(LocalDate data_restituzione_prestito_effettiva) {
	this.data_restituzione_prestito_effettiva = data_restituzione_prestito_effettiva;
}

@Override
public String toString() {
	return "prestiti [id=" + id + ", utente=" + utente + ", elemento=" + elemento + ", data_inizio_prestito="
			+ data_inizio_prestito + ", data_restituzione_prestito_prevista=" + data_restituzione_prestito_prevista
			+ ", data_restituzione_prestito_effettiva=" + data_restituzione_prestito_effettiva + "]";
}

}
