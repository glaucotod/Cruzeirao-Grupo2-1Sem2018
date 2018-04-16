package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Cartao;
import models.Inscrito;
import models.Tipo;
import service.CartaoService;


@ManagedBean(name = "cartaoManagedBean")
@SessionScoped
public class CartaoManagedBean
{
	private ArrayList<Inscrito> times =  new ArrayList<Inscrito>(); 

	private Cartao cartao = new Cartao();
	private CartaoService service = new CartaoService();
	private ArrayList<Tipo> tipo =  new ArrayList<Tipo>();


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
