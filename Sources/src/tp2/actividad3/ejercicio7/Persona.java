package tp2.actividad3.ejercicio7;

public class Persona {
	
	private String nombre;
	private String apellido;
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String obtenerNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre + ", apellido=" + this.apellido + "]";
	}
}
