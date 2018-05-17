package beans;


import java.util.ArrayList;
import java.util.List;

//import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import models.Campeonato;
import models.Categoria;
import models.Local;
import models.Tipo;
import models.Usuario;
import service.CampeonatoService;
import service.UsuarioService;

@ManagedBean(eager=true, name = "campeonatoManagedBean")
@SessionScoped
public class CampeonatoManagedBean {

	private CampeonatoService service = new CampeonatoService();
	private Campeonato campeonato = new Campeonato();
	private ArrayList<Usuario> listaJuizes = new ArrayList<Usuario>(); 
	private Campeonato campeonatoTemp = new Campeonato();
	private Categoria categoriaTemp = null;
	private List<Categoria> categoriasTemp = null;
	
	public CampeonatoManagedBean() {
		this.categoriaTemp = new Categoria();
		this.categoriasTemp = new ArrayList<Categoria>();
	}
	
	public ArrayList<Usuario> getJuizes()
	{	
		for (Usuario i : UsuarioService.usuarioslist)
			if (i.getTipo() == Tipo.JUIZ)
			{
				listaJuizes.add(i);
			}
		return listaJuizes;
	}
	
	public void editarCategoria(ActionEvent event)	
	{		
		List<Categoria> categorias = (List<Categoria>)event.getComponent().getAttributes().get("categorias");		
		campeonato = (Campeonato)event.getComponent().getAttributes().get("campeonato");		
		if (categorias!=null && categorias.size()>0)	
		{
			campeonato.setCategorias(categorias);	
		}
		else
		{
			campeonato.setCategorias(new ArrayList<Categoria>());		
		}
	}
	
	public void editarLocal(ActionEvent event)	
	{		
		List<Local> locais = (List<Local>)event.getComponent().getAttributes().get("locais");		
		campeonato = (Campeonato)event.getComponent().getAttributes().get("campeonato");		
		if (locais!=null && locais.size()>0)	
		{
			campeonato.setLocais(locais);	
		}
		else
		{
			campeonato.setLocais(new ArrayList<Local>());		
		}
	}
	
	public void salvar()
	{
		service.salvar(campeonato);
		campeonato = new Campeonato();
	}
	public void remover(Campeonato campeonato) {
		service.remove(campeonato);
	} 
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public List<Campeonato> getCampeonatos() {
		return service.getCampeonatos();
	}

	public Campeonato getCampeonatoTemp() {
		return campeonatoTemp;
	}

	public void setCampeonatoTemp(Campeonato campeonatoTemp) {
		this.campeonatoTemp = campeonatoTemp;
	}

	public Categoria getCategoriaTemp() {
		return categoriaTemp;
	}

	public void setCategoriaTemp(Categoria categoriaTemp) {
		this.categoriaTemp = categoriaTemp;
		if(!categoriasTemp.contains(categoriaTemp))
			this.categoriasTemp.add(categoriaTemp);
	}
	
	public List<Categoria> getCategoriasTemp(){
		return categoriasTemp;
	}
	
	public void removeCategoria(Categoria categoriaTemp) {
		if(categoriasTemp.remove(categoriaTemp))
			System.out.println("Sucesso");
		else
			System.out.println("Falha");
	}
}
