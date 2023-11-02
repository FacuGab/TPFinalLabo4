package DatosImpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import Datos.CuentaDao;
import Entidad.Cuenta;
import Entidad.Cliente;
import Entidad.TipoCuenta;

public class CuentaDaoImpl implements CuentaDao {
    private static final String leerCuentas = "SELECT * FROM cuenta";
   private static final String leerCuenta= "SELECT * FROM cuenta WHERE idCuenta = ?";

    @Override
    public ArrayList<Cuenta> ListarTodas() {
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        PreparedStatement statement;
        ResultSet resultSet;
        Conexion conexion = Conexion.getConexion();
        try {
            statement = conexion.getSQLConexion().prepareStatement(leerCuentas);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                cuentas.add(getCuenta(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cuentas;
    }

    @Override
    public Cuenta ListarUno(int idCuenta) {
        
    	PreparedStatement statement;
        ResultSet resultSet;
        Conexion conexion = Conexion.getConexion();
        Cuenta cuenta = null;

        try {
            statement = conexion.getSQLConexion().prepareStatement(leerCuenta);
            statement.setInt(1, idCuenta);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                cuenta = getCuenta(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cuenta;
    }

    @Override
    public boolean InsertarCuenta(int cbu, int idCliente, LocalDate fechaAlta, int numeroCuenta, float saldo, int tipoCuenta) {
        // Añade lógica para insertar una cuenta en la base de datos
        return false;
    }

    @Override
    public boolean ModificarCuenta(int idCuenta) {
        // Añade lógica para modificar una cuenta en la base de datos
        return false;
    }

    @Override
    public boolean EliminarCuenta(int idCuenta) {
        // Añade lógica para eliminar una cuenta de la base de datos
        return false;
    }

    private Cuenta getCuenta(ResultSet resultSet) throws SQLException {
        int idCuenta = resultSet.getInt("idCuenta");
        int numeroCuenta = resultSet.getInt("numeroCuenta");
        Date fechaAlta = resultSet.getDate("fecha_alta");
        String cbu = resultSet.getString("cbu");
        double saldo = resultSet.getDouble("saldo");
        int idCliente = resultSet.getInt("idCliente");
        int idTipoCuenta = resultSet.getInt("idTipoCuenta");

        ClienteDaoImpl clienteDao = new ClienteDaoImpl();
        Cliente cliente = clienteDao.ListarUno(idCliente);

        TipoCuentaDaoImpl tcDao = new TipoCuentaDaoImpl();
        TipoCuenta tipoCuenta = tcDao.ListarUno(idTipoCuenta);
        
        Cuenta cuenta = new Cuenta(idCuenta, cliente, tipoCuenta, numeroCuenta, fechaAlta, cbu, saldo);

        return cuenta;
    }
}