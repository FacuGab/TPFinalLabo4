package Entidad;

import java.util.Date;

public class Cuenta {

	private int IdCuenta;
	private Cliente Cliente;
	private TipoCuenta TipoC;
	private int NumeroCuenta;
	private Date FechaAlta;
	private String Cbu;
	private double Saldo;
	private boolean Estado;
	
	
	//Constuctor
	
	public Cuenta() {}
	
	public Cuenta(int idCuenta, Cliente cliente, TipoCuenta tipoC, int numeroCuenta, Date fechaAlta,String cbu, double saldo, boolean estado) {
		super();
		IdCuenta = idCuenta;
		Cliente = cliente;
		TipoC = tipoC;
		NumeroCuenta = numeroCuenta;
		FechaAlta = fechaAlta;
		Cbu = cbu;
		Saldo = saldo;
		Estado = estado;
	}
	
	//Getters
	
	public int getIdCuenta() {
		return IdCuenta;
	}

	public Cliente getCliente() {
		return Cliente;
	}
	public TipoCuenta getTipoC() {
		return TipoC;
	}
	public int getNumeroCuenta() {
		return NumeroCuenta;
	}
	public Date getFechaAlta() {
		return FechaAlta;
	}
	public String getCbu() {
		return Cbu;
	}
	public double getSaldo() {
		return Saldo;
	}
	
	//Setters
	public void setIdCuenta(int idCuenta) {
		IdCuenta = idCuenta;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	public void setTipoC(TipoCuenta tipoC) {
		TipoC = tipoC;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}
	public void setFechaAlta(Date fechaAlta) {
		FechaAlta = fechaAlta;
	}
	public void setCbu(String cbu) {
		Cbu = cbu;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public void setEstado(boolean estado) {
		Estado = estado;
	}

	@Override
	public String toString() {
		return "Cuenta [IdCuenta=" + IdCuenta + ", Cliente=" + Cliente + ", TipoC=" + TipoC + ", NumeroCuenta="
				+ NumeroCuenta + ", FechaAlta=" + FechaAlta + ", Cbu=" + Cbu + ", Saldo=" + Saldo + ", Estado=" + Estado
				+ "]";
	}
	
}


