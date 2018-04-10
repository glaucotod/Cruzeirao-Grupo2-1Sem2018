package models;

import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import org.primefaces.event.DragDropEvent;

//import beans.LocalManagedBean;
import beans.UsuarioManagedBean;
import service.UsuarioService;

public class Equipe {

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