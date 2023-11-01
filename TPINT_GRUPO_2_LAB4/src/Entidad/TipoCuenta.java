package Entidad;

public class TipoCuenta {
	
	private int IdTipoCuenta;
	private String Descripcion;
	
	
	//Getters
	public int getIdTipoCuenta() {
		return IdTipoCuenta;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	
	//Setter
	public void setIdTipoCuenta(int idTipoCuenta) {
		IdTipoCuenta = idTipoCuenta;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	
	//Tostring
	@Override
	public String toString() {
		return "TipoCuenta [IdTipoCuenta=" + IdTipoCuenta + ", Descripcion=" + Descripcion + "]";
	}
	
	
	

}
