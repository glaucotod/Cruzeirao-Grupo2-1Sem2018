package beans;


import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.primefaces.event.DragDropEvent;

import model.Campeonato;
import model.Juiz;
import model.Local;
import service.CampeonatoService;

@ManagedBean(eager=true)
@ApplicationScoped

public class CampeonatoMB {

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

	public void onJuizDrop(DragDropEvent ddEvent, JuizMB juizes) {
        Juiz juiz = ((Juiz) ddEvent.getData());
        campeonato.getJuizes().add(juiz);
        juizes.remover(juiz);
    }
	
	public void onLocalDrop(DragDropEvent ddEvent, LocalMB locais) {
        Local local = ((Local) ddEvent.getData());
        campeonato.getLocais().add(local);
        locais.remover(local);
    }
	
	
}
