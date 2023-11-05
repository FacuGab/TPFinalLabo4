package DatosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Datos.ProvinciasDao;
import Entidad.Provincia;

public class ProvinciaDaoImpl implements ProvinciasDao{
	private static final String leerProvincia = "Select * FROM provincias WHERE idProvincia = ?";
	private static final String leerProvincias = "SELECT * FROM provincias";
	@Override
	public ArrayList<Provincia> ListarTodas() {
		ArrayList<Provincia> provincias = new ArrayList<Provincia>();
		
		PreparedStatement statement;
		ResultSet resultSet;
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(leerProvincias);
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				provincias.add(getProvincia(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return provincias;
		}

	@Override
	public Provincia ListarUno(int id) {
	    Provincia provincia = null;
	    PreparedStatement statement;
	    ResultSet resultSet;
	    Conexion conexion = Conexion.getConexion();
	    try {
	        statement = conexion.getSQLConexion().prepareStatement(leerProvincia); 
	        statement.setInt(1, id);
	        resultSet = statement.executeQuery();

	        if (resultSet.next()) {
	            provincia = getProvincia(resultSet);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return provincia;
	}

	private Provincia getProvincia(ResultSet resultSet) throws SQLException
	{
		int id = resultSet.getInt("idProvincia");
		String nombre = resultSet.getString("nombreProvincia");
		return new Provincia(id, nombre);
	}
}
