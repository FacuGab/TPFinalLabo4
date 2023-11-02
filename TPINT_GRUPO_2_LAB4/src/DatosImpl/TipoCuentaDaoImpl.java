package DatosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Datos.TipoCuentaDao;
import Entidad.TipoCuenta;

public class TipoCuentaDaoImpl implements TipoCuentaDao {
	private static final String leerTipoCuenta = "Select * FROM tipo_cuenta WHERE idTipoCuenta = ?";
	private static final String leerTiposCuenta = "SELECT * FROM tipo_cuenta";
	
	@Override
    public ArrayList<TipoCuenta> ListarTodas() {
        ArrayList<TipoCuenta> tiposCuenta = new ArrayList<>();
        PreparedStatement statement;
        ResultSet resultSet;
        Conexion conexion = Conexion.getConexion();
        try {
            statement = conexion.getSQLConexion().prepareStatement(leerTiposCuenta);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                tiposCuenta.add(getTipoCuenta(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tiposCuenta;
    }

    @Override
    public TipoCuenta ListarUno(int id) {
        TipoCuenta tipoCuenta = null;
        PreparedStatement statement;
        ResultSet resultSet;
        Conexion conexion = Conexion.getConexion();
        try {
            statement = conexion.getSQLConexion().prepareStatement(leerTipoCuenta);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                tipoCuenta = getTipoCuenta(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tipoCuenta;
    }

    private TipoCuenta getTipoCuenta(ResultSet resultSet) throws SQLException {
        int idTipoCuenta = resultSet.getInt("idTipoCuenta");
        String descripcion = resultSet.getString("descripcion"); 

        return new TipoCuenta(idTipoCuenta, descripcion); 
    }
}
