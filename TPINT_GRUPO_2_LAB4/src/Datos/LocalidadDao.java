package Datos;

import java.util.ArrayList;

import Entidad.Localidad;

public interface LocalidadDao {
	
	public ArrayList <Localidad> ListarTodas();
	public Localidad ListarUno(int id);
}
