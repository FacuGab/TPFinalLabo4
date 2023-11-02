package Entidad;

import java.util.ArrayList;

import DatosImpl.*; 

public class hola {

	public static void main(String[] args) {
		ProvinciaDaoImpl a = new ProvinciaDaoImpl();
		Provincia prov = a.ListarUno(1);
		System.out.println(prov);
		LocalidadDaoImpl b = new LocalidadDaoImpl();
		Localidad loc = b.ListarUno(1);
		System.out.println(loc);
		ClienteDaoImpl c = new ClienteDaoImpl();
		Cliente cli = c.ListarUno(1);
		System.out.println(cli);
		TipoCuentaDaoImpl d = new TipoCuentaDaoImpl();
		TipoCuenta tc = d.ListarUno(1);
		System.out.println(tc);
		
		CuentaDaoImpl cdao = new CuentaDaoImpl();
		ArrayList<Cuenta> cuentas = cdao.ListarTodas();
		
		for (Cuenta cuenta : cuentas) {
			System.out.println(cuenta);
		}
		

		Cuenta cuenta = cdao.ListarUno(1);
		

		System.out.println(cuenta);
		
	}

}
