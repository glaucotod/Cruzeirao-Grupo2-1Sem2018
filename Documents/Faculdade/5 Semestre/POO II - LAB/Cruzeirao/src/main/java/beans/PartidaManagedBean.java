package beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Grupo;
import models.Inscrito;
import models.Local;
import models.Partida;
import models.Tipo;
import models.Usuario;
import service.PartidaService;
import service.UsuarioService;


@ManagedBean(eager=true, name = "partidaManagedBean")
@SessionScoped
public class PartidaManagedBean
{
	
	private Partida partida = new Partida();
	private PartidaService service = new PartidaService();	
	private ArrayList<Inscrito> equipesMandantes =  new ArrayList<Inscrito>(); 
	private ArrayList<Inscrito> equipesVisitantes =  new ArrayList<Inscrito>(); 
	private ArrayList<Local> locais =  new ArrayList<Local>(); 
	private ArrayList<Grupo> grupos = new ArrayList<Grupo>();
	private ArrayList<Usuario> listaJuizes = new ArrayList<Usuario>(); 
	private ArrayList<Partida> partidas = new ArrayList<Partida>(); 

	@PostConstruct
    public void init() {
		service = new PartidaService();
		partida = new Partida();
    }
	public ArrayList<Inscrito> getEquipesMandantes() {
		return equipesMandantes;
	}

	public ArrayList<Inscrito> getEquipesVisitantes() {
		return equipesVisitantes;
	}
	
	public ArrayList<Local> getLocais() {
		return locais;
	}

	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public List<Partida> getPartidasService() {
		return service.getPartidas();
	}
	
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}

	public ArrayList<Usuario> getJuizes()
	{
		
		for (Usuario i : UsuarioService.usuarioslist)
			if (i.getTipo() == Tipo.JUIZ)
			{
				listaJuizes.add(i);
			}
		return listaJuizes;
	}
	
	public void salvar()
	{
		service.salvar(partida);
		partida = new Partida();		
	}
	
}
