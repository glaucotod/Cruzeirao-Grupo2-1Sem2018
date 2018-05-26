package service;

import java.util.ArrayList;
import java.util.List;

import dao.InscritoDAO;
import models.Inscrito;

public class InscritoService {
	
	private ArrayList <Inscrito> inscritos = new ArrayList<Inscrito>();
	//02
	private InscritoDAO dao = new InscritoDAO();
	
	public InscritoService()
	{

	}
	
	public void salvar(Inscrito inscrito)
	{
		inscritos.add(inscrito);
		dao.save(inscrito);
	}

	public void remove(Inscrito inscrito)
	{
		inscritos.remove(inscrito);
		dao.remove(inscrito);
	}

	public List <Inscrito> getInscritos()
	{
		return inscritos;
	}
}
