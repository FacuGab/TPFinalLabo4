package DatosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Datos.LocalidadDao;
import Entidad.Localidad;
import Entidad.Provincia;

public class LocalidadDaoImpl implements LocalidadDao{
	private static final String leerUno = "Select * FROM localidades WHERE idLocalidad = ?";
	private static final String leerTodas = "SELECT * FROM localidades";

	@Override
    public ArrayList<Localidad> ListarTodas() {
        ArrayList<Localidad> localidades = new ArrayList<>();

        PreparedStatement statement;
        ResultSet resultSet;
        Conexion conexion = Conexion.getConexion();
        try {
            statement = conexion.getSQLConexion().prepareStatement(leerTodas);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                localidades.add(getLocalidad(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return localidades;
    }

	@Override
    public Localidad ListarUno(int id) {
        Localidad localidad = null;

        PreparedStatement statement;
        ResultSet resultSet;
        Conexion conexion = Conexion.getConexion();
        try {
            statement = conexion.getSQLConexion().prepareStatement(leerUno);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                localidad = getLocalidad(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return localidad;
    }
	
	private Localidad getLocalidad(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("idLocalidad");
        String nombre = resultSet.getString("nombre");
        int idProvincia = resultSet.getInt("idProvincia");

        Provincia provincia = obtenerProvinciaPorId(idProvincia);

        return new Localidad(id, nombre, provincia);
    }

	private Provincia obtenerProvinciaPorId(int idProvincia) {
   
        ProvinciaDaoImpl provinciaDao = new ProvinciaDaoImpl();
        return provinciaDao.ListarUno(idProvincia);
    }
}
