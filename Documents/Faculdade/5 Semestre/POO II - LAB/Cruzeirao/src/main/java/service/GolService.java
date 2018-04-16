package service;

import java.util.ArrayList;
import java.util.List;

import models.Gol;


public class GolService
{
	private ArrayList <Gol> gols = new ArrayList<Gol>();	
	
	public GolService()
	{

	}
	
	public void salvar(Gol gol)
	{
	    gols.add(gol);
	}	

	public List <Gol> getGols()
	{		
		return gols;		
	}
}