package service;

import java.util.ArrayList;
import java.util.List;

import dao.GolDAO;
import models.Gol;


public class GolService
{
	private ArrayList <Gol> gols = new ArrayList<Gol>();
	private GolDAO dao = new GolDAO();
	
	public GolService()
	{

	}
	
	public void salvar(Gol gol)
	{
	    gols.add(gol);
	    dao.save(gol);
	}	
	
	public void remove(Gol gol)
	{
		gols.remove(gol);
		dao.remove(gol);
		
	}

	public List <Gol> getGols()
	{		
		return gols;		
	}
}