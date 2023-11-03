package Datos;

import Entidad.Usuario;

public interface UsuarioDao {

		public Usuario ObtenerUsuario ( int id );
		public  boolean  InsertarUsuario (Usuario usuario);
		public boolean EditarUsuario (Usuario usuario);
		public boolean ElimnarUsuario (Usuario usuario);
}
