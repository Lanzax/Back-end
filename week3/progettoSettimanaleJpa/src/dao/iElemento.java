package dao;


import java.util.List;

import model.elemento;

public interface iElemento {
	public void salvaElemento(elemento el);
	public void eliminaElemento(long i);
	elemento trovaElemento(long codiceISBN);
	List<elemento> ricercaPerTitolo(String titolo);

}
