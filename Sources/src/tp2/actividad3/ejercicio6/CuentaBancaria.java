package tp2.actividad3.ejercicio6;

public class CuentaBancaria {
	private String cbu;
	private TipoCuenta tipo;
	private double saldo;
	private Persona titular;
	private Fecha fechaApertura;
	
	public CuentaBancaria(TipoCuenta tipo, Persona titular) {
		this.setTipo(tipo);
		this.setTitular(titular);
		this.setSaldo(0);
		this.setFechaApertura(obtenerFechaHoy());
		this.setCbu(generarCBU());
	}
	
	private static String generarCBU() {
		return "Nuevo-CBU";
	}
	
	private static Fecha obtenerFechaHoy() {
		return new Fecha(06, 10, 2021);
	}
	
	public void depositar(double monto) {
		if (monto > 0) {
			this.saldo += monto;
		}
	}
	
	public boolean extraer(double monto) {
		boolean pude = false;
		if (monto > 0 && monto <= this.saldo) {
			this.saldo -= monto;
			pude = true;
		}
		return pude;
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public TipoCuenta getTipo() {
		return tipo;
	}

	public void setTipo(TipoCuenta tipo) {
		this.tipo = tipo;
	}

	public double verSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public Fecha getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Fecha fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [cbu=" + cbu + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular
				+ ", fechaApertura=" + fechaApertura + "]";
	}
}
