package Datos;

import java.util.ArrayList;
import Entidad.Provincia;

public interface ProvinciasDao {
	
	public ArrayList <Provincia> ListarTodas();
	public Provincia ListarUno(int id);
}
