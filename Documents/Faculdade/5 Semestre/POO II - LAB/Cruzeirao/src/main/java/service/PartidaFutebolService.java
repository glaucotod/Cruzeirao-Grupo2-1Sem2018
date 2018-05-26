package service;

import java.util.ArrayList;

import dao.PartidaFutebolDAO;
import models.PartidaFutebol;

public class PartidaFutebolService
{
	private ArrayList <PartidaFutebol> partidasFutebol = new ArrayList<PartidaFutebol>();	
	
	private PartidaFutebolDAO dao = new PartidaFutebolDAO();
	
	public PartidaFutebolService()
	{

	}
	
	public void salvar(PartidaFutebol partidaFutebol)
	{
		partidasFutebol.add(partidaFutebol);
		dao.save(partidaFutebol);
	}
	
	public void remove(PartidaFutebol partidaFutebol)
	{
		partidasFutebol.remove(partidaFutebol);
		dao.remove(partidaFutebol);
	}

	public ArrayList<PartidaFutebol> getPartidasFutebol() {
		return partidasFutebol;
	}	
}