package models;

import java.util.ArrayList;
import java.util.List;

public enum Tipo {
	
	JOGADOR ("Jogador","Jogador"), 
	TECNICO ("Técnico","Tecnico"),
	MASSAGISTA ("Massagista", "Massagista"), 
	AUXILIAR ("Auxiliar", "Auxiliar"),
	PREPARADOR_FISICO ("Preparador Físico", "Preparador_Fisico");
	
	private String nome;
	private String valor;
	
	private Tipo() {
		
	}
	
	private Tipo(String nome, String valor) {
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
	
	public static List<Tipo> getTipos(){
		
		List<Tipo> tipos = new ArrayList<Tipo>();
		
		for(Tipo tipo : Tipo.values())
			tipos.add(tipo);
		
		return tipos;
	}
}
