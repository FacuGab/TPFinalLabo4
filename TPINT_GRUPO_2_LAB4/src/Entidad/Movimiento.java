package Entidad;

import java.time.LocalDate;

public class Movimiento {

	private int IdMovimiento;	
	private LocalDate FechaMov ;
	private float Importe;
	private String Concepto;	
	private TipoMovimiento TipoMov;
	private Usuario Usuario;
	private Cuenta Cuenta;
	
	//Constructor
	public Movimiento() {}
	
	public Movimiento(int idMovimiento, LocalDate fechaMov, float importe, String concepto, TipoMovimiento tipoMov,
			Usuario usuario, Cuenta cuenta) {
		super();
		IdMovimiento = idMovimiento;
		FechaMov = fechaMov;
		Importe = importe;
		Concepto = concepto;
		TipoMov = tipoMov;
		Usuario = usuario;
		Cuenta = cuenta;
	}

	
	
	
	
	//Getters
	
	public int getIdMovimiento() {
		return IdMovimiento;
	}

	public LocalDate getFechaMov() {
		return FechaMov;
	}
	public float getImporte() {
		return Importe;
	}
	public String getConcepto() {
		return Concepto;
	}
	public TipoMovimiento getTipoMov() {
		return TipoMov;
	}
	public Usuario getUsuario() {
		return Usuario;
	}
	public Cuenta getCuenta() {
		return Cuenta;
	}
	
	
	//Setter
	
	public void setIdMovimiento(int idMovimiento) {
		IdMovimiento = idMovimiento;
	}
	public void setFechaMov(LocalDate fechaMov) {
		FechaMov = fechaMov;
	}
	public void setImporte(float importe) {
		Importe = importe;
	}
	public void setConcepto(String concepto) {
		Concepto = concepto;
	}
	public void setTipoMov(TipoMovimiento tipoMov) {
		TipoMov = tipoMov;
	}
	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}
	public void setCuenta(Cuenta cuenta) {
		Cuenta = cuenta;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Movimiento [IdMovimiento=" + IdMovimiento + ", FechaMov=" + FechaMov + ", Importe=" + Importe
				+ ", Concepto=" + Concepto + ", TipoMov=" + TipoMov + ", Usuario=" + Usuario + ", Cuenta=" + Cuenta
				+ "]";
	}
	
}
