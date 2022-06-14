package tp2.actividad2.ejercicio4;

public class Contexto {

	public static void main(String[] args) {
		Propietario p = new Propietario("Fulano", "Gomez");
		Vehiculo v = new Vehiculo(Marca.MERCEDES_BENZ, "Gris Plata", "GLC300", 40);
		
		p.setVehiculo(v);
		
		v.encender();
		v.acelerar(40);
		
		for (int cantGiros = 0; cantGiros < 4; cantGiros++) {
			v.avanzar();
			v.frenar(35);
			v.girar('D', 90);
			v.acelerar(35);
		}
		
		v.frenar(40);
		v.apagar();
	}
}
