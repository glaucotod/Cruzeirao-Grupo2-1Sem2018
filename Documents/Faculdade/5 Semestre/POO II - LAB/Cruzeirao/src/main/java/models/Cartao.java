package models;

public class Cartao {

	private Inscrito inscrito;
	private TipoCartao tipo;
	private int tempo;
	
	public Cartao() {}
	
	public Cartao(Inscrito inscrito, TipoCartao tipoCartao, int tempo) {
		this.inscrito = inscrito;
		this.tipo = tipoCartao;
		this.tempo = tempo;
	}
	
	public Inscrito getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}
	public TipoCartao getTipo() {
		return tipo;
	}
	public void setTipo(TipoCartao tipo) {
		this.tipo = tipo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
}
