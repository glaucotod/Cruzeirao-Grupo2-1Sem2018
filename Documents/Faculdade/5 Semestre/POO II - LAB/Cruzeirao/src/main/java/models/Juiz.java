package models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TBL_Juiz")
public class Juiz implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany(cascade = CascadeType.ALL)
	private int id;
	
	//private Enum tipo;
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
