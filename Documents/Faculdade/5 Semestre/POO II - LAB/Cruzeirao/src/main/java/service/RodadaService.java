package service;

import java.util.ArrayList;
import java.util.List;

import models.Partida;
import models.Rodada;

public class RodadaService {

private List <Rodada> rodadas = new ArrayList<Rodada>();	
	
	public RodadaService(){
		Rodada r1 = new Rodada();
		r1.setNumero(1);
		List l1 = new ArrayList();
		l1.add(new Partida(1));
		r1.setPartidas(l1);
		
		Rodada r2 = new Rodada();
		r2.setNumero(2);
		List l2 = new ArrayList();
		l2.add(new Partida(2));
		r2.setPartidas(l2);
		
		rodadas.add(r1);
		rodadas.add(r2);
	}
	
	public void salvar(Rodada rodada)
	{
	    rodadas.add(rodada);
	
	}	
	
	public List <Rodada> getRodadas()
	{		
		return rodadas;		
	}
}
