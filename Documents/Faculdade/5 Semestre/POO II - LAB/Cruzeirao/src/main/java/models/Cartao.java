package models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TBL_Cartao")
public class Cartao implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany(cascade = CascadeType.ALL)
	private int id;


	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "CARTAOINSCRITO_ID", referencedColumnName = "id") })
	private Inscrito inscrito;
	
	@Enumerated(EnumType.STRING)
	private TipoCartao tipo;
	private int tempo;
	/*
	public Cartao() {}
	
	public Cartao(Inscrito inscrito, TipoCartao tipoCartao, int tempo) {
		this.inscrito = inscrito;
		this.tipo = tipoCartao;
		this.tempo = tempo;
	}
	*/
	public Inscrito getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}
	public TipoCartao getTipo() {
		return tipo;
	}
	public void setTipo(TipoCartao tipo) {
		this.tipo = tipo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
}
