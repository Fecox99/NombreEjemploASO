package tp2.actividad3.ejercicio6;

public class Test {

	public static void main(String[] args) {
		Domicilio domicilio = new Domicilio("Yatay", 240, "Almagro");
		
		Persona p1 = new Persona("Fulano", "Gomez", "12345678", new Fecha(05, 01, 1969), domicilio);
		CuentaBancaria c1 = new CuentaBancaria(TipoCuenta.CAJA_DE_AHORRO, p1);
		
		c1.depositar(150);
		c1.extraer(33);
		
		System.out.println(c1);
		
		Persona p2 = new Persona("Mengana", "Torres", "90123456", new Fecha(25, 11, 1972), domicilio);
		CuentaBancaria c2 = new CuentaBancaria(TipoCuenta.CUENTA_CORRIENTE, p2);
		
		c2.depositar(355);
		c2.extraer(125);
		c2.extraer(1500);
		
		System.out.println(c2);
		
		System.out.println(p1.obtenerNombreCompleto());
		System.out.println(p2.obtenerNombreCompleto());
	}

}
