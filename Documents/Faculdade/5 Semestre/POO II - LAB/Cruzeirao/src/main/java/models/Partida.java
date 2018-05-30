package models;

import java.util.Date;
import java.util.List;

public class Partida {

	private int numero;
	private Inscricao equipeMandante;
	private Inscricao equipeVisitante;
	private Date data;
	private Local local;
	private Partida proxPartida;
	private List<Juiz> juizes;
	private Grupo grupo;
	private String relatoJuiz;
	private PartidaFutebol detalhes;
	
	public Partida(int n) {
		detalhes = new PartidaFutebol();
		
		Equipe e1 = new Equipe();
		e1.setNome("PRIMEIRA");
		Equipe e2 = new Equipe();
		e2.setNome("SEGUNDA");
		Equipe e3 = new Equipe();
		e3.setNome("TERCEIRA");
		
		Inscricao i1 = new Inscricao();
		Inscricao i2 = new Inscricao();
		Inscricao i3 = new Inscricao();
		
		i1.setEquipe(e1);
		i2.setEquipe(e2);
		i3.setEquipe(e3);
		
		
		this.numero = n;
		this.equipeMandante = i1;
		this.equipeVisitante = i2;
		
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Inscricao getEquipeMandante() {
		return equipeMandante;
	}
	public void setEquipeMandante(Inscricao equipeMandante) {
		this.equipeMandante = equipeMandante;
	}
	public Inscricao getEquipeVisitante() {
		return equipeVisitante;
	}
	public void setEquipeVisitante(Inscricao equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public Partida getProxPartida() {
		return proxPartida;
	}
	public void setProxPartida(Partida proxPartida) {
		this.proxPartida = proxPartida;
	}
	public List<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(List<Juiz> juizes) {
		this.juizes = juizes;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public String getRelatoJuiz() {
		return relatoJuiz;
	}
	public void setRelatoJuiz(String relatoJuiz) {
		this.relatoJuiz = relatoJuiz;
	}
	public void setDetalhes(PartidaFutebol detalhes){
		this.detalhes = detalhes;
	}
	public PartidaFutebol getDetalhes() {
		return detalhes;
	}
}
