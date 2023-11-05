package DatosImpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import Datos.CuentaDao;
import Entidad.Cuenta;
import Entidad.Cliente;
import Entidad.TipoCuenta;

public class CuentaDaoImpl implements CuentaDao {
    private static final String leerCuentas = "SELECT * FROM cuentas WHERE estado = 1";
    private static final String leerCuenta= "SELECT * FROM cuentas WHERE idCuenta = ?";
    private static final String insert = "INSERT INTO cuentas (numeroCuenta, fecha_alta, cbu, saldo, idCliente, idTipoCuenta) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String eliminar = "update cuentas set estado = 0 where idCuenta = ?";
    private static final String actualizar = "UPDATE cuentas SET idCliente = ?, idTipoCuenta = ?, numeroCuenta = ?, cbu = ?, saldo = ? WHERE idCuenta = ?";
    
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
    public boolean InsertarCuenta(String cbu, int idCliente, Date fechaAlta, int numeroCuenta, double saldo, int tipoCuenta) {
        boolean insercionExitosa = false;
        PreparedStatement statement;
        Conexion conexion = Conexion.getConexion();

        try {
            statement = conexion.getSQLConexion().prepareStatement(insert);
            statement.setInt(1, numeroCuenta);
            statement.setDate(2, new java.sql.Date(fechaAlta.getTime()));
            statement.setString(3, cbu); 
            statement.setDouble(4, saldo);
            statement.setInt(5, idCliente);
            statement.setInt(6, tipoCuenta);
            
            int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                insercionExitosa = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (insercionExitosa) {
            try {
                conexion.getSQLConexion().commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return insercionExitosa;
    }

    @Override
    public boolean ModificarCuenta(int idCuenta, int idCliente, int tipoCuenta, int numeroCuenta, String cbu, double saldo) {
        boolean modificacionExitosa = false;
        PreparedStatement statement;
        Conexion conexion = Conexion.getConexion();

        try {
        	
        	// cuentas SET idCliente = ?, idTipoCuenta = ?, numeroCuenta = ?, cbu = ?, saldo = ? WHERE idCuenta = ?";
            statement = conexion.getSQLConexion().prepareStatement(actualizar);
            statement.setInt(1, idCliente);
            statement.setInt(2, tipoCuenta);
            statement.setInt(3, numeroCuenta);
            statement.setString(4, cbu);
            statement.setDouble(5, saldo);
            statement.setInt(6, idCuenta);
            
            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                modificacionExitosa = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (modificacionExitosa) {
            try {
                conexion.getSQLConexion().commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modificacionExitosa;
    }


    @Override
    public boolean EliminarCuenta(int idCuenta) {
    	boolean eliminacionExitosa = false;
        PreparedStatement statement;
        Conexion conexion = Conexion.getConexion();

        try {
            statement = conexion.getSQLConexion().prepareStatement(eliminar);
            statement.setInt(1, idCuenta);
            
            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                eliminacionExitosa = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (eliminacionExitosa) {
            try {
                conexion.getSQLConexion().commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return eliminacionExitosa;
    }

    private Cuenta getCuenta(ResultSet resultSet) throws SQLException {
        int idCuenta = resultSet.getInt("idCuenta");
        int numeroCuenta = resultSet.getInt("numeroCuenta");
        Date fechaAlta = resultSet.getDate("fecha_alta");
        String cbu = resultSet.getString("cbu");
        double saldo = resultSet.getDouble("saldo");
        int idCliente = resultSet.getInt("idCliente");
        int idTipoCuenta = resultSet.getInt("idTipoCuenta");
        boolean estado = resultSet.getBoolean("estado");
        
        ClienteDaoImpl clienteDao = new ClienteDaoImpl();
        Cliente cliente = clienteDao.ListarUno(idCliente);

        TipoCuentaDaoImpl tcDao = new TipoCuentaDaoImpl();
        TipoCuenta tipoCuenta = tcDao.ListarUno(idTipoCuenta);
        
        Cuenta cuenta = new Cuenta(idCuenta, cliente, tipoCuenta, numeroCuenta, fechaAlta, cbu, saldo, estado);

        return cuenta;
    }
}