package beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import org.primefaces.model.DualListModel;

import dados.Dados;
import models.Campeonato;
import models.Categoria;
import models.Equipe;
import models.Inscricao;
import models.Inscrito;
import models.Usuario;
import service.CategoriaService;
import service.EquipeService;
import service.InscricaoService;
import service.UsuarioService;

@ManagedBean(eager=true, name = "equipeMB")
@SessionScoped
public class EquipeManagedBean {
	//01
	private EquipeService equipeService;
	private Equipe equipe;
	private Usuario usuario = new Usuario();
	private Equipe selectedEquipe = new Equipe();
	private DualListModel<Usuario> usuarioModel;
	private List<Categoria> categorias = Dados.categorias;
	private Inscricao inscricao;
	private Categoria categoria;
	private InscricaoService inscricoesService = new InscricaoService();
	private Campeonato campeonato;
	private List<Categoria> categoriasPorCampeonato = new ArrayList<Categoria>();
	

	@PostConstruct
    public void init() {
		equipeService = new EquipeService();
		equipe = new Equipe();
    }
	
	public EquipeManagedBean() {
		campeonato = new Campeonato();
		categoria = new Categoria();
		inscricao = new Inscricao();
	}
	
	public DualListModel<Usuario> getUsuarioModel(){
		 if(this.usuarioModel==null){ 
			 this.usuarioModel = new DualListModel<Usuario>(UsuarioService.usuarioslist, new ArrayList<Usuario>());
		 }
		 return this.usuarioModel;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void salvar()
	{
		List<Usuario> usuariosSelecionados = usuarioModel.getTarget();
		
		for(Usuario u : usuariosSelecionados) 
			inscreveJogador(u);
		
		for (Usuario i : UsuarioService.usuarioslist) {
			if (i.getEmail().equals(usuario.getEmail())) {
				usuario = i;
				break;
			}
		}
		equipe.setDiretor(usuario);
		inscricao.setEquipe(equipe);
		inscricao.setCategoria(categoria);
		inscricao.setPagamento(false);
		inscricao.setPartidas(null);
		inscricao.setValidada(false);
		
		inscricoesService.salvar(inscricao);
		equipeService.salvar(equipe);
		cleanObjects();
	}
	
	private void cleanObjects() {
		inscricao = new Inscricao();
		equipe = new Equipe();
		usuario = new Usuario();
		usuarioModel.setTarget(new ArrayList<Usuario>());
	}
	
	private void inscreveJogador(Usuario u) {
		Inscrito inscrito = new Inscrito(u.getTipo(),u, this.inscricao, false, false, false);
		inscricao.addInscrito(inscrito);
	}
	
	public void conf()
	{
		for (Equipe i : EquipeService.equipes) {
			if (i.getNome().equals(equipe.getNome())) {
				equipe = i;
				break;
			}
		}			
		
		equipeService.conf(equipe);
		
	}
	
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe Equipe) {
		this.equipe = Equipe;
	}
	public void remover (Equipe Equipe)
	{
		equipeService.remove(Equipe);
	}

	public List<Equipe> getEquipes() {
		return equipeService.getEquipes();
	}
	
	
	public SelectItem[] getUsuariosDiretor()
	{
		SelectItem[] users = new SelectItem[UsuarioService.usuarioslist.size()];
		int i = 0;
		for(Usuario t: UsuarioService.usuarioslist) {
			users[i++] = new SelectItem(t, t.getNome());
		}
		return users;
	}
	public List<Usuario> listarUsuarios()
	{
		return UsuarioService.usuarioslist;
	}
	public List<Equipe> listarEquipes()
	{
		return EquipeService.equipes;
	}
	public List<Equipe> listarEquipesConf()
	{
		return EquipeService.equipesConf;
	}
	public Equipe getSelectedEquipe() {
		return selectedEquipe;
	}
	public void setSelectedEquipe(Equipe selectedEquipe) {
		this.selectedEquipe = selectedEquipe;
	}

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	public void setUsuarioModel(DualListModel<Usuario> usuarioModel) {
		this.usuarioModel = usuarioModel;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}
	
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	
	public void onCampeonatoChange() {
        if(campeonato !=null && !campeonato.getNome().equals(""))
            categoriasPorCampeonato = campeonato.getCategorias();
        else
            categoriasPorCampeonato = new ArrayList<Categoria>();
    }
}