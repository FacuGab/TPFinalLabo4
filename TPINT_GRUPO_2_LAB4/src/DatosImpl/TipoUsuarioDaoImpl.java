package DatosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Datos.TipoUsuarioDao;
import Entidad.TipoCuenta;
import Entidad.TipoUsuario;

public class TipoUsuarioDaoImpl implements TipoUsuarioDao {
	
	private static final String LeerTipoUsuario = "Select * FROM tipo_usuario WHERE idtipousuario = ?";
private static final String LeerTiposUsuario = "SELECT * FROM tipo_usuario";

	@Override
	public ArrayList<TipoUsuario> ListarTodas() {
		 ArrayList<TipoUsuario> tipousuario = new ArrayList<>();
	        PreparedStatement statement;
	        ResultSet resultSet;
	        Conexion conexion = Conexion.getConexion();
	        try {
	            statement = conexion.getSQLConexion().prepareStatement(LeerTiposUsuario);
	            resultSet = statement.executeQuery();
	            while (resultSet.next()) {
	            	tipousuario.add(getTipoUsuario(resultSet));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return tipousuario;
	}

	@Override
	public TipoUsuario ListarUno(int id) {
		   TipoUsuario tipo = null;
	        PreparedStatement statement;
	        ResultSet resultSet;
	        Conexion conexion = Conexion.getConexion();
	        try {
	            statement = conexion.getSQLConexion().prepareStatement(LeerTipoUsuario);
	            statement.setInt(1, id);
	            resultSet = statement.executeQuery();
	            if (resultSet.next()) {
	                tipo = getTipoUsuario(resultSet);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return tipo;
	}
	
	
    private TipoUsuario getTipoUsuario(ResultSet resultSet) throws SQLException {
        int IdTipo = resultSet.getInt("idtipousuario");
        String descripcion = resultSet.getString("descripcion"); 

        return new TipoUsuario(IdTipo, descripcion); 
    }
	

}
