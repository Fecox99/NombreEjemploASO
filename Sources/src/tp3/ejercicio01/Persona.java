package tp3.ejercicio01;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private Domicilio domicilio;
	
	
	public Persona(String nombre, String apellido, String dni, Domicilio domicilio) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
		this.setDomicilio(domicilio);
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public String obtenerNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", domicilio=" + domicilio + "]";
	}
}
