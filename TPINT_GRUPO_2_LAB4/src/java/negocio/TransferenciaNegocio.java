package negocio;

import java.math.BigDecimal;
import java.util.List;

import entidad.Cuenta;
import entidad.TipoMovimiento;

public interface TransferenciaNegocio {
	
	public Boolean DoTransfer(String CtaOrigen, String CtaDestino, BigDecimal importe, TipoMovimiento TMov, String detalle);
}
