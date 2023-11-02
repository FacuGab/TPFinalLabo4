package Datos;

import Entidad.Usuario;

public interface UsuarioDao {

		public Usuario ObtenerUsuario (String cont , int id );
		public  boolean  InsertarUsuario (String cont, int id);
		public boolean EditarUsuario (String cont ,int id);
		public boolean ElimnarUsuario (int id);
}
