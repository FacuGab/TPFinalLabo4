package java.dao;

import java.util.List;

import java.entidad.TipoCuenta;

public interface TipoCuentaDao {
	public boolean insert(TipoCuenta tipo_cuenta_a_agregar);
	public boolean logicalDeletion(TipoCuenta tipo_cuenta_a_eliminar);
	public List<TipoCuenta> readAll();
	public TipoCuenta readOne(int codTipo);

}
