package tp2.actividad2.ejercicio3;

public class Contexto {

	public static void main(String[] args) {
		Propietario prop = new Propietario();
		System.out.println(prop);
		
		Propietario p = new Propietario("Fulano", "Gomez", true, new Vehiculo());
		System.out.println(p);
		
		Vehiculo v = new Vehiculo(Marca.MERCEDES_BENZ, "Gris Plata", "GLC300", 240);
		Propietario pr = new Propietario("Julano", "Perez", true, v);
		System.out.println(pr);
	}
}
