package models;

import java.util.List;

public class PartidaFutebol {

	private List<Gol> golsMandantes;
	private List<Gol> golsVisitantes;
	private List<Gol> golsPenaltesMandantes;
	private List<Gol> golsPenaltesVisitantes;
	private List<Cartao> cartoesMandante;
	private List<Cartao> cartaoVisitante;
	
	
	
	public List<Gol> getGolsMandantes() {
		return golsMandantes;
	}
	public void addGolMandante(Gol golMandante) {
		this.golsMandantes.add(golMandante);
	}
	public List<Gol> getGolsVisitantes() {
		return golsVisitantes;
	}
	public void addGolVisitante(Gol golVisitante) {
		this.golsVisitantes.add(golVisitante);
	}
	public List<Gol> getGolsPenaltesMandantes() {
		return golsPenaltesMandantes;
	}
	public void addGolPenaltyMandante(Gol golPenaltyMandante) {
		this.golsPenaltesMandantes.add(golPenaltyMandante);
	}
	public List<Gol> getGolsPenaltesVisitantes() {
		return golsPenaltesVisitantes;
	}
	public void addGolPenaltyVisitante(Gol golPenaltyVisitante) {
		this.golsPenaltesVisitantes.add(golPenaltyVisitante);
	}
	public List<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}
	public void addCartaoMandante(Cartao cartaoMandante) {
		this.cartoesMandante.add(cartaoMandante);
	}
	public List<Cartao> getCartaoVisitante() {
		return cartaoVisitante;
	}
	public void addCartaoVisitante(Cartao cartaoVisitante) {
		this.cartaoVisitante.add(cartaoVisitante);
	}
	
}
