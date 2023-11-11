package java.negocio;

import java.util.List;

import java.entidad.Cuota;
import java.entidad.Prestamo;

public interface PrestamosNegocio {
	public List<Prestamo> readAllDni(String dni);
	public List<Cuota> getCuotas(int codPrestamo);
}
