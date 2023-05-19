package model;

import javax.persistence.Entity;

import utils.periodicita;

@Entity
public class riviste extends elemento{
private periodicita periodicita;

public riviste() {
	super();
}

public riviste(utils.periodicita periodicita) {
	super();
	this.periodicita = periodicita;
}

public periodicita getPeriodicita() {
	return periodicita;
}

public void setPeriodicita(periodicita periodicita) {
	this.periodicita = periodicita;
}

@Override
public String toString() {
	return "riviste [periodicita=" + periodicita + "]";
}

}
