package beans;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import models.Equipe;
import models.Usuario;
import service.EquipeService;
import service.UsuarioService;

@ManagedBean(name = "equipeMB")
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
	
	public SelectItem[] getUsuariosDiretor()
	{
		SelectItem[] users = new SelectItem[UsuarioService.usuarioslist.size()];
		int i = 0;
		for(Usuario t: UsuarioService.usuarioslist) {
			users[i++] = new SelectItem(t, t.getNome());
		}
		return users;
	}
	
}
