package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DatosImpl.ClienteDaoImpl;
import DatosImpl.CuentaDaoImpl;
import DatosImpl.TipoCuentaDaoImpl;
import Entidad.Cuenta;


@WebServlet("/ServletCuenta")
public class ServletCuenta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletCuenta() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    boolean agregado = false;
	    String mensaje = "";

	    if(request.getParameter("btnAceptar") != null) {
	        String idClienteParam = request.getParameter("idCliente");
	        if (idClienteParam != null && !idClienteParam.isEmpty()) {
	            try {
	                int idCliente = Integer.parseInt(idClienteParam);
	                ClienteDaoImpl clienteDao = new ClienteDaoImpl();
	                int totalCuentasCliente = clienteDao.ContarCuentasCliente(idCliente);

	                if (totalCuentasCliente < 3) {
	                    String cbu = String.valueOf(generarCbu());
	                    Date fechaAlta = generarFechaAlta();
	                    int numeroCuenta = generarNumeroCuenta();
	                    double saldo = 10000;
	                    int tipoCuenta = Integer.parseInt(request.getParameter("tipoCuenta"));

	                    CuentaDaoImpl ctadao = new CuentaDaoImpl();
	                    agregado = ctadao.InsertarCuenta(cbu, idCliente, fechaAlta, numeroCuenta, saldo, tipoCuenta);
 
	                    request.setAttribute("agregado", agregado);
	                    RequestDispatcher rd = request.getRequestDispatcher("/GestionCuentas.jsp");
	                    rd.forward(request, response);
	                } else {
	                    mensaje = "No se pueden agregar más cuentas. Límite de 3 alcanzado.";
	                    request.setAttribute("mensaje", mensaje);
	                    RequestDispatcher rd = request.getRequestDispatcher("/GestionCuentas.jsp");
	                    rd.forward(request, response);
	                }
	            } catch (NumberFormatException e) {
	                mensaje = "El ID del cliente no es un número válido.";
	                request.setAttribute("mensaje", mensaje);
	                RequestDispatcher rd = request.getRequestDispatcher("/GestionCuentas.jsp");
	                rd.forward(request, response);
	            }
	        } else {
	            mensaje = "El ID del cliente está vacío.";
	            request.setAttribute("mensaje", mensaje);
	            RequestDispatcher rd = request.getRequestDispatcher("/GestionCuentas.jsp");
	            rd.forward(request, response);
	        }
	    }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("btnMostrarCuentas") != null) {
			CuentaDaoImpl cdao = new CuentaDaoImpl();
			ArrayList<Cuenta> cuentas = cdao.ListarTodas();

			request.setAttribute("listaCuentas", cuentas);

			RequestDispatcher rd = request.getRequestDispatcher("/GestionCuentas.jsp");   
			rd.forward(request, response);
		}
		
		if(request.getParameter("btnEliminar")!=null)
		{
			int idCuenta = Integer.parseInt(request.getParameter("idUsuario").toString()) ;
			CuentaDaoImpl ctadao = new CuentaDaoImpl();
			ctadao.EliminarCuenta(idCuenta);
			
			ArrayList<Cuenta> cuentas = ctadao.ListarTodas();
			request.setAttribute("listaCuentas", cuentas);

			RequestDispatcher rd = request.getRequestDispatcher("/GestionCuentas.jsp");   
			rd.forward(request, response);
			
		}
		
		if (request.getParameter("btnConfirmarModificacion") != null) {
	        int idCuentaModificar = Integer.parseInt(request.getParameter("idCuentaModificar"));
	        int idCliente = Integer.parseInt(request.getParameter("idClienteModificar"));
	        int numeroCuenta = Integer.parseInt(request.getParameter("numeroCuentaModificar"));
	        
	        int tipoCuenta = Integer.parseInt(request.getParameter("tipoCuentaMod"));;
	        String cbu = request.getParameter("cbuCuentaModificar").toString();
	        double saldo = Double.parseDouble(request.getParameter("saldoCuentaModificar"));

	        CuentaDaoImpl cuentaDao = new CuentaDaoImpl();
	        boolean modificado = cuentaDao.ModificarCuenta(idCuentaModificar, idCliente, tipoCuenta, numeroCuenta,cbu,saldo );
	        
	        request.setAttribute("modificado", modificado);
            RequestDispatcher rd = request.getRequestDispatcher("/GestionCuentas.jsp");
            rd.forward(request, response);
	    }
	}

	public int generarCbu(){
		Random generador = new Random();
		int cbu = 1000 + generador.nextInt(9000);
		return cbu;
	}
	
	public int generarNumeroCuenta(){
		Random generador = new Random();
		int cbu = 1000 + generador.nextInt(9000);
		return cbu;
	}
	
	public Date generarFechaAlta() {
        return new Date(); 
    }

}
