package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Partida;
import service.PartidaService;

@ManagedBean(name = "partidaMB")
@SessionScoped
public class PartidaMB {

	private PartidaService service;
	private Partida partidaSelected;
	
	public PartidaMB() {
		this.partidaSelected = new Partida(20);
		this.service = new PartidaService();
	}
	
	public List<Partida> getPartidas() {
		return service.getPartidas();
	}

	public Partida getPartidaSelected() {
		return partidaSelected;
	}
	
	public void addPartidaSelected(Partida partida) {
		this.partidaSelected = partida;
	}
}
