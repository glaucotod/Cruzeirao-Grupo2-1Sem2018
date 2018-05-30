package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
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
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	private UsuarioService service = new UsuarioService();	
	private Usuario usuarioTemp = null;
	private List<Usuario> usuariosTemp = null;
	
	public UsuarioManagedBean() {
		this.usuarioTemp = new Usuario();
		this.usuariosTemp = new ArrayList<Usuario>();
	}
		
	public void passarUsuarioTemporario(Usuario u) {
		System.out.println("Chamou");
		this.usuarioTemp = u;
	}
	
	public void salvar()
	{
		service.salvar(usuario);
		usuario = new Usuario();		
	}
	
	public void editarUsuario(ActionEvent event)	
	{		
		Usuario usuario = (Usuario)event.getComponent().getAttributes().get("usuario");		
		usuario = (Usuario)event.getComponent().getAttributes().get("usuario");		
		if (usuario!=null)	
		{
			usuario.setUsuario(usuario);	
		}
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
	
	public List<Usuario> getUsuarios() {
		return service.getUsuarios();
	}
	
	public List<Tipo> getTiposUsuarios(){
		return Tipo.getTipos();
	}
	
	public List<Sexo> getSexos(){
		return Sexo.getSexos();
	}
	
	public void remove(Usuario usuario) {
		service.remove(usuario);
	}
	
	public boolean isPreparadorFisico(){
		return (usuario.getTipo() == null || !usuario.getTipo().name().equals("PREPARADOR_FISICO"));
	}

	public Usuario getUsuarioTemp() {
		return usuarioTemp;
	}

	public void setUsuarioTemp(Usuario usuarioTemp) {
		this.usuarioTemp = usuarioTemp;
		if(!usuariosTemp.contains(usuarioTemp))
			this.usuariosTemp.add(usuarioTemp);
	}

	public List<Usuario> getUsuariosTemp() {
		return usuariosTemp;
	}

	public void setUsuariosTemp(List<Usuario> usuariosTemp) {
		this.usuariosTemp = usuariosTemp;
	}
}