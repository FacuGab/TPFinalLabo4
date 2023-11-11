package java.negocio;

import java.math.BigDecimal;
import java.util.List;

import java.entidad.Cuenta;
import java.entidad.TipoMovimiento;

public interface TransferenciaNegocio {
	
	public Boolean DoTransfer(String CtaOrigen, String CtaDestino, BigDecimal importe, TipoMovimiento TMov, String detalle);
}
