package beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Local;
import service.LocalService;

@ManagedBean (eager=true, name ="localManagedBean")
@SessionScoped
public class LocalManagedBean {
	
	private LocalService service = new LocalService();
	private Local local = new Local();
	@PostConstruct
    public void init() {
		service = new LocalService();
		local = new Local();
    }
	public void salvar ()
	{
		service.salvar(getLocal());
		setLocal(new Local());
	}
	
	public void remove()
	{
		service.remove(getLocal());
	}
	
	public List <Local> getLocais()
	{
		return service.getLocais();
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
}
