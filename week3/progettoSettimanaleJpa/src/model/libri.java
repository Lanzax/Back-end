package model;

import javax.persistence.Entity;


@Entity
public class libri extends elemento {

private String autore;
private String genere;

public libri() {
	super();
}

public libri(String autore, String genere) {
	super();
	this.autore = autore;
	this.genere = genere;
}

public String getAutore() {
	return autore;
}

public void setAutore(String autore) {
	this.autore = autore;
}

public String getGenere() {
	return genere;
}

public void setGenere(String genere) {
	this.genere = genere;
}

@Override
public String toString() {
	return "libri [autore=" + autore + ", genere=" + genere + "]";
}

}
