package service;

import java.util.ArrayList;
import java.util.List;

import models.Inscrito;

public class InscritoService {
	
	private ArrayList <Inscrito> inscritos = new ArrayList<Inscrito>();
	//02
	public InscritoService()
	{

	}
	
	public void salvar(Inscrito inscrito)
	{
		inscritos.add(inscrito);
	}

	public void remove(Inscrito inscrito)
	{
		inscritos.remove(inscrito);
	}

	public List <Inscrito> getInscritos()
	{
		return inscritos;
	}
}
