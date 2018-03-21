package beans;


import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.primefaces.event.DragDropEvent;

import models.Campeonato;
import models.Juiz;
import models.Local;
import service.CampeonatoService;

@ManagedBean(eager=true)
@ApplicationScoped

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

	//Precisa arrumar
	/*public void onJuizDrop(DragDropEvent ddEvent, JuizManagedBean juizes) {
        Juiz juiz = ((Juiz) ddEvent.getData());
        campeonato.getJuizes().add(juiz);
        juizes.remover(juiz);
    }
	
	public void onLocalDrop(DragDropEvent ddEvent, LocalManagedBean locais) {
        Local local = ((Local) ddEvent.getData());
        campeonato.getLocais().add(local);
        locais.remover(local);
    }*/
	
	
}
