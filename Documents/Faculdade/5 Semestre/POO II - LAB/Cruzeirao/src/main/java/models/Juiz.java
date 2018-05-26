package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_Juiz")
public class Juiz {
	
	//private Enum tipo;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int numeroJuiz;
	private Usuario	usuario;
	
	/*public Enum getTipo() {
		return tipo;
	}
	public void setTipo(Enum tipo) {
		this.tipo = tipo;
	}*/
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}  	
}
