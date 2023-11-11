package java.negocioImpl;

import java.util.List;

import java.dao.TipoUsuarioDao;
import java.daoImpl.TipoUsuarioDaoImpl;
import java.entidad.TipoUsuario;
import java.negocio.TipoUsuarioNegocio;


public class TipoUsuarioNegocioImpl implements TipoUsuarioNegocio {
	
	TipoUsuarioDao tDao = new TipoUsuarioDaoImpl();

	public List<TipoUsuario> readAll() {
		List<TipoUsuario> lTipo;
		lTipo = tDao.readAll();
		return lTipo;
	}

	public TipoUsuario readOne(int codUsuario) {

		return tDao.readOne(codUsuario);
	}

}
