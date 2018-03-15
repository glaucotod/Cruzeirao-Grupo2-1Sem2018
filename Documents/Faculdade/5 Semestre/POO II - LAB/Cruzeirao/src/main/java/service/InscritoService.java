package service;

import java.util.ArrayList;
import java.util.List;

import model.Inscrito;

public class InscritoService {
	
	private ArrayList <Inscrito> inscritos = new ArrayList<Inscrito>();
	
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
