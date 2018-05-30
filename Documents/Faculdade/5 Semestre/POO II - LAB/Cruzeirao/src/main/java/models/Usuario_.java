package models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-29T22:38:37.915-0300")
@StaticMetamodel(Usuario.class)
public class Usuario_ {
	public static volatile SingularAttribute<Usuario, Integer> userID;
	public static volatile SingularAttribute<Usuario, String> email;
	public static volatile SingularAttribute<Usuario, String> nome;
	public static volatile SingularAttribute<Usuario, String> userName;
	public static volatile SingularAttribute<Usuario, String> senha;
	public static volatile SingularAttribute<Usuario, Date> dataNascimento;
	public static volatile SingularAttribute<Usuario, Usuario> usuario;
	public static volatile SingularAttribute<Usuario, Tipo> tipo;
	public static volatile SingularAttribute<Usuario, String> telefoneFixo;
	public static volatile SingularAttribute<Usuario, String> telefoneMovel;
	public static volatile SingularAttribute<Usuario, String> endereco;
	public static volatile SingularAttribute<Usuario, String> rg;
	public static volatile SingularAttribute<Usuario, String> cpf;
	public static volatile SingularAttribute<Usuario, String> cref;
	public static volatile SingularAttribute<Usuario, Sexo> sexo;
	public static volatile SingularAttribute<Usuario, String> foto;
}
