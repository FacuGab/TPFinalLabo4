package java.negocio;

import java.util.List;

import java.entidad.TipoUsuario;

public interface TipoUsuarioNegocio {
	
public List<TipoUsuario> readAll();
	
	public TipoUsuario readOne(int codTipoUsuario);

}
