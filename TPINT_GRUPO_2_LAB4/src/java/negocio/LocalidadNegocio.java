package java.negocio;

import java.util.List;

import java.entidad.Localidad;

public interface LocalidadNegocio {
	
	public boolean insert(Localidad localidad_a_agregar);

	public boolean logicalDeletion(Localidad localidad_a_eliminar);  // Baja lógica

	public boolean update(Localidad localidad_a_modificar);

	public List<Localidad> readAll();
	
	public Localidad readOne(int codLocalidad);
	
	public int readLast();

}
