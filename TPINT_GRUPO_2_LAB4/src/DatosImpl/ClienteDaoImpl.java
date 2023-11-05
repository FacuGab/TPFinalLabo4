package DatosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Datos.ClienteDao;
import Entidad.Cliente;
import Entidad.Localidad;
public class ClienteDaoImpl implements ClienteDao {
	private static final String leerUno = "Select * FROM clientes WHERE idCliente = ?";
	private static final String contarCuentas = "Select count(*) as cantCuentas FROM cuentas as cu inner join clientes as cl on cu.idCliente = cl.idCliente WHERE cu.idCliente = ?";

	@Override
	public List<Cliente> ListarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public Cliente ListarUno(int idCliente) {
        Cliente cliente = null;
        
        PreparedStatement statement;
        ResultSet resultSet;
        Conexion conexion = Conexion.getConexion();
        try {
            statement = conexion.getSQLConexion().prepareStatement(leerUno);
            statement.setInt(1, idCliente);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                cliente = getCliente(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cliente;
    }

    


	@Override
	public boolean InsertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean EditarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean EliminarCliene(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ValidarCliente(int dni) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int ContarCuentasCliente(int idCliente) {
	    int cantidadCuentas = 0;
	    PreparedStatement statement;
	    ResultSet resultSet;
	    Conexion conexion = Conexion.getConexion();
	    try {
	        statement = conexion.getSQLConexion().prepareStatement(contarCuentas);
	        statement.setInt(1, idCliente);
	        resultSet = statement.executeQuery();

	        if (resultSet.next()) {
	            cantidadCuentas = resultSet.getInt("cantCuentas");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return cantidadCuentas;
	}

	private Cliente getCliente(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("idCliente");
        int dni = resultSet.getInt("dni");
        String nombre = resultSet.getString("nombre");
        String apellido = resultSet.getString("apellido");
        String direccion = resultSet.getString("direccion");
        String correo = resultSet.getString("correo");
        double cuit = resultSet.getDouble("cuit");
        String genero = resultSet.getString("genero");
        String telefonoCliente = resultSet.getString("telefonoCliente");
        String estadoCliente = resultSet.getString("estadoCliente");
        
        int idLocalidad = resultSet.getInt("idLocalidad");
        LocalidadDaoImpl localidadDao = new LocalidadDaoImpl();
        Localidad localidad = localidadDao.ListarUno(idLocalidad);

        Cliente cliente = new Cliente();
        cliente.setIdCliente(id);
        cliente.setDni(dni);
        cliente.setNombre(nombre);
        cliente.setApeliido(apellido);
        cliente.setLocalidad(localidad);
        cliente.setDireccion(direccion);
        cliente.setCorreo(correo);
        cliente.setCuit(cuit);
        cliente.setSexo(genero);
        cliente.setTelefono(telefonoCliente);
        cliente.setEstado(estadoCliente);
        return cliente;
    }
}
