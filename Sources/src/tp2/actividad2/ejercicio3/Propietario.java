package tp2.actividad2.ejercicio3;

public class Propietario {
	private String nombre;
	private String apellido;
	private boolean conduce;
	
	private Vehiculo vehiculo;
	
	public Propietario() {
		this.conduce = false;
		this.vehiculo = new Vehiculo();
	}
	
	public Propietario(String nom, String ape, boolean c, Vehiculo v) {
		this.nombre = nom;
		this.apellido = ape;
		this.conduce = c;
		this.vehiculo = v;
	}

	@Override
	public String toString() {
		return "Propietario [nombre=" + this.nombre + ", apellido=" + this.apellido + ", conduce=" + this.conduce + ", vehiculo="
				+ this.vehiculo + "]";
	}
}
