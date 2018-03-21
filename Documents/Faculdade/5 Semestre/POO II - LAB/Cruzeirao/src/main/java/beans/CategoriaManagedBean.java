package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Categoria;
import models.Sexo;
import service.CategoriaService;

@ManagedBean(name = "categoriaManagedBean")
@SessionScoped
public class CategoriaManagedBean {

	private Categoria categoria;
	private CategoriaService service;
	
	public CategoriaManagedBean() {
		categoria = new Categoria();
		service = new CategoriaService();
	}
	
	public void salvar() {
		service.salvar(categoria);
		categoria = new Categoria();
	}
	
	public List<Sexo> getSexos(){
		return Sexo.getSexos();
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public List<Categoria> getCategorias(){
		return service.getCategorias();
	}
}
