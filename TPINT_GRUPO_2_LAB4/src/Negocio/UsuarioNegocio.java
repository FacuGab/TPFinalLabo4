package Negocio;

import Entidad.Usuario;

public interface UsuarioNegocio {
	public Usuario ObtenerUsuario(String apellido,String nombre, String pass);
	public boolean InsertarUsuario(Usuario usuario);
	public boolean EditarUsuario(Usuario usuario);
	public boolean EliminarUsuario(Usuario usuario);
}
