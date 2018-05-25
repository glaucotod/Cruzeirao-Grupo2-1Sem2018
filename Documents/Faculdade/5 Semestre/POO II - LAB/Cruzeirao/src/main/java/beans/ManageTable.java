package beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Partida;
import models.Rodada;
import service.RodadaService;

public class ManageTable {

	private RodadaService service = new RodadaService();
	public Map<Integer, List<Partida>> map = new HashMap<Integer, List<Partida>>();
	
	public Map<Integer, List<Partida>> getRodadas(){
		for(Rodada rodada : service.getRodadas()) 
			map.put(rodada.getNumero(), rodada.getPartidas());
		return map;
	}
	
	private double getMultiploDeDoisMaisProximo() {
		int qtd = qtdTimes();
		double anterior; 
		
		for(double i = 0; i <= qtd; i++) {
			anterior = Math.pow(2.0, i);
			
			if(anterior > qtd)
				return Math.pow(2.0, (double) i - 1);
		}
		
		return 0;
	}
	
	private int qtdTimes() {
		return 2;
	}
}
