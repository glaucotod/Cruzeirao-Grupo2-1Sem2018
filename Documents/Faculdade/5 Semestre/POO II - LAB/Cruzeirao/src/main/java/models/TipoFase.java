package models;

import java.util.ArrayList;
import java.util.List;

public enum TipoFase {

	
	AMARELO("Amarelo","Amarelo"),
	VERMELHO("Vermelho", "Vermelho");
	
	private String nome;
	private String valor;
	
	private TipoFase() {
		
	}

	private TipoFase(String nome, String valor) {
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
	
	public static List<TipoFase> getSexos(){
		List<TipoFase> tipos = new ArrayList<TipoFase>();
		
		for(TipoFase tipo : TipoFase.values())
			tipos.add(tipo);
		return tipos;
	}


}
