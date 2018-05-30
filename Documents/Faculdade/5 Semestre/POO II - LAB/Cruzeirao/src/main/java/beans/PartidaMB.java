package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import models.Cartao;
import models.Gol;
import models.Inscrito;
import models.Partida;
import models.TipoCartao;
import service.PartidaService;

@ManagedBean(name = "partidaMB")
@SessionScoped
public class PartidaMB {

	private PartidaService service;
	private Partida partidaSelected;
	private Inscrito inscritoSelected;
	
	//TEMPO DE A��O
	private int tempoGol;
	private int tempoCartao;
	//ATRIBUTOS
	private boolean foiPenaltyGol;
	private TipoCartao tipoCartao;
	//INSCRITOS
	private Inscrito inscritoGol;
	private Inscrito inscritoCartao;
	
	public PartidaMB() {
		this.partidaSelected = new Partida(20);
		this.service = new PartidaService();
		this.inscritoSelected = new Inscrito();
	}
	
	public List<Inscrito> getTodosOsInscritosDasDuasEquipes(){
		
		List<Inscrito> inscritos = new ArrayList<Inscrito>();
		
		if(partidaSelected != null) {
			if(partidaSelected.getEquipeMandante() != null && partidaSelected.getEquipeMandante().getInscritos() != null)
				inscritos.addAll(partidaSelected.getEquipeMandante().getInscritos());
			if(partidaSelected.getEquipeVisitante() != null && partidaSelected.getEquipeVisitante().getInscritos() != null)
				inscritos.addAll(partidaSelected.getEquipeVisitante().getInscritos());
		}
		
		return inscritos;
	}
	
	//TODO COLOCAR O FC MESSAGE
	public void addGol() {
		
		System.out.println("Testando novamente");
		if(tempoGol < 0 || inscritoGol == null)
			return;
		
		Gol gol = new Gol(inscritoGol,tempoGol,foiPenaltyGol);
		
		if(isMandante(inscritoGol))
			partidaSelected.getDetalhes().addGolMandante(gol);
		else
			partidaSelected.getDetalhes().addGolVisitante(gol);
	}
	
	//TODO	FALTA ADD O FACES MESSAGE
	public void addCartao() {
		
		if(inscritoCartao == null || tempoCartao < 0 || tipoCartao.toString().equals("") || tipoCartao == null) 
			return;
		
		Cartao cartao = new Cartao(inscritoCartao, tipoCartao, tempoCartao);
		
		if(isMandante(inscritoCartao))
			partidaSelected.getDetalhes().addCartaoMandante(cartao);
		else
			partidaSelected.getDetalhes().addCartaoVisitante(cartao);
	}
	
	public boolean isMandante(Inscrito inscrito) {
		return partidaSelected.getEquipeMandante().getInscritos().stream().anyMatch(i -> i.equals(inscrito));
	}
	
	public SelectItem[] getTiposCartao(){
		SelectItem[] tipos = new SelectItem[TipoCartao.values().length];
		int i = 0;
		for(TipoCartao s: TipoCartao.values()) 
			tipos[i++] = new SelectItem(s, s.getNome());
		
		return tipos;
	}
	
	public List<Partida> getPartidas() {
		return service.getPartidas();
	}

	public Partida getPartidaSelected() {
		return partidaSelected;
	}
	
	public void addPartidaSelected(Partida partida) {
		this.partidaSelected = partida;
	}
	public Inscrito getInscritoSelected() {
		return inscritoSelected;
	}
	public void setInscritoSelected(Inscrito inscritoSelected) {
		this.inscritoSelected = inscritoSelected;
	}
	public int getTempoGol() {
		return tempoGol;
	}
	public void setTempoGol(int tempoGol) {
		this.tempoGol = tempoGol;
	}
	public int getTempoCartao() {
		return tempoCartao;
	}
	public void setTempoCartao(int tempoCartao) {
		this.tempoCartao = tempoCartao;
	}
	public boolean isFoiPenaltyGol() {
		return foiPenaltyGol;
	}
	public void setFoiPenaltyGol(boolean foiPenaltyVisitante) {
		this.foiPenaltyGol = foiPenaltyVisitante;
	}
	public TipoCartao getTipoCartao() {
		return tipoCartao;
	}
	public void setTipoCartao(TipoCartao tipoCartao) {
		this.tipoCartao = tipoCartao;
	}
	public Inscrito getInscritoGol() {
		return inscritoGol;
	}
	public void setInscritoGol(Inscrito inscritoVisitante) {
		this.inscritoGol = inscritoVisitante;
	}
	public Inscrito getInscritoCartao() {
		return inscritoCartao;
	}
	public void setInscritoCartao(Inscrito inscritoCartao) {
		this.inscritoCartao = inscritoCartao;
	}
	
}
