package beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Campeonato;
import models.Cartao;
import models.Inscrito;
import models.Tipo;
import service.CampeonatoService;
import service.CartaoService;


@ManagedBean(eager=true, name = "cartaoManagedBean")
@SessionScoped
public class CartaoManagedBean
{
	private ArrayList<Inscrito> times =  new ArrayList<Inscrito>(); 

	private Cartao cartao;
	private CartaoService service;
	private ArrayList<Tipo> tipo =  new ArrayList<Tipo>();

	@PostConstruct
    public void init() {
		service  = new CartaoService();
		cartao = new Cartao();
    }

	public ArrayList<Tipo> getTipo() {
		return tipo;
	}


	public ArrayList<Inscrito> getTimes() {
		return times;
	}

	
	public void salvar()
	{
		service.salvar(cartao);
		cartao = new Cartao();		
	}
	
	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public List<Cartao> getCartoes() {
		return service.getCartoes();
	}

}
