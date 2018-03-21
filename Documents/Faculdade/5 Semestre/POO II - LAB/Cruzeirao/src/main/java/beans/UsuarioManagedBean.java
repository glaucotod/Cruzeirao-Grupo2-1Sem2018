package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import models.Sexo;
import models.Tipo;
import models.Usuario;
import service.UsuarioService;


@ManagedBean(name = "usuarioManagedBean")
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
	
	public SelectItem[] getTiposSexo()
	{
		SelectItem[] sexos = new SelectItem[Sexo.values().length];
		int i = 0;
		for(Sexo s: Sexo.values()) {
			sexos[i++] = new SelectItem(s, s.getNome());
		}
		return sexos;
	}

	public SelectItem[] getTiposCadastro()
	{
		SelectItem[] tipos = new SelectItem[Tipo.values().length];
		int i = 0;
		for(Tipo t: Tipo.values()) {
			tipos[i++] = new SelectItem(t, t.getNome());
		}
		return tipos;
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
	
	public List<Tipo> getTiposUsuarios(){
		return Tipo.getTipos();
	}
	
	public List<Sexo> getSexos(){
		return Sexo.getSexos();
	}
}
