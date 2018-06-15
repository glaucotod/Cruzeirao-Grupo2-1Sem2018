package service;

import java.util.ArrayList;
import java.util.List;

import dao.CampeonatoDAO;
import dao.CartaoDAO;
import models.Cartao;


public class CartaoService
{
	private ArrayList <Cartao> cartoes = new ArrayList<Cartao>();	
	private CartaoDAO dao = new CartaoDAO();
	
	public CartaoService()
	{

	}
	
	public void salvar(Cartao cartao)
	{
		cartoes.add(cartao);
		cartao = dao.save(cartao);
		dao.closeEntityManager();
	}	

	public List <Cartao> getCartoes()
	{		
		return cartoes;		
	}
}