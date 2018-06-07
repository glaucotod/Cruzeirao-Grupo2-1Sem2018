package models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PartidaFutebol")
public class PartidaFutebol implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany(cascade = CascadeType.ALL)
	private int id;

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
