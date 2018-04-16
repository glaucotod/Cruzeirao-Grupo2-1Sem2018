package service;

import java.util.List;

import dados.Dados;
import models.Categoria;

public class CategoriaService {
//02
	//private List <Categoria> categorias = new ArrayList<Categoria>();	
	private List<Categoria> categorias = Dados.categorias;
	
	
	public CategoriaService(){

	}
	
	public void salvar(Categoria categoria)
	{
	    categorias.add(categoria);
	}	

	public List <Categoria> getCategorias(){		
		return categorias;		
	}
}


