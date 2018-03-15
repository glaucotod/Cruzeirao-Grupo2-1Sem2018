package models;

public class Inscrito {

	private Enum tipo;
	private Usuario usuario;
	private Inscricao inscricao;
	private boolean aceiteUsuario; 
	private boolean jogoSuspenso;
	private boolean inscricaoValidada;
	
	public Enum getTipo() {
		return tipo;
	}
	public void setTipo(Enum tipo) {
		this.tipo = tipo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Inscricao getInscricao() {
		return inscricao;
	}
	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}
	public boolean isAceiteUsuario() {
		return aceiteUsuario;
	}
	public void setAceiteUsuario(boolean aceiteUsuario) {
		this.aceiteUsuario = aceiteUsuario;
	}
	public boolean isJogoSuspenso() {
		return jogoSuspenso;
	}
	public void setJogoSuspenso(boolean jogoSuspenso) {
		this.jogoSuspenso = jogoSuspenso;
	}
	public boolean isInscricaoValidada() {
		return inscricaoValidada;
	}
	public void setInscricaoValidada(boolean inscricaoValidada) {
		this.inscricaoValidada = inscricaoValidada;
	}
}
