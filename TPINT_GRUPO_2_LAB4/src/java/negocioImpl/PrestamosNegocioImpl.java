package java.negocioImpl;

import java.util.List;

import java.daoImpl.PrestamosDaoImpl;
import java.entidad.Cuota;
import java.entidad.Prestamo;
import java.negocio.PrestamosNegocio;

public class PrestamosNegocioImpl implements PrestamosNegocio{
	PrestamosDaoImpl prestamos = new PrestamosDaoImpl();
	public List<Prestamo> readAllDni(String dni){
		return prestamos.readAllDni(dni);
	}
	
	public List<Cuota> getCuotas(int codPrestamo){
		return prestamos.getCuotas(codPrestamo);
	}
}
