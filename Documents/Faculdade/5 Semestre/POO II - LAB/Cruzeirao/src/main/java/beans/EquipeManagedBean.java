package beans;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import models.Equipe;
import service.EquipeService;

@ManagedBean(eager=true)
@ApplicationScoped

public class EquipeManagedBean {
	
	private EquipeService service = new EquipeService();
	private Equipe Equipe = new Equipe();

	public void salvar()
	{
		service.salvar(Equipe);
		Equipe = new Equipe();
	}
	
	public Equipe getEquipe() {
		return Equipe;
	}
	public void setEquipe(Equipe Equipe) {
		this.Equipe = Equipe;
	}
	public void remover (Equipe Equipe)
	{
		service.remove(Equipe);
	}

	public List<Equipe> getEquipes() {
		return service.getEquipes();
	}
}
