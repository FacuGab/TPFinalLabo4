package Datos;

import java.time.LocalDate;
import java.util.ArrayList;

import Entidad.Cuenta;

public interface CuentaDao {
	
	public ArrayList <Cuenta> ListarTodas ();
	public Cuenta ListarUno (int idCuenta);
	public boolean  InsertarCuenta (int cbu,int idcliente,LocalDate fecalt, int numcuenta, float saldo, int tipocuenta );
	public boolean ModificarCuenta (int idcuenta);
	public boolean EliminarCuenta (int idcuenta);
	
	
}
