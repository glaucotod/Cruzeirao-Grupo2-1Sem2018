package service;

import java.util.ArrayList;
import java.util.List;

import dao.CampeonatoDAO;
import models.Campeonato;
import models.Categoria;


public class CampeonatoService {

	private List <Campeonato> campeonatos = new ArrayList<Campeonato>();
	private CampeonatoDAO dao = new CampeonatoDAO();
	
	public CampeonatoService()
	{

	}
	
	public void removeCategoriaDoCampeonato(Campeonato campeonato, Categoria categoria) {		
		for(Campeonato c : campeonatos) {
			if(c.getCategorias().contains(categoria)) { 
				c.getCategorias().remove(categoria);
				break;
			}
		}
	}
	
	
	//TODO UPDATE CATEGORIA
	public void salvarCategoriaNoCampeonato(Campeonato campeonato,Categoria categoria) {
		for(Campeonato c : campeonatos) {
			if(campeonato.equals(campeonato)) {
				campeonato.setCategoria(categoria);
				break;
			}
		}
	}
	
	public void salvar(Campeonato campeonato)
	{
		campeonatos.add(campeonato);
		campeonato = dao.save(campeonato);
		dao.closeEntityManager();
		
	}

	public void remove(Campeonato campeonato)
	{
		campeonatos.remove(campeonato);
	}

	public List <Campeonato> getCampeonatos()
	{
		return campeonatos;
	}
}
