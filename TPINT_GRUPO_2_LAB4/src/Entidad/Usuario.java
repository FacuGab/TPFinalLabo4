package Entidad;

public class Usuario {
	
	private int IdUsuario;
	private String Contrase�a;
	private String NombreUser;
	private String ApellidoUser;
	private TipoUsuario Tipo;
	private int Estado;
	
	
	//Constructores
	public Usuario () {
		
	}
	
	public Usuario (int idusuario, String pass, String nombre, String apellido, TipoUsuario tipo ) {
		
	}
	
	
	
	//Getter
	public int getIdUsuario() {
		return IdUsuario;
	}
	
	public String getContrase�a() {
		return Contrase�a;
	}
	
	public String getNombreUser() {
		return NombreUser;
	}
	
	public String getApellidoUser() {
		return ApellidoUser;
	}
	
	public int getEstado() {
		return Estado;
	}
	
	public TipoUsuario getTipo() {
		return Tipo;
	}
	
	//Setter
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public void setContrase�a(String contrase�a) {
		Contrase�a = contrase�a;
	}

	public void setNombreUser(String nombreUser) {
		NombreUser = nombreUser;
	}

	public void setApellidoUser(String apellidoUser) {
		ApellidoUser = apellidoUser;
	}

	public void setTipo(TipoUsuario tipo) {
		Tipo = tipo;
	}

	public void setEstado(int estado) {
		Estado = estado;
	}
	
	
	//Tostring

	@Override
	public String toString() {
		return "Usuario [NombreUser=" + NombreUser + ", ApellidoUser=" + ApellidoUser + "]";
	}

	
	

}
