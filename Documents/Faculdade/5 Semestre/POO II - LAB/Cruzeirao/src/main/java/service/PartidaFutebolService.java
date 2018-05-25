package service;

import java.util.ArrayList;
import java.util.List;

import models.PartidaFutebol;

public class PartidaFutebolService
{
	private List <PartidaFutebol> partidasFutebol = new ArrayList<PartidaFutebol>();	
	
	public PartidaFutebolService()
	{

	}
	
	public void salvar(PartidaFutebol partidaFutebol)
	{
		partidasFutebol.add(partidaFutebol);
	}

	public List<PartidaFutebol> getPartidasFutebol() {
		return partidasFutebol;
	}	
}