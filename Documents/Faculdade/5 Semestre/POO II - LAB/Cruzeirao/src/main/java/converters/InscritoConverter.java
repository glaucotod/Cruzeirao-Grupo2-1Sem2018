package converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import models.Inscrito;

@FacesConverter(value = "InscritoConverter")
public class InscritoConverter implements Converter {
	
		public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
	        if (value != null && !value.isEmpty()) {
	            return (Inscrito) uiComponent.getAttributes().get(value);
	        }
	        return null;
	    }

	    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
	        if (value instanceof Inscrito) {
	            Inscrito entity= (Inscrito) value;
	            if (entity != null && entity.getUsuario() != null && entity.getUsuario().getNome() != null) {
	                uiComponent.getAttributes().put( entity.getUsuario().getNome(), entity);
	                return entity.getUsuario().getNome();
	            }
	        }
	        return "";
	    }
}