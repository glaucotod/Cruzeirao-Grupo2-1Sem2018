package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.InscritoDAO;
import dao.PartidaDAO;
import models.Equipe;
import models.Inscricao;
import models.Partida;
import models.PartidaFutebol;
import models.Rodada;

public class PartidaService{
	
	private List <Partida> partidas = new ArrayList<Partida>();	
	private InscricaoService inscricaoService;
	private Map<Integer, List<Partida>> partidasComFase = new HashMap<Integer, List<Partida>>(); 
	private PartidaDAO dao = new PartidaDAO();
	
	public PartidaService(){
		this.inscricaoService = new InscricaoService();
		this.partidas.add(CriaPartida(1));
		this.partidas.add(CriaPartida(2));
	}
	
	public void salvar(Partida partida){
	    partidas.add(partida);
		dao.save(partida);
		dao.closeEntityManager();
	}	

	public Partida CriaPartida(int n) {
		Partida p = new Partida();
		
		PartidaFutebol detalhes = new PartidaFutebol();
		
		Equipe e1 = new Equipe();
		e1.setNome("PRIMEIRA");
		Equipe e2 = new Equipe();
		e2.setNome("SEGUNDA");
		Equipe e3 = new Equipe();
		e3.setNome("TERCEIRA");
		
		Inscricao i1 = new Inscricao();
		Inscricao i2 = new Inscricao();
		Inscricao i3 = new Inscricao();
		
		i1.setEquipe(e1);
		i2.setEquipe(e2);
		i3.setEquipe(e3);
		
		
		p.setNumero(n);
		p.setEquipeMandante(i1);
		p.setEquipeVisitante(i2);
		return p;
	}
	public List <Partida> getPartidas(){		
		return partidas;		
	}
	
	
	
	private void gerarPrimeirasPartidas() {	
		
		int qtd = getPotenciaDeOitoMaisProxima();
		List<Inscricao> inscricoes = inscricaoService.getInscricoes();
		Rodada rodada = new Rodada(1);
		
		for(int i = 0 ; i < qtd; i=i+2) {
			Partida partida = CriaPartida(i);
			partida.setData(new Date());
			partida.setEquipeMandante(inscricoes.get(i));
			partida.setEquipeVisitante(inscricoes.get(i+1));
			rodada.addPartida(partida);
		}
		
		for(int i = qtd; i < inscricaoService.getQuantidaInscritos(); i++) {
			Partida partida = CriaPartida(i);
			partida.setData(new Date());
			partida.setEquipeMandante(inscricoes.get(i));
			rodada.addPartida(partida);
		}
	}	
	
	
	private int getPotenciaDeOitoMaisProxima() {
		double qtd = inscricaoService.getQuantidaInscritos(), i = 0;
		
		for(; i < qtd; i++) 
			if( Math.pow(2.0, i) >= qtd) break;
		
		return (int)Math.pow(2.0, i-1);
	}
	
	
}

