package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Usuario;
import service.UsuarioService;

@ManagedBean
@SessionScoped
public class UsuarioManagedBean 
{
	private Usuario usuario = new Usuario();
	private UsuarioService service = new UsuarioService();	
	
	public void salvar()
	{
		service.salvar(usuario);
		usuario = new Usuario();		
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return service.getUsuarios();
	}
}