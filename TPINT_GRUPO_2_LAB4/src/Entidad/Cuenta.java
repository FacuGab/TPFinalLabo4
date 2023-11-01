package Entidad;


import java.time.LocalDate;

public class Cuenta {

	private int IdCuenta;
	private Cliente Cliente;
	private TipoCuenta TipoC;
	private int NumeroCuenta;
	private LocalDate FechaAlta;
	private int Cbu;
	private float Saldo;
	
	
	//Constuctor
	
	public Cuenta() {}
	
	public Cuenta(int idCuenta, Cliente cliente, TipoCuenta tipoC, int numeroCuenta, LocalDate fechaAlta,int cbu, float saldo) {
		super();
		IdCuenta = idCuenta;
		Cliente = cliente;
		TipoC = tipoC;
		NumeroCuenta = numeroCuenta;
		FechaAlta = fechaAlta;
		Cbu = cbu;
		Saldo = saldo;
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
	public LocalDate getFechaAlta() {
		return FechaAlta;
	}
	public int getCbu() {
		return Cbu;
	}
	public float getSaldo() {
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
	public void setFechaAlta(LocalDate fechaAlta) {
		FechaAlta = fechaAlta;
	}
	public void setCbu(int cbu) {
		Cbu = cbu;
	}
	public void setSaldo(float saldo) {
		Saldo = saldo;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Cuenta [IdCuenta=" + IdCuenta + ", Cliente=" + Cliente + ", TipoC=" + TipoC + ", NumeroCuenta="
				+ NumeroCuenta + ", FechaAlta=" + FechaAlta + ", Cbu=" + Cbu + ", Saldo=" + Saldo + "]";
	}
	
	
}
