package dao;

import java.util.List;

import model.prestiti;


public interface IPrestitiDao {
	public void salvaPrestito(prestiti pst);
	List<prestiti> ricercaPrestitoTessera(int numeroTessera);
	List<prestiti> ricercaPrestitiScaduti();
}
