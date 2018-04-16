package service;

import java.util.ArrayList;

import models.PartidaFutebol;

public class PartidaFutebolService
{
	private ArrayList <PartidaFutebol> partidasFutebol = new ArrayList<PartidaFutebol>();	
	
	public PartidaFutebolService()
	{

	}
	
	public void salvar(PartidaFutebol partidaFutebol)
	{
		partidasFutebol.add(partidaFutebol);
	}

	public ArrayList<PartidaFutebol> getPartidasFutebol() {
		return partidasFutebol;
	}	
}