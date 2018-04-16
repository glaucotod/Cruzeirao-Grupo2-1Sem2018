package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Cartao;
import models.Gol;
import models.PartidaFutebol;
import service.PartidaFutebolService;



@ManagedBean(name = "partidaFutebolManagedBean")
@SessionScoped
public class PartidaFutebolManagedBean
{
	private PartidaFutebol partidaFutebol = new PartidaFutebol();
	private PartidaFutebolService service = new PartidaFutebolService();	
	private ArrayList<Gol> gols =  new ArrayList<Gol>(); 
	public ArrayList<Gol> getGols() {
		return gols;
	}

	public ArrayList<Cartao> getCartoes() {
		return cartoes;
	}

	private ArrayList<Cartao> cartoes =  new ArrayList<Cartao>(); 
	
	public void salvar()
	{
		service.salvar(partidaFutebol);
		partidaFutebol = new PartidaFutebol();		
	}
	
	public PartidaFutebol getPartidaFutebol() {
		return partidaFutebol;
	}

	public void setPartidaFutebol(PartidaFutebol partidaFutebol) {
		this.partidaFutebol = partidaFutebol;
	}

	public List<PartidaFutebol> getPartidasFutebol() {
		return service.getPartidasFutebol();
	}

}
