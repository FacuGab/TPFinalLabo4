package java.dao;

import java.util.List;

import java.entidad.TipoUsuario;

public interface TipoUsuarioDao {
	
	public List<TipoUsuario> readAll();
	
	public TipoUsuario readOne(int codTipoUsuario);

}
