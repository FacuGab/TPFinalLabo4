package Datos;

import Entidad.Usuario;

public interface UsuarioDao {

		public Usuario ObtenerUsuario ( String Apellido,String Nombre, String Pass );
		public  boolean  InsertarUsuario (Usuario usuario);
		public boolean EditarUsuario (Usuario usuario);
		public boolean ElimnarUsuario (Usuario usuario);
}
