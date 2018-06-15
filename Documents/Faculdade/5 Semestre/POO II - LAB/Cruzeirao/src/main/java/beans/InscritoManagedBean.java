package beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Inscrito;
import service.InscritoService;

@ManagedBean(eager=true)
@SessionScoped

public class InscritoManagedBean {

	private InscritoService service = new InscritoService();
	private Inscrito Inscrito = new Inscrito();

	@PostConstruct
    public void init() {
		service = new InscritoService();
		Inscrito = new Inscrito();
    }
	public void salvar()
	{
		service.salvar(Inscrito);
		Inscrito = new Inscrito();
	}
	
	public Inscrito getInscrito() {
		return Inscrito;
	}
	public void setInscrito(Inscrito Inscrito) {
		this.Inscrito = Inscrito;
	}
	public void remover (Inscrito Inscrito)
	{
		service.remove(Inscrito);
	}

	public List<Inscrito> getInscritos() {
		return service.getInscritos();
	}
}
