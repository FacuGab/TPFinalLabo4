package Datos;

import java.util.ArrayList;
import java.util.Date;

import Entidad.Cuenta;

public interface CuentaDao {
	
	public ArrayList <Cuenta> ListarTodas ();
	public Cuenta ListarUno (int idCuenta);
	public boolean  InsertarCuenta (String cbu,int idcliente,Date fecalt, int numcuenta, double saldo, int tipocuenta );
	public boolean ModificarCuenta (int idcuenta,int idCliente, int tipoCuenta, int numeroCuenta, String cbu, double saldo);
	public boolean EliminarCuenta (int idcuenta);
	
	
}
