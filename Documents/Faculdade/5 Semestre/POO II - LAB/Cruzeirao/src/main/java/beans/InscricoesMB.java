package beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Categoria;
import models.Gol;
import models.Inscricao;
import service.CategoriaService;
import service.GolService;
import service.InscricaoService;

@ManagedBean(eager=true, name = "inscricoesMB")
@SessionScoped
public class InscricoesMB {

	private InscricaoService inscricoesService = new InscricaoService();
	private List<Inscricao> inscricoes = inscricoesService.getInscricoes();
	private Inscricao selectecInscricao;
	private CategoriaService categoriaService = new CategoriaService();

	
	@PostConstruct
    public void init() {
		inscricoesService = new InscricaoService();
		selectecInscricao = new Inscricao();
    }
	
	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}

	public Inscricao getSelectecInscricao() {
		return selectecInscricao;
	}

	public void setSelectecInscricao(Inscricao selectecInscricao) {
		this.selectecInscricao = selectecInscricao;
	}
	
	public void confirmarInscricao() {
		selectecInscricao.setValidada(true);
	}
	public List<Categoria> getCategorias() {
		return categoriaService.getCategorias();
	}
}
