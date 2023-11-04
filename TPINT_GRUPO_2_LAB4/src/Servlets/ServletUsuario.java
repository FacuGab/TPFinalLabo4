package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entidad.Usuario;
import Negocio.UsuarioNegocio;
import NegocioImpl.UsuarioNegocioImpl;

/**
 * Servlet implementation class ServletUsuario
 */
@WebServlet("/ServletUsuario")

public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UsuarioNegocio Neg= new  UsuarioNegocioImpl();
	
	
	
    public ServletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			if(request.getParameter("Param") != null) {
			
			Usuario user = (Usuario) request.getSession().getAttribute("usuario");

			if(user.getTipo().getIdTipoUsuario() == 1) {

		    	RequestDispatcher dispatcher = request.getRequestDispatcher("/menuAdmin.jsp");
				dispatcher.forward(request, response);
			}
			else {
				
		    	RequestDispatcher dispatcher = request.getRequestDispatcher("/menuCliente.jsp");
				dispatcher.forward(request, response);
			}
		
	}

	}
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			if(request.getParameter("btnIngresar")!=null) {
			
			String pass = request.getParameter("TxtContraseña");
			String apellido = request.getParameter("TxtApellido");
			String nombre = request.getParameter("TxtNombre");
			
			
			
			Usuario user;
			
			user = (Usuario) Neg.ObtenerUsuario(apellido,nombre, pass);
			
			if(user != null) 
			{	
				if (user.getEstado() == 1) 
				{
					if(user.getTipo().getIdTipoUsuario() == 1) 
					{
						request.getSession().setAttribute("usuario", user);
				    	RequestDispatcher dispatcher = request.getRequestDispatcher("/menuAdmin.jsp");
						dispatcher.forward(request, response);
					}
					else 
					{
						
						
				    	RequestDispatcher dispatcher = request.getRequestDispatcher("/menuCliente.jsp");
						dispatcher.forward(request, response);
					}
				}
				else if (user.getEstado() == 0) {
					
						request.setAttribute("errorDadoDeBaja", true);

				    	RequestDispatcher dispatcher = request.getRequestDispatcher("/Login.jsp");
						dispatcher.forward(request, response);	
						return;
				}			
			} 
			else
			{
				request.setAttribute("errorCredenciales", true);
				
		    	RequestDispatcher dispatcher = request.getRequestDispatcher("/Login.jsp");
				dispatcher.forward(request, response);
				return;
			}
		}
		
	}

}
