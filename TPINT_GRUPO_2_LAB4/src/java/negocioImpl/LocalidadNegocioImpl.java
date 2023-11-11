package java.negocioImpl;

import java.util.List;

import java.dao.LocalidadDao;
import java.daoImpl.LocalidadDaoImpl;
import java.entidad.Localidad;
import java.negocio.LocalidadNegocio;

public class LocalidadNegocioImpl implements LocalidadNegocio {

	LocalidadDao lDao = new LocalidadDaoImpl();

	public boolean insert(Localidad localidad) {

		boolean estado = false;
		estado = lDao.insert(localidad);
		
		return estado;
	}
	
	public boolean update(Localidad localidad) {

		boolean estado = false;
		estado = lDao.update(localidad);
		
		return estado;
	}

	public boolean logicalDeletion(Localidad localidad_a_eliminar) {
		boolean estado = false;
		try {
			if (localidad_a_eliminar.getCodLocalidad() > 0) {
				estado = lDao.logicalDeletion(localidad_a_eliminar);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return estado;
	}


	public List<Localidad> readAll() {

		List<Localidad> lLocalidades;
		lLocalidades = lDao.readAll();
		return lLocalidades;
	}


	public int readLast() {
		System.out.print(lDao.readLast());
		return lDao.readLast();
	}

	public Localidad readOne(int codLocalidad) {
		
		Localidad localidad = new Localidad();
		localidad = lDao.readOne(codLocalidad);
		
		return localidad;
	}


}