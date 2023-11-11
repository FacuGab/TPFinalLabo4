package java.negocioImpl;

import java.math.BigDecimal;

import java.daoImpl.CuentaDaoImpl;
import java.daoImpl.CuotasDaoImpl;
import java.entidad.Cuenta;
import java.negocio.CuotasNegocio;

public class CuotasNegocioImpl implements CuotasNegocio{
	CuotasDaoImpl cuotasDao = new CuotasDaoImpl();
	
	public boolean pagarCuota(int NroCuenta,int idCuota, BigDecimal importe) {
		CuentaDaoImpl cuenta = new CuentaDaoImpl();
		Cuenta cuentaE;
		cuentaE = cuenta.readOne(NroCuenta);
		if(cuotasDao.pagarCuota(NroCuenta,idCuota, cuentaE.getSaldo().subtract(importe), "Pago cuota - ID" + idCuota))
			return true;
		else
			return false;
	}
}
