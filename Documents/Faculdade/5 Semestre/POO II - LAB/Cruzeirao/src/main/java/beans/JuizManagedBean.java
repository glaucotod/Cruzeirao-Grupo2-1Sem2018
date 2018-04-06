package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Juiz;
import service.JuizService;

@ManagedBean (name = "juizManagedBean")
@SessionScoped
public class JuizManagedBean {

	private Juiz juiz;
	private JuizService service;
	
	public JuizManagedBean()
	{
		setJuiz(new Juiz());
		service = new JuizService();
	}
	
	public void salvar ()
	{
		service.salvar(getJuiz());
		setJuiz(new Juiz());
	}
	
	public void remove()
	{
		service.remove(getJuiz());
	}
	
	
	public List <Juiz> getJuizes()
	{
		return service.getJuizes();
	}

	public Juiz getJuiz() {
		return juiz;
	}

	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}
}
