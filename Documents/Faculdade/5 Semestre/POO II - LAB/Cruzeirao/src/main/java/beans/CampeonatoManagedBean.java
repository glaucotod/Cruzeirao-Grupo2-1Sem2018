package beans;


import java.util.List;

//import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Campeonato;
import service.CampeonatoService;

@ManagedBean(eager=true, name = "campeonatoManagedBean")
@SessionScoped
public class CampeonatoManagedBean {

	private CampeonatoService service = new CampeonatoService();
	private Campeonato campeonato = new Campeonato();
	
	public void salvar()
	{
		service.salvar(campeonato);
		campeonato = new Campeonato();
	}
	public void remover(Campeonato campeonato) {
		service.remove(campeonato);
	} 
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public List<Campeonato> getCampeonatos() {
		return service.getCampeonatos();
	}
	
	
}
