package models;

public class Gol {

	private Inscrito inscrito;
	private int tempo;
	private boolean penalty;
	
	public Gol(){
	}
	
	public Gol(Inscrito inscrito, int tempo, boolean penalty) {
		this.inscrito = inscrito;
		this.tempo = tempo;
		this.penalty = penalty;
	}
	
	public Inscrito getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public boolean isPenalty() {
		return penalty;
	}
	public void setPenalty(boolean penalty) {
		this.penalty = penalty;
	}
}
