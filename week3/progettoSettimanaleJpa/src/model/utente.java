package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class utente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String nome;
	@Column
	private String cognome;
	@Column
	private LocalDate data_di_nascita;
	@Column
	private Long numero_di_tessera;
	public utente() {
		super();
	}
	public utente(String nome, String cognome, LocalDate data_di_nascita, Long numero_di_tessera) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.data_di_nascita = data_di_nascita;
		this.numero_di_tessera = numero_di_tessera;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public LocalDate getData_di_nascita() {
		return data_di_nascita;
	}
	public void setData_di_nascita(LocalDate data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
	}
	public Long getNumero_di_tessera() {
		return numero_di_tessera;
	}
	public void setNumero_di_tessera(Long numero_di_tessera) {
		this.numero_di_tessera = numero_di_tessera;
	}
	@Override
	public String toString() {
		return "utente [nome=" + nome + ", cognome=" + cognome + ", data_di_nascita=" + data_di_nascita
				+ ", numero_di_tessera=" + numero_di_tessera + "]";
	}
	
	
	
}
