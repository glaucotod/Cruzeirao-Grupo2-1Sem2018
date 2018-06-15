package main;

import beans.UsuarioManagedBean;
import models.Usuario;
import service.UsuarioService;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioManagedBean a = new UsuarioManagedBean();
		Usuario u1 = new Usuario();
		a.setUsuario(u1);
		a.salvar();
		System.out.println(a.getUsuarios());
	}

}
