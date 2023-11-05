package DatosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Datos.ClienteDao;
import Entidad.Cliente;
import Entidad.Localidad;

public class ClienteDaoImpl implements ClienteDao {
	private static final String leerUno = "Select * FROM banco.cliente WHERE idCliente = ?";
	private static final String  AllClientsQuery = "SELECT * FROM banco.cliente";
	private static final String CreateClientQuery = "INSERT INTO banco.cliente (dni, nombre, apellido, idLocalidad, direccion, correo, cuit, genero, telefonoCliente, estadoCliente) \" +\r\n" + 
			"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)\"";
	private static final String UpdateClientQuery = "UPDATE banco.cliente "
			+ "SET dni = ?, nombre = ?, apellido = ?, idLocalidad = ?, direccion = ?, correo = ?, cuit = ?, genero = ?, telefonoCliente = ?, estadoCliente = ? WHERE idCliente = ?";
	private static final String DeleteClientQuery = "DELETE FROM banco.cliente WHERE idCliente = ?";
	private static final String ValidateClientQuery = "Select * FROM banco.cliente WHERE dni = ?";
	private static final String contarCuentas = "Select count(*) as cantCuentas from clientes cl inner join cuentas cu on cl.idCliente = cu.idCliente where cl.idCliente = ?";

	@Override
	public List<Cliente> ListarTodos() {
		
		List<Cliente> clientList = null;
		PreparedStatement statement;
		ResultSet resultSet;
		Conexion conexion = Conexion.getConexion();
		
		try {
            statement = conexion.getSQLConexion().prepareStatement(AllClientsQuery);
            resultSet = statement.executeQuery();
            
            clientList = new ArrayList<Cliente>();
            if (resultSet.next()) {
            	clientList.add(getCliente(resultSet));
            }
            return clientList;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
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
            return null;
        }
        return cliente;
    }

	@Override
	public boolean InsertarCliente(Cliente cliente) {
		
		PreparedStatement statement;
		Conexion conexion = Conexion.getConexion();
		
		try {
			
			statement = conexion.getSQLConexion().prepareStatement(CreateClientQuery);
			statement.setInt(1, cliente.getDni());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getApeliido());
            statement.setInt(4, cliente.getLocalidad().getIdLocalidad());
            statement.setString(5, cliente.getDireccion());
            statement.setString(6, cliente.getCorreo());
            statement.setLong(7, (long)cliente.getCuit());
            statement.setString(8, cliente.getSexo());
            statement.setString(9, cliente.getTelefono());
            statement.setString(10, cliente.getEstado());
            if(statement.executeUpdate() > 0)
			{
				return true;
			}
			
		} catch (Exception e) {
			 e.printStackTrace();
			 return false;
		}
		return false;
	}

	@Override
	public boolean EditarCliente(Cliente cliente) {
		PreparedStatement statement;
		Conexion conexion = Conexion.getConexion();
		
		try {
			statement = conexion.getSQLConexion().prepareStatement(UpdateClientQuery);
			statement.setInt(1, cliente.getDni());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getApeliido());
            statement.setInt(4, cliente.getLocalidad().getIdLocalidad());
            statement.setString(5, cliente.getDireccion());
            statement.setString(6, cliente.getCorreo());
            statement.setLong(7, (long)cliente.getCuit());
            statement.setString(8, cliente.getSexo());
            statement.setString(9, cliente.getTelefono());
            statement.setString(10, cliente.getEstado());
            statement.setInt(11, cliente.getIdCliente());
            
            int res = statement.executeUpdate();
            if(res > 0) {
            	return true;
            }
            
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	@Override
	public boolean EliminarCliene(Cliente cliente) {
		PreparedStatement statement;
		Conexion conexion = Conexion.getConexion();
		try {
			statement = conexion.getSQLConexion().prepareStatement(DeleteClientQuery);
            statement.setInt(1, cliente.getIdCliente());
            int res = statement.executeUpdate();
            if(res > 0) {
            	return true;
            }
            
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	@Override
	public boolean ValidarCliente(int dni) {
		PreparedStatement statement;
		Conexion conexion = Conexion.getConexion();
		
		
		try {
			statement = conexion.getSQLConexion().prepareStatement(ValidateClientQuery);
			statement.setInt(1, dni);
			ResultSet resultSet;
			resultSet = statement.executeQuery();
			Cliente cliente = null;
			
            if (resultSet.next()) {
               cliente = getCliente(resultSet);
            }
            if(cliente != null) {
            	return true;
            }
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
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
