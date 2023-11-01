package Datos;

import java.time.LocalDate;
import java.util.ArrayList;

import Entidad.Movimiento;

public interface Movimientos {
     public boolean InsertarMov (String concepto , int idcuenta,LocalDate fecha,float importe, int tipmov, int idusuario);
	 public boolean EliminarMov (int idmov) ;
	 public ArrayList <Movimiento> ListarTodos();
	 public ArrayList <Movimiento> ListarPorFecha(LocalDate FechaD, LocalDate FechaH) ;
	 public ArrayList <Movimiento> ListarPorFechaAndCliente(LocalDate FechaD, LocalDate FechaH,int idcliente);
	 
}