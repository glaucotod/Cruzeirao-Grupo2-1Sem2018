package service;

import java.util.ArrayList;
import java.util.List;

import dao.InscritoDAO;
import dao.PartidaFutebolDAO;
import models.PartidaFutebol;

public class PartidaFutebolService
{
	private List <PartidaFutebol> partidasFutebol = new ArrayList<PartidaFutebol>();	
	private PartidaFutebolDAO dao = new PartidaFutebolDAO();
	
	public PartidaFutebolService()
	{

	}
	
	public void salvar(PartidaFutebol partidaFutebol)
	{
		partidasFutebol.add(partidaFutebol);
		dao.save(partidaFutebol);
		dao.closeEntityManager();
	}

	public List<PartidaFutebol> getPartidasFutebol() {
		return partidasFutebol;
	}	
}