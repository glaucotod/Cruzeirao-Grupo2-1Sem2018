package models;

import java.util.ArrayList;
import java.util.List;

public enum Sexo {
	
	MASCULINO("Masculino","Masculino"),
	FEMININO("Feminino", "Feminino");
	
	private String nome;
	private String valor;
	
	private Sexo() {
		
	}

	private Sexo(String nome, String valor) {
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
	
	public static List<Sexo> getSexos(){
		List<Sexo> sexos = new ArrayList<Sexo>();
		
		for(Sexo sexo : Sexo.values())
			sexos.add(sexo);
		return sexos;
	}

}
