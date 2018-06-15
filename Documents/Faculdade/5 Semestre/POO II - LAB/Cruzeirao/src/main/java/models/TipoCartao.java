package models;

import java.util.ArrayList;
import java.util.List;

public enum TipoCartao{
	
	AMARELO("Amarelo","Amarelo"),
	VERMELHO("Vermelho", "Vermelho");
	
	private String nome;
	private String valor;
	
	private TipoCartao() {
		
	}

	private TipoCartao(String nome, String valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return valor;
	}
	
	public static List<TipoCartao> getSexos(){
		List<TipoCartao> tipos = new ArrayList<TipoCartao>();
		
		for(TipoCartao tipo : TipoCartao.values())
			tipos.add(tipo);
		return tipos;
	}

}
