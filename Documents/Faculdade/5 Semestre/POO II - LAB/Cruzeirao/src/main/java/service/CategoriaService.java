package service;

import java.util.ArrayList;
import java.util.List;

import models.Categoria;

public class CategoriaService {

	private List <Categoria> categorias = new ArrayList<Categoria>();	
	
	public CategoriaService()
	{

	}
	
	public void salvar(Categoria categoria)
	{
	    categorias.add(categoria);
	}	

	public List <Categoria> getCategorias()
	{		
		return categorias;		
	}
}


