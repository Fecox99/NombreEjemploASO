package clase_07;

public class Persona {
	
	private String nombre;
	private String apellido;
	
	public Persona() {}
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void ponerApellido(String valor) {
		this.apellido = valor;
	}
	
	public String obtenerNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre + ", apellido=" + this.apellido + "]";
	}
}
