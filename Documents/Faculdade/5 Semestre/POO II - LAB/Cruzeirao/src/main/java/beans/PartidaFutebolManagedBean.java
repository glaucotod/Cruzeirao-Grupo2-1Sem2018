package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Grupo;
import models.Inscrito;
import models.Local;
import models.Partida;
import models.Rodada;
import models.Tipo;
import models.Usuario;
import service.PartidaService;
import service.UsuarioService;


@ManagedBean(name = "partidaFutebolManagedBean")
@SessionScoped
public class PartidaFutebolManagedBean
{
	private Partida partida = new Partida();
	private PartidaService service = new PartidaService();	
	private ArrayList<Inscrito> equipesMandantes =  new ArrayList<Inscrito>(); 
	private ArrayList<Inscrito> equipesVisitantes =  new ArrayList<Inscrito>(); 
	private ArrayList<Local> locais =  new ArrayList<Local>(); 
	
	public ArrayList<Inscrito> getEquipesMandantes() {
		return equipesMandantes;
	}

	public void setEquipesMandantes(ArrayList<Inscrito> equipesMandantes) {
		this.equipesMandantes = equipesMandantes;
	}

	public ArrayList<Inscrito> getEquipesVisitantes() {
		return equipesVisitantes;
	}

	public void setEquipesVisitantes(ArrayList<Inscrito> equipesVisitantes) {
		this.equipesVisitantes = equipesVisitantes;
	}

	public ArrayList<Local> getLocais() {
		return locais;
	}

	public void setLocais(ArrayList<Local> locais) {
		this.locais = locais;
	}

	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}

	private ArrayList<Grupo> grupos = new ArrayList<Grupo>();
	private ArrayList<Usuario> listaJuizes = new ArrayList<Usuario>(); 
	private Rodada rodada;
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
	
	public Partida getPartida() {
		return partida;
	}

	public void setUsuario(Partida partida) {
		this.partida = partida;
	}

	public List<Partida> getPartidas() {
		return service.getPartidas();
	}

}
