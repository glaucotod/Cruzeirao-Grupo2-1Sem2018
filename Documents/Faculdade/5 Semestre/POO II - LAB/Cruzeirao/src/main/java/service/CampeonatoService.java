package service;

import java.util.ArrayList;
import java.util.List;

import dao.CampeonatoDAO;
import models.Campeonato;


public class CampeonatoService {

	private ArrayList <Campeonato> campeonatos = new ArrayList<Campeonato>();
	private CampeonatoDAO dao = new CampeonatoDAO();
	
	public CampeonatoService()
	{

	}
	
	public void salvar(Campeonato campeonato)
	{
		campeonatos.add(campeonato);
		dao.save(campeonato);
	}

	public void remove(Campeonato campeonato)
	{
		campeonatos.remove(campeonato);
		dao.remove(campeonato);
	}

	public List <Campeonato> getCampeonatos()
	{
		return campeonatos;
	}
}
