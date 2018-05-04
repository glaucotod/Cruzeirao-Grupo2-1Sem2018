package service;

import java.util.ArrayList;
import java.util.List;

import dal.LocalDAL;
import models.Local;

public class LocalService {
	
	private ArrayList <Local> locais = new ArrayList <Local>();
	private LocalDAL dal = new LocalDAL();
	
	public LocalService ()
	{
		
	}
	
	public void salvar (Local local)
	{
		locais.add(local);
		dal.save(local);
		
	}
	
	public void remove (Local local)
	{
		locais.remove(local);
		dal.remove(local);
	}
	
	public List<Local> getLocais()
	{
		return locais;
	}
}
