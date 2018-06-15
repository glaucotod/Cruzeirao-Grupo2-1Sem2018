package models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TBL_Inscrito")
public class Inscrito implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany(cascade = CascadeType.ALL)
	private int id;

	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	private Usuario usuario;
	private Inscricao inscricao;
	private boolean aceiteUsuario; 
	private boolean jogoSuspenso;
	private boolean inscricaoValidada;
	
	public Inscrito() {
		
	}
	
	public Inscrito(Tipo tipo, Usuario usuario, Inscricao inscricao, boolean aceiteUsuario, boolean jogoSuspenso,
			boolean inscricaoValidada) {
		this.tipo = tipo;
		this.usuario = usuario;
		this.inscricao = inscricao;
		this.aceiteUsuario = aceiteUsuario;
		this.jogoSuspenso = jogoSuspenso;
		this.inscricaoValidada = inscricaoValidada;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Inscricao getInscricao() {
		return inscricao;
	}
	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}
	public boolean isAceiteUsuario() {
		return aceiteUsuario;
	}
	public void setAceiteUsuario(boolean aceiteUsuario) {
		this.aceiteUsuario = aceiteUsuario;
	}
	public boolean isJogoSuspenso() {
		return jogoSuspenso;
	}
	public void setJogoSuspenso(boolean jogoSuspenso) {
		this.jogoSuspenso = jogoSuspenso;
	}
	public boolean isInscricaoValidada() {
		return inscricaoValidada;
	}
	public void setInscricaoValidada(boolean inscricaoValidada) {
		this.inscricaoValidada = inscricaoValidada;
	}
}
