package Datos;

import java.util.ArrayList;
import Entidad.TipoCuenta;;

public interface TipoCuentaDao {

	public ArrayList <TipoCuenta> ListarTodas();
	public TipoCuenta ListarUno(int id);
}
