package java.dao;

import java.util.List;

import java.entidad.Cuota;
import java.entidad.Prestamo;


public interface PrestamosDao {
	
	public boolean insert(Prestamo prestamo);

	public boolean logicalDeletion(Prestamo prestamo); // Baja lógica

	public boolean update(Prestamo prestamo);

	public Prestamo readOne(int nroCuenta);
	
	public List<Prestamo> readAll();

	public String readLast();

	public List<Prestamo> readAllDni(String dni);
	
	public List<Cuota> getCuotas(int codPrestamo);
}
