package service;

import java.util.ArrayList;
import java.util.List;

import models.Campeonato;


public class CampeonatoService {

	private ArrayList <Campeonato> campeonatos = new ArrayList<Campeonato>();
	
	public CampeonatoService()
	{

	}
	
	public void salvar(Campeonato campeonato)
	{
		campeonatos.add(campeonato);
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
