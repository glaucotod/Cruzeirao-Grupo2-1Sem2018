package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-29T22:38:37.782-0300")
@StaticMetamodel(Local.class)
public class Local_ {
	public static volatile SingularAttribute<Local, Integer> numeroLocal;
	public static volatile SingularAttribute<Local, String> nome;
	public static volatile SingularAttribute<Local, String> logradouro;
	public static volatile SingularAttribute<Local, String> bairro;
	public static volatile SingularAttribute<Local, String> UF;
	public static volatile SingularAttribute<Local, String> municipio;
	public static volatile SingularAttribute<Local, String> CEP;
}
