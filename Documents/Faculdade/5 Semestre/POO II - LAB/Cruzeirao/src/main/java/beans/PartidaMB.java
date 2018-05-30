package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Inscrito;
import models.Partida;
import service.PartidaService;

@ManagedBean(name = "partidaMB")
@SessionScoped
public class PartidaMB {

	private PartidaService service;
	private Partida partidaSelected;
	private Inscrito inscritoSelected;
	
	public PartidaMB() {
		this.partidaSelected = new Partida(20);
		this.service = new PartidaService();
		this.inscritoSelected = new Inscrito();
	}
	
	
	
	public List<Inscrito> getTodosOsInscritosDasDuasEquipes(){
		
		List<Inscrito> inscritos = new ArrayList<Inscrito>();
		
		if(partidaSelected != null) {
			if(partidaSelected.getEquipeMandante() != null && partidaSelected.getEquipeMandante().getInscritos() != null)
				inscritos.addAll(partidaSelected.getEquipeMandante().getInscritos());
			if(partidaSelected.getEquipeVisitante() != null && partidaSelected.getEquipeVisitante().getInscritos() != null)
				inscritos.addAll(partidaSelected.getEquipeVisitante().getInscritos());
		}
		
		return inscritos;
	}

	
	public void addCartao() {
		
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
	
	public Inscrito getInscritoSelected() {
		return inscritoSelected;
	}

	public void setInscritoSelected(Inscrito inscritoSelected) {
		this.inscritoSelected = inscritoSelected;
	}
}
