package service;

import java.util.ArrayList;
import java.util.List;

import dao.InscricoesDAO;
import dao.InscritoDAO;
import models.Inscrito;

public class InscritoService {
	
	private ArrayList <Inscrito> inscritos = new ArrayList<Inscrito>();
	private InscritoDAO dao = new InscritoDAO();
	//02
	public InscritoService()
	{

	}
	
	public void salvar(Inscrito inscrito)
	{
		inscritos.add(inscrito);
		dao.save(inscrito);
		dao.closeEntityManager();
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
