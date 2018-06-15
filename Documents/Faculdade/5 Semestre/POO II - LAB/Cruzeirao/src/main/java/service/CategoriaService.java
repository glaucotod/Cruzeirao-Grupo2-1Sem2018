package service;

import java.util.List;

import dados.Dados;
import dao.CartaoDAO;
import dao.CategoriaDAO;
import models.Categoria;

public class CategoriaService {
//02
	//private List <Categoria> categorias = new ArrayList<Categoria>();	
	private List<Categoria> categorias = Dados.categorias;
	private CategoriaDAO dao = new CategoriaDAO();
	
	
	public CategoriaService(){

	}
	
	public void salvar(Categoria categoria)
	{
	    categorias.add(categoria);
	    categoria = dao.save(categoria);
		dao.closeEntityManager();
	}	

	public List <Categoria> getCategorias(){		
		return categorias;		
	}
}


