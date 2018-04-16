package service;

import java.util.ArrayList;
import java.util.List;

import models.Partida;

public class PartidaService
{
	private ArrayList <Partida> partidas = new ArrayList<Partida>();	
	
	public PartidaService()
	{

	}
	
	public void salvar(Partida partida)
	{
	    partidas.add(partida);
	
	}	

	public List <Partida> getPartidas()
	{		
		return partidas;		
	}
}

