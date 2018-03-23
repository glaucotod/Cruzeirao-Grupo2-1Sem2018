package beans;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.primefaces.event.DragDropEvent;

import models.Equipe;
import models.Local;
import models.Usuario;
import service.EquipeService;

@ManagedBean(eager=true)
@ApplicationScoped

public class EquipeManagedBean {
	
	private EquipeService service = new EquipeService();
	private Equipe equipe = new Equipe();

	public void salvar()
	{
		service.salvar(equipe);
		equipe = new Equipe();
	}
	
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe Equipe) {
		this.equipe = Equipe;
	}
	public void remover (Equipe Equipe)
	{
		service.remove(Equipe);
	}

	public List<Equipe> getEquipes() {
		return service.getEquipes();
	}
	
	/*public void onDiretoresDrop(DragDropEvent ddEvent, UsuarioManagedBean users) {
        Usuario user = ((Usuario) ddEvent.getData());
        equipe.getDiretores().add(user);
        users.remover(user);
    }*/
	
	
}
