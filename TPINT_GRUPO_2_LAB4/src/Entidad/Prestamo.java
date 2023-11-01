package Entidad;

import java.time.LocalDate;


public class Prestamo {

	private int IdPrestamo;
	private float Importe;
	private TipoPrestamo TipoP;
	private LocalDate FechaSolicitud;
	private float  ValorCuota;
	private int PlazoPago;
	private Cuenta Cuenta;
	private Cliente Cliente;
	
	//Constructores
	

	public Prestamo() {}
	
	public Prestamo(int idPrestamo, float importe, TipoPrestamo tipoP, LocalDate fechaSolicitud, float valorCuota,
			int plazoPago, Entidad.Cuenta cuenta, Entidad.Cliente cliente) {
		super();
		IdPrestamo = idPrestamo;
		Importe = importe;
		TipoP = tipoP;
		FechaSolicitud = fechaSolicitud;
		ValorCuota = valorCuota;
		PlazoPago = plazoPago;
		Cuenta = cuenta;
		Cliente = cliente;
	}
	
	//Getter

	public int getIdPrestamo() {
		return IdPrestamo;
	}

	public float getImporte() {
		return Importe;
	}

	public TipoPrestamo getTipoP() {
		return TipoP;
	}

	public LocalDate getFechaSolicitud() {
		return FechaSolicitud;
	}

	public float getValorCuota() {
		return ValorCuota;
	}

	public int getPlazoPago() {
		return PlazoPago;
	}

	public Cuenta getCuenta() {
		return Cuenta;
	}

	public Cliente getCliente() {
		return Cliente;
	}
	
	
	//Setter 
	
	public void setIdPrestamo(int idPrestamo) {
		IdPrestamo = idPrestamo;
	}

	public void setImporte(float importe) {
		Importe = importe;
	}

	public void setTipoP(TipoPrestamo tipoP) {
		TipoP = tipoP;
	}

	public void setFechaSolicitud(LocalDate fechaSolicitud) {
		FechaSolicitud = fechaSolicitud;
	}

	public void setValorCuota(float valorCuota) {
		ValorCuota = valorCuota;
	}

	public void setPlazoPago(int plazoPago) {
		PlazoPago = plazoPago;
	}

	public void setCuenta(Cuenta cuenta) {
		Cuenta = cuenta;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	
	
	//Tostring
	@Override
	public String toString() {
		return "Prestamo [IdPrestamo=" + IdPrestamo + ", Importe=" + Importe + ", TipoP=" + TipoP + ", FechaSolicitud="
				+ FechaSolicitud + ", ValorCuota=" + ValorCuota + ", PlazoPago=" + PlazoPago + ", Cuenta=" + Cuenta
				+ ", Cliente=" + Cliente + "]";
	}

	
	
	
	
}
