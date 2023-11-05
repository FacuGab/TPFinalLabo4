package Datos;

import java.util.List;

import Entidad.Cliente;

public interface ClienteDao {
	 public List <Cliente> ListarTodos();
	 public Cliente  ListarUno(int dni) ;
	 public int ContarCuentasCliente(int idCliente);
	 public boolean  InsertarCliente (Cliente cliente);
	 public boolean EditarCliente (Cliente cliente);
	 public boolean EliminarCliene (Cliente cliente) ;
     public boolean ValidarCliente (int dni) ;
}
