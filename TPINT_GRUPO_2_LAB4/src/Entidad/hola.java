package Entidad;

import java.util.ArrayList;

import DatosImpl.*; 

public class hola {

	public static void main(String[] args) {
		/*ProvinciaDaoImpl a = new ProvinciaDaoImpl();
		Provincia prov = a.ListarUno(1);
		System.out.println(prov);
		LocalidadDaoImpl b = new LocalidadDaoImpl();
		Localidad loc = b.ListarUno(1);
		System.out.println(loc);
		ClienteDaoImpl c = new ClienteDaoImpl();
		Cliente cli = c.ListarUno(1);
		System.out.println(cli);
		TipoCuentaDaoImpl d = new TipoCuentaDaoImpl();
		int a = d.numeroTipo("Cuenta corriente");
		System.out.println(a);*/
		CuentaDaoImpl c = new CuentaDaoImpl();
		boolean a = c.ModificarCuenta(1, 1, 1, 1, "1", 1);
		System.out.println(a);

}
}