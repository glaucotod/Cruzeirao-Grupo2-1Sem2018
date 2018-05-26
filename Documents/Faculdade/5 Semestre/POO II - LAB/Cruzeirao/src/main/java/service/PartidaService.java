package service;

import java.util.ArrayList;
import java.util.List;

import dao.PartidaDAO;
import models.Partida;

public class PartidaService
{
	private ArrayList <Partida> partidas = new ArrayList<Partida>();	
	private PartidaDAO dao = new PartidaDAO();
	
	
	public PartidaService()
	{

	}
	
	public void salvar(Partida partida)
	{
	    partidas.add(partida);
	    dao.save(partida);
	
	}	
	
	public void remove(Partida partida)
	{
		partidas.remove(partida);
		dao.remove(partida);
	}

	public List <Partida> getPartidas()
	{		
		return partidas;		
	}
}

