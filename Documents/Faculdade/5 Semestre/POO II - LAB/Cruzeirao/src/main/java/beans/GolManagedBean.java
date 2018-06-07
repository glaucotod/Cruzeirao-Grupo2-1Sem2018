package beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Gol;
import models.Inscrito;
import service.GolService;


@ManagedBean(eager=true, name = "golManagedBean")
@SessionScoped
public class GolManagedBean
{
	private ArrayList<Inscrito> times =  new ArrayList<Inscrito>(); 

	private Gol gol = new Gol();
	private GolService service = new GolService();
	private ArrayList<Boolean> penalties =  new ArrayList<Boolean>();

	
	@PostConstruct
    public void init() {
		service = new GolService();
		gol = new Gol();
    }
	
	public ArrayList<Boolean> getPenalties() {
		return penalties;
	}


	public ArrayList<Inscrito> getTimes() {
		return times;
	}

	
	public void salvar()
	{
		service.salvar(gol);
		gol = new Gol();		
	}
	
	public Gol getGol() {
		return gol;
	}

	public void setGol(Gol gol) {
		this.gol = gol;
	}

	public List<Gol> getGols() {
		return service.getGols();
	}

}
