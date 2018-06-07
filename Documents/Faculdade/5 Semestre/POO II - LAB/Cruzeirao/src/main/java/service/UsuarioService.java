package service;

import java.util.ArrayList;
import java.util.List;

import dao.UsuarioDAO;
import models.Usuario;

public class UsuarioService
{
	private ArrayList <Usuario> usuarios = new ArrayList<Usuario>();	
	public static ArrayList<Usuario> usuarioslist = new ArrayList<Usuario>();
	private UsuarioDAO dao = new UsuarioDAO();	
	
	public UsuarioService()
	{

	}
	
	public void salvar(Usuario usuario){
	    usuarios.add(usuario);
	    usuarioslist.add(usuario);
		dao.save(usuario);
		dao.closeEntityManager();
	}	

	public List <Usuario> getUsuarios(){	
		return dao.getAll(Usuario.class);
	}
	
	public void remove(Usuario usuario) {
		if(usuarioslist.remove(usuario))
			System.out.println("Removeu");
		else
			System.out.println("Nao removeu");
		dao.remove(usuario);
	}
}
