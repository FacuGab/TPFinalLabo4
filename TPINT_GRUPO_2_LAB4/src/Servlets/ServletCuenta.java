package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DatosImpl.CuentaDaoImpl;
import Entidad.Cuenta;


@WebServlet("/ServletCuenta")
public class ServletCuenta extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ServletCuenta() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    if (request.getParameter("btnMostrarCuentas") != null) {
	        CuentaDaoImpl cdao = new CuentaDaoImpl();
	        ArrayList<Cuenta> cuentas = cdao.ListarTodas();
	        
	        request.setAttribute("listaCuentas", cuentas);
	        
	        RequestDispatcher rd = request.getRequestDispatcher("/GestionCuentas.jsp");   
	        rd.forward(request, response);
	    }
	}

}
