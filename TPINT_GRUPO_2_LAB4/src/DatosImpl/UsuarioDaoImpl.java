package DatosImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Datos.UsuarioDao;
import Entidad.Usuario;
import daoImpl.Conexion;



public  class UsuarioDaoImpl implements UsuarioDao {
	
	private static final String insert= "INSERT INTO  USUARIO  (NOMBRE,APELLIDO,CLAVE,IDTIPOUSUARIO,ESTADO) VALUE(?,?,?,?,?)";
	private static final String Update= "UPDATE SET ESTADO=0  FROM USUARIO WHERE IDUSUARIO = ?";
	private static final String Update2	= "UPDATE SET NOMBRE=NOMBRE,APELLIDO=APELLIDO,CLAVE=CLAVE,IDTIPOUSUARIO=IDTIPOUSUARIO  FROM USUARIO WHERE IDUSUARIO = ?";
	

	
	// insertar usuario
	@Override
	public boolean InsertarUsuario (Usuario usuario) {
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean InsertExitoso = false;
		try
		{
			statement = conexion.prepareStatement(insert);
			statement.setString(1,  usuario.getNombreUser() );
			statement.setString(2, usuario.getApellidoUser());
			statement.setString(3,usuario.getContraseña());
			statement.setInt(4, usuario.getTipo().getIdTipoUsuario());
			statement.setInt (5, usuario.getEstado());
			
			if(statement.executeUpdate() > 0)
			{
				conexion.commit();
				InsertExitoso = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			try {
				conexion.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		return InsertExitoso;
	}

	
	//update del usuario
	@Override
	public boolean EditarUsuario(Usuario usuario) {
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean UpdatetExitoso = false;
		try
		{
			statement = conexion.prepareStatement(Update2);
			statement.setString(1,  usuario.getNombreUser() );
			statement.setString(2, usuario.getApellidoUser());
			statement.setString(3,usuario.getContraseña());
			statement.setInt(4, usuario.getTipo().getIdTipoUsuario());
			
			if(statement.executeUpdate() > 0)
			{
				conexion.commit();
				UpdatetExitoso = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			try {
				conexion.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		return UpdatetExitoso;
	}

	
	//baja logica
	@Override
	public boolean ElimnarUsuario (Usuario usuario) {
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean isdeleteExitoso = false;
		try 
		{
			statement = conexion.prepareStatement(Update);
			statement.setInt(1, usuario.getIdUsuario());
			if(statement.executeUpdate() > 0)
			{
				conexion.commit();
				isdeleteExitoso = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return isdeleteExitoso;
	}

	@Override
	public Usuario ObtenerUsuario(String cont, String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
	
	


		
}
