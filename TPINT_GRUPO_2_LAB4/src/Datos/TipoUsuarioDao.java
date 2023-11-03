package Datos;

import java.util.ArrayList;

import Entidad.TipoUsuario;

public interface TipoUsuarioDao {
	
	public ArrayList <TipoUsuario> ListarTodas();
	public TipoUsuario ListarUno(int id);

}
