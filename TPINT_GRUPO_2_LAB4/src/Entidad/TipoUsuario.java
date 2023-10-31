package Entidad;

public class TipoUsuario {
	
	private  int IdTipoUsuario;
	private String Descripcion;
	
	
	//Constructorews
	public TipoUsuario() {
		
	}
	
	public TipoUsuario(int idtipo , String descripcion) {
		
		this.IdTipoUsuario=idtipo;
		this.Descripcion=descripcion;
	}


	//Getters
	public int getIdTipoUsuario() {
		return IdTipoUsuario;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	
	//Setter
	
	public void setIdTipoUsuario(int idTipoUsuario) {
		IdTipoUsuario = idTipoUsuario;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	//Metodo Tostring
	@Override
	public String toString() {
		return "TipoUsuario [IdTipoUsuario=" + IdTipoUsuario + ", Descripcion=" + Descripcion + "]";
	}
	
	/// prueba marge
	
}
