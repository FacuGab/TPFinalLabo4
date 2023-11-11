package java.dao;

import java.math.BigDecimal;

import java.entidad.Cuenta;
import java.entidad.TipoMovimiento;

public interface TransferenciaDao {
	public Boolean DoTransfer(Cuenta CtaOrigen, Cuenta CtaDestino, BigDecimal importe, BigDecimal saldoOrigen, BigDecimal SaldoDestino, TipoMovimiento TMov, String detalle);
}
