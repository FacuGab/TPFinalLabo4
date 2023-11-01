package Datos;

import java.time.LocalDate;
import java.util.ArrayList;

import Entidad.Prestamo;

public interface PrestamoDao {
	
	public boolean  ActualizarPrestamo(Prestamo prestamo);
	public ArrayList <Prestamo>ListarTodos();
	public ArrayList <Prestamo>ListarPorCliente(int idcliente);
	public ArrayList <Prestamo>ListarPorClienteAndFecha(int idcliente, LocalDate fechadesde, LocalDate fechahasta);
	public boolean  InsertarPrestamo (int idcliente, int idcuenta, LocalDate fecha,float importe, int plazo, float valorcuota );
	
	
	
}
