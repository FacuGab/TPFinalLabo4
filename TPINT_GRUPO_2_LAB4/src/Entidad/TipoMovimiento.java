package Entidad;



public class TipoMovimiento {
	
	private int IdTipoMov;
	private String Descripcion;
	
	
	//Constructor
	public TipoMovimiento() {}
	
	public TipoMovimiento(int idTipoMov, String descripcion) {
		super();
		IdTipoMov = idTipoMov;
		Descripcion = descripcion;
	}
	
	
	//Getters
	
	public int getIdTipoMov() {
		return IdTipoMov;
	}

	public String getDescripcion() {
		return Descripcion;
	}
	
	//Setter
	public void setIdTipoMov(int idTipoMov) {
		IdTipoMov = idTipoMov;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	
	
	//Tostring
	
	@Override
	public String toString() {
		return "TipoMovimiento [IdTipoMov=" + IdTipoMov + ", Descripcion=" + Descripcion + "]";
	}
	
	
	

}