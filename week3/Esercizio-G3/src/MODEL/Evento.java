package MODEL;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import UTILS.TipoEvento;

@Entity
@Table(name="Evento")
@NamedQuery(name = "findAllEventi", query = "SELECT ev FROM Evento ev")

public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer id; 
	
	@Column(nullable=false)
	private String titolo; 
	
	@Column(nullable=false)
	private LocalDate data; 
	
	@Column (nullable=false)
	@Enumerated (EnumType.STRING)
	private TipoEvento tipoEvento;
	
	@Column(nullable=false)
	private Integer numMaxPartecipanti;
	
	@ManyToOne
	@Column(nullable=false)
	private Location location;
	
	@OneToMany(mappedBy = "evento", cascade = CascadeType.REMOVE)
	@Column(nullable=false)
	private Set<Partecipazione> partecipazione;
	
	public Evento() {
		super();
	}
	public Evento( String titolo, LocalDate data, TipoEvento tipoEvento, Integer numMaxPartecipanti,Location location,Set<Partecipazione> partecipazione) {
		super();
		this.titolo = titolo;
		this.data = data;
		this.tipoEvento = tipoEvento;
		this.numMaxPartecipanti = numMaxPartecipanti;
		this.location=location;
		this.partecipazione=partecipazione;
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
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Set<Partecipazione> getPartecipazione() {
		return partecipazione;
	}
	public void setPartecipazione(Set<Partecipazione> partecipazione) {
		this.partecipazione = partecipazione;
	}
	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", data=" + data + ", tipoEvento=" + tipoEvento
				+ ", numMaxPartecipanti=" + numMaxPartecipanti + ", location=" + location + ", partecipazione="
				+ partecipazione + "]";
	}
	
	
}

