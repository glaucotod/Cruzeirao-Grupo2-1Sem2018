package service;

import java.util.ArrayList;
import java.util.List;
import models.Usuario;

public class UsuarioService
{
	private ArrayList <Usuario> usuarios = new ArrayList<Usuario>();	
	public static ArrayList<Usuario> usuarioslist = new ArrayList<Usuario>();
	
	public UsuarioService()
	{

	}
	
	public void salvar(Usuario usuario)
	{
	    usuarios.add(usuario);
	    usuarioslist.add(usuario);
	
	}	

	public List <Usuario> getUsuarios()
	{		
		return usuarios;		
	}
}
