package models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
@Table(name="TBL_Categoria")
public class Categoria implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany(cascade = CascadeType.ALL)
	private int id;

	private String nome;
	private Date nascidosApartirDe;
	private List<Inscricao> inscricoes;
	private Campeonato campeonato;
	private List<Fase> fases;
	private int minJogadores;
	private int maxJogadores;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	/*
	public Categoria() {
		this.sexo = Sexo.MASCULINO;
	}
	*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascidosApartirDe() {
		return nascidosApartirDe;
	}
	public void setNascidosApartirDe(Date nascidosApartirDe) {
		this.nascidosApartirDe = nascidosApartirDe;
	}
	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public List<Fase> getFases() {
		return fases;
	}
	public void setFases(List<Fase> fases) {
		this.fases = fases;
	}
	public int getMinJogadores() {
		return minJogadores;
	}
	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}
	public int getMaxJogadores() {
		return maxJogadores;
	}
	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((campeonato == null) ? 0 : campeonato.hashCode());
		result = prime * result + ((fases == null) ? 0 : fases.hashCode());
		result = prime * result + ((inscricoes == null) ? 0 : inscricoes.hashCode());
		result = prime * result + maxJogadores;
		result = prime * result + minJogadores;
		result = prime * result + ((nascidosApartirDe == null) ? 0 : nascidosApartirDe.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (campeonato == null) {
			if (other.campeonato != null)
				return false;
		} else if (!campeonato.equals(other.campeonato))
			return false;
		if (fases == null) {
			if (other.fases != null)
				return false;
		} else if (!fases.equals(other.fases))
			return false;
		if (inscricoes == null) {
			if (other.inscricoes != null)
				return false;
		} else if (!inscricoes.equals(other.inscricoes))
			return false;
		if (maxJogadores != other.maxJogadores)
			return false;
		if (minJogadores != other.minJogadores)
			return false;
		if (nascidosApartirDe == null) {
			if (other.nascidosApartirDe != null)
				return false;
		} else if (!nascidosApartirDe.equals(other.nascidosApartirDe))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}
	
	
}
