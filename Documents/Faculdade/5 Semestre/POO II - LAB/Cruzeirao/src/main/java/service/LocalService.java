package service;

import java.util.ArrayList;
import java.util.List;

import dao.LocalDAO;
import models.Local;

public class LocalService {
	
	private ArrayList <Local> locais = new ArrayList <Local>();
	private LocalDAO dao = new LocalDAO();
	
	public LocalService ()
	{
		
	}
	
	public void salvar (Local local)
	{
		locais.add(local);
		dao.save(local);
		
	}
	
	public void remove (Local local)
	{
		locais.remove(local);
		dao.remove(local);
	}
	
	public List<Local> getLocais()
	{
		return locais;
	}
}
