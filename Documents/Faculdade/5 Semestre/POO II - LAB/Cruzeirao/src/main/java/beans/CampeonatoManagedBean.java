package beans;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
//import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import models.Campeonato;
import models.Categoria;
import models.Local;
import models.Sexo;
import models.Tipo;
import models.Usuario;
import service.CampeonatoService;
import service.UsuarioService;

@ManagedBean(eager=true, name = "campeonatoManagedBean")
@SessionScoped
public class CampeonatoManagedBean {

	private CampeonatoService service;
	private Campeonato campeonato;
	private Campeonato campeonatoTemp;
	private Categoria categoriaTemp = null;
	private List<Categoria> categoriasTemp = null;
	private Local localTemp = null;
	private List<Local> locaisTemp = null;
	

	@PostConstruct
    public void init() {
		service = new CampeonatoService();
		campeonato = new Campeonato();
		campeonatoTemp = new Campeonato();
    }
	
	public CampeonatoManagedBean() {
		this.localTemp = new Local();
		this.locaisTemp = new ArrayList<Local>();
		this.categoriaTemp = new Categoria();
		this.categoriasTemp = new ArrayList<Categoria>();
	}
	
	
	//METODOS PARA PASSAR ATRIBUTOS DA VIEW PARA A CLASSE LOGICA
	public void passarCampeonatoTemporario(Campeonato c) {
		this.campeonatoTemp = c;
	}
	
	//METODOS PARA SALVAR
	public void salvarCategoria() {
		//service.salvarCategoriaNoCampeonato(campeonatoTemp,categoriaTemp);
		if(!categoriasTemp.contains(categoriaTemp))
			categoriasTemp.add(categoriaTemp);
		categoriaTemp = new Categoria();
	}
	public void sla() {
		System.out.println("tesandsaudhai");
	}
	
	public void salvar(){
		service.salvar(campeonato);
		campeonato = new Campeonato();
	}
	
	//METODOS PARA REMOÇAO
	
	public void remover(Campeonato campeonato) {
		service.remove(campeonato);
	} 
	
	public void removeCategoria(Categoria categoria) {
		System.out.println("Chamou a remove categoria");
		System.out.println(categoriasTemp.remove(categoria));
		//service.removeCategoriaDoCampeonato(campeonatoTemp, categoria);
	}
	
	//METODOS GETS AND SETS
	
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

	public List<Usuario> getJuizes(){
		List<Usuario> us = new ArrayList<Usuario>();
		
		for(Usuario u : UsuarioService.usuarioslist)
			if(u.getTipo().equals(Tipo.JUIZ))
				us.add(u);
		return us;
		//return UsuarioService.usuarioslist.stream().filter(u -> u.getTipo().equals(Tipo.JUIZ)).collect(Collectors.toList());
	}

	public void setCampeonatoTemp(Campeonato campeonatoTemp) {
		this.campeonatoTemp = campeonatoTemp;
	}

	public Categoria getCategoriaTemp() {
		return categoriaTemp;
	}
	public List<Categoria> getCategoriasTemp(){
		return categoriasTemp;
	}

	public void setCategoriaTemp(Categoria categoriaTemp) {
		this.categoriaTemp = categoriaTemp;
		if(!categoriasTemp.contains(categoriaTemp))
			this.categoriasTemp.add(categoriaTemp);
	}
	
	public SelectItem[] getTiposSexo(){
		SelectItem[] sexos = new SelectItem[Sexo.values().length];
		int i = 0;
		for(Sexo s: Sexo.values()) {
			sexos[i++] = new SelectItem(s, s.getNome());
		}
		return sexos;
	}


	public Local getLocalTemp() {
		return localTemp;
	}


	public void setLocalTemp(Local localTemp) {
		this.localTemp = localTemp;
	}
	
	public List<Local> getLocais(){
		return locaisTemp;
	}
	public void addLocal() {
		locaisTemp.add(localTemp);
	}
}
