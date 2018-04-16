package converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import models.Usuario;

@FacesConverter(value = "UsuarioConverter")
public class UsuarioConverter implements Converter {
	@Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (Usuario) uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof Usuario) {
            Usuario entity= (Usuario) value;
            if (entity != null && entity.getNome() != null) {
                uiComponent.getAttributes().put( entity.getNome(), entity);
                return entity.getNome();
            }
        }
        return "";
    }
}
