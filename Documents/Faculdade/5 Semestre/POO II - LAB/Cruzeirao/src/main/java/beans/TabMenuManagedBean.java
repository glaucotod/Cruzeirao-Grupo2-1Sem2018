package beans;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TabMenuManagedBean {
	
	List<String> index = Arrays.asList("categoria.xhtml", "usuario.xhtml", "cadastroPessoal.xhtml", "cadastroCampeonato.xhtml",
			"equipe.xhtml", "cadastroLocal.xhtml", "aceiteEquipe.xhtml");

	public List<String> getIndex() {
		return index;
	}

	public void setIndex(List<String> index) {
		this.index = index;
	}	
	
	
}

