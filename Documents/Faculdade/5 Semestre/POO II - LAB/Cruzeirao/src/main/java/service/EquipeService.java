package service;

import java.util.ArrayList;
import java.util.List;

import models.Equipe;

public class EquipeService {
public static ArrayList <Equipe> equipes = new ArrayList<Equipe>();
public static ArrayList <Equipe> equipesConf = new ArrayList<Equipe>();	
	public EquipeService()
	{

	}
	
	public void salvar(Equipe equipe)
	{
		equipes.add(equipe);
	}
	
	public void conf(Equipe equipe)
	{
		equipesConf.add(equipe);
		equipes.remove(equipe);
	}
	
	public void remove(Equipe equipe)
	{
		equipes.remove(equipe);
	}

	public List <Equipe> getEquipes()
	{
		return equipes;
	}
}
