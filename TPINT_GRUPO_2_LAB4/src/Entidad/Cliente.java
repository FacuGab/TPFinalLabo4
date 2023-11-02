package Entidad;

public class Cliente {
	
	private int IdCliente;
	private int Dni;
	private String Nombre;
	private String Apeliido;
	private String Direccion;
	private String Correo;
	private double Cuit;
	private String Sexo;
	private String Telefono;
	private  String Estado;
	private Localidad  Localidad;
	
	
	//Getters
	public int getIdCliente() {
		return IdCliente;
	}
	public int getDni() {
		return Dni;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getApeliido() {
		return Apeliido;
	}
	public String getDireccion() {
		return Direccion;
	}
	public String getCorreo() {
		return Correo;
	}
	public double getCuit() {
		return Cuit;
	}
	public String getSexo() {
		return Sexo;
	}
	public String getTelefono() {
		return Telefono;
	}
	public String getEstado() {
		return Estado;
	}
	public Localidad getLocalidad() {
		return Localidad;
	}
	
	//Setter
	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}
	public void setDni(int dni) {
		Dni = dni;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void setApeliido(String apeliido) {
		Apeliido = apeliido;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public void setCuit(double cuit) {
		Cuit = cuit;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public void setLocalidad(Localidad localidad) {
		Localidad = localidad;
	}
	
	
	//Tostring
	@Override
	public String toString() {
		return "Clente [IdCliente=" + IdCliente + ", Dni=" + Dni + ", Nombre=" + Nombre + ", Apeliido=" + Apeliido
				+ ", Direccion=" + Direccion + ", Correo=" + Correo + ", Cuit=" + Cuit + ", Sexo=" + Sexo
				+ ", Telefono=" + Telefono + ", Estado=" + Estado + ", Localidad=" + Localidad + "]";
	}
	
	
	
	

}
