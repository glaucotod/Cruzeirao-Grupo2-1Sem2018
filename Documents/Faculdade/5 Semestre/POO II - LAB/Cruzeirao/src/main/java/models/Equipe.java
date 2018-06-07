package models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TBL_Equipe")
public class Equipe implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany(cascade = CascadeType.ALL)
	private int id;

	private String nome;
	private Date dataFundacao;
	private String cidade;
	private Usuario diretor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Usuario getDiretor() {
		return diretor;
	}
	public void setDiretor(Usuario diretor) {
		this.diretor = diretor;
	}
	public String nomeDiretor() {
		return diretor.getNome();
	}

	
}