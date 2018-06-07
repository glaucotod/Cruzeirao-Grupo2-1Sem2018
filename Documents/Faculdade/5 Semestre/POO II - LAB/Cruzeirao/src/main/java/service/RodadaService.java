package service;

import java.util.ArrayList;
import java.util.List;

import dao.InscritoDAO;
import dao.RodadaDAO;
import models.Partida;
import models.Rodada;

public class RodadaService {

private List <Rodada> rodadas = new ArrayList<Rodada>();	
private RodadaDAO dao = new RodadaDAO();
	
	public RodadaService(){
		PartidaService p =new PartidaService();
		Rodada r1 = new Rodada();
		r1.setNumero(1);
		List<Partida> l1 = new ArrayList<Partida>();
		l1.add(p.CriaPartida(1));
		r1.setPartidas(l1);
		
		Rodada r2 = new Rodada();
		r2.setNumero(2);
		List<Partida> l2 = new ArrayList<Partida>();
		l2.add(p.CriaPartida(2));
		r2.setPartidas(l2);
		
		rodadas.add(r1);
		rodadas.add(r2);
	}
	
	public void salvar(Rodada rodada)
	{
	    rodadas.add(rodada);
		dao.save(rodada);
		dao.closeEntityManager();
	
	}	
	
	public List <Rodada> getRodadas()
	{		
		return rodadas;		
	}
}
