package Entidad;

public class Localidad {
	
	private int IdLocalidad;
	private String Descripcion;
	private Provincia Provincia;
	
	
	public Localidad (){}
	
	public Localidad (int id,String descipcion, Provincia prov){
		this.IdLocalidad=id;
		this.Descripcion= descipcion;
		this.Provincia=prov;
	}

	//Getter
	public int getIdLocalidad() {
		return IdLocalidad;
	}
	
	public String getDescripcion() {
		return Descripcion;
	}
	
	public Provincia getProvincia() {
		return Provincia;
	}
	
	
	//Setters
	public void setIdLocalidad(int idLocalidad) {
		IdLocalidad = idLocalidad;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public void setProvincia(Provincia provincia) {
		Provincia = provincia;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "Localidad [IdLocalidad=" + IdLocalidad + ", Descripcion=" + Descripcion + ", Provincia=" + Provincia
				+ "]";
	}
}
