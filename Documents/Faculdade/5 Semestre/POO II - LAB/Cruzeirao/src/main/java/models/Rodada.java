package models;

import java.util.List;

public class Rodada {

	private int numero;
	private Grupo grupo;
	private List<Partida> partidas;
	
	public Rodada() {
		
	}
	
	public Rodada(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	public List<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
	public void addPartida(Partida partida) {
		this.partidas.add(partida);
	}
}
