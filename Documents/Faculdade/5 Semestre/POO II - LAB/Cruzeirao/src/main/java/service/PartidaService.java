package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Inscricao;
import models.Partida;
import models.Rodada;

public class PartidaService{
	
	private List <Partida> partidas = new ArrayList<Partida>();	
	private InscricaoService inscricaoService;
	private Map<Integer, List<Partida>> partidasComFase = new HashMap<Integer, List<Partida>>(); 
	
	public PartidaService(){
		this.inscricaoService = new InscricaoService();
		this.partidas.add(new Partida(1));
		this.partidas.add(new Partida(2));
	}
	
	public void salvar(Partida partida){
	    partidas.add(partida);
	}	

	public List <Partida> getPartidas(){		
		return partidas;		
	}
	
	
	
	private void gerarPrimeirasPartidas() {	
		
		int qtd = getPotenciaDeOitoMaisProxima();
		List<Inscricao> inscricoes = inscricaoService.getInscricoes();
		Rodada rodada = new Rodada(1);
		
		for(int i = 0 ; i < qtd; i=i+2) {
			Partida partida = new Partida(i);
			partida.setData(new Date());
			partida.setEquipeMandante(inscricoes.get(i));
			partida.setEquipeVisitante(inscricoes.get(i+1));
			rodada.addPartida(partida);
		}
		
		for(int i = qtd; i < inscricaoService.getQuantidaInscritos(); i++) {
			Partida partida = new Partida(i);
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

