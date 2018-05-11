package service;

import java.util.ArrayList;
import java.util.List;

import dao.UsuarioDAO;
import models.Usuario;

public class UsuarioService
{
	private ArrayList <Usuario> usuarios = new ArrayList<Usuario>();	
	public static ArrayList<Usuario> usuarioslist = new ArrayList<Usuario>();
	private UsuarioDAO usuarioDAO = new UsuarioDAO();	
	
	public UsuarioService()
	{

	}
	
	public void salvar(Usuario usuario){
	    usuarios.add(usuario);
	    usuarioslist.add(usuario);
	    usuarioDAO.save(usuario);
	}	

	public List <Usuario> getUsuarios(){	
		return usuarioDAO.getAll(Usuario.class);
	}
	
	public void remove(Usuario usuario) {
		usuarioDAO.remove(usuario);
	}
}
