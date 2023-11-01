package Datos;

import java.time.LocalDate;
import java.util.ArrayList;

import Entidad.Cuenta;

public interface CuentaDao {
	
	public ArrayList <Cuenta> ListarTodas ();
	public ArrayList <Cuenta> ListarCliente (int idcliente);
	public boolean  InsertarCuenta (int cbu,int idcliente,LocalDate fecalt, int numcuenta, float saldo, int tipocuenta );
	public boolean ModificarCuenta (int idcuenta);
	public boolean EliminarCuenta (int idcuenta);
	
	
}
