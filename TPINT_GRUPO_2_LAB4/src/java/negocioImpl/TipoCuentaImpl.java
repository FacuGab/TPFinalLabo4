package java.negocioImpl;

import java.util.List;

import java.dao.TipoCuentaDao;
import java.daoImpl.TipoCuentaDaoImpl;
import java.entidad.TipoCuenta;
import java.negocio.TipoCuentaNegocio;

public class TipoCuentaImpl implements TipoCuentaNegocio {
	TipoCuentaDao TipoCuentaDao = new TipoCuentaDaoImpl();

	@Override
	public boolean insert(TipoCuenta tipo_movimiento_a_agregar) {
		boolean estado = false;
		estado = TipoCuentaDao.insert(tipo_movimiento_a_agregar);
		return estado;
	}

	@Override
	public boolean logicalDeletion(TipoCuenta localidad_a_eliminar) {
		boolean estado = false;
		try {
			if (localidad_a_eliminar.getCodTipo() > 0) {
				estado = TipoCuentaDao.logicalDeletion(localidad_a_eliminar);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return estado;
	}



	@Override
	public List<TipoCuenta> readAll() {
		List<TipoCuenta> tc;
		tc = TipoCuentaDao.readAll();
		return tc;
	}

	@Override
	public TipoCuenta readOne(int codTipoCuenta) {
		TipoCuenta tc = new TipoCuenta();
		tc = TipoCuentaDao.readOne(codTipoCuenta);
		
		return tc;
	}
}
