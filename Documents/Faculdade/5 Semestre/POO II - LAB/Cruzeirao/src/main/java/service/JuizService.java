package service;

import java.util.ArrayList;
import java.util.List;

import dao.JuizDAO;
import models.Juiz;

public class JuizService {
	
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	private JuizDAO dao = new JuizDAO();
	
	
	public JuizService ()
	{
		
		
	}
	
	public void salvar (Juiz juiz)
	{
		juizes.add(juiz);
		dao.save(juiz);
	}
	
	public void remove (Juiz juiz)
	{
		juizes.remove(juiz);
		dao.remove(juiz);
	}
	
	public List <Juiz> getJuizes ()
	{
		return juizes;
	}
}
