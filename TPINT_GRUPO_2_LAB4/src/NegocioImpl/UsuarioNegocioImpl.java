package NegocioImpl;

import Datos.UsuarioDao;
import DatosImpl.UsuarioDaoImpl;
import Entidad.Usuario;
import Negocio.UsuarioNegocio;

public class UsuarioNegocioImpl  implements UsuarioNegocio{
	
	private UsuarioDao user =  new UsuarioDaoImpl();

	@Override
	public Usuario ObtenerUsuario(String apellido,String nombre, String pass) {
		
		return (Usuario) user.ObtenerUsuario(apellido,nombre ,pass);
	}

	@Override
	public boolean InsertarUsuario(Usuario usuario) {
	
		return user.InsertarUsuario(usuario);
	}

	@Override
	public boolean EditarUsuario(Usuario usuario) {
		return  user.EditarUsuario(usuario);
	}

	@Override
	public boolean EliminarUsuario(Usuario usuario) {
		return user.ElimnarUsuario(usuario);
	}

}
