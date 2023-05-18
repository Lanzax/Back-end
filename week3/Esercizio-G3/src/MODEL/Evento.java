package MODEL;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Evento")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; 
	@Column(name = "titolo")
	private String titolo; 
	@Column(name = "data")
	private LocalDate data; 
	
	@Column (name = "tipoEvento")
	@Enumerated (EnumType.STRING)
	private TipoEvento tipoEvento;
	
	@Column(name = "numMaxPartecipanti")
	private Integer numMaxPartecipanti;
	
	public Evento() {
		super();
	}
	public Evento( String titolo, LocalDate data, TipoEvento tipoEvento, Integer numMaxPartecipanti) {
		super();
		this.titolo = titolo;
		this.data = data;
		this.tipoEvento = tipoEvento;
		this.numMaxPartecipanti = numMaxPartecipanti;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public Integer getNumMaxPartecipanti() {
		return numMaxPartecipanti;
	}
	public void setNumMaxPartecipanti(Integer numMaxPartecipanti) {
		this.numMaxPartecipanti = numMaxPartecipanti;
	}
	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", data=" + data + ", tipoEvento=" + tipoEvento
				+ ", numMaxPartecipanti=" + numMaxPartecipanti + "]";
	} 
	
}

