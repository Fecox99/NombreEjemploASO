package tp2.actividad3.ejercicio7;

public class Robot {
	
	private String nombre;
	
	public Robot() {
		this.nombre = "";
	}
	
	public Robot(String nom) {
		this.nombre = nom;
	}
	
	public void saludar() {
		if (this.nombre.isEmpty()) {
			System.out.println("Hola. En que puedo ayudarte?");
		} else {
			System.out.println("Hola, mi nombre es " + this.nombre + ". ¿En qué puedo ayudarte?");
		}
	}
	
	public void saludar(Persona persona) {
		if (this.nombre.isEmpty()) {
			System.out.println("Hola " + persona.obtenerNombreCompleto() + ". En que puedo ayudarte?");
		} else {
			System.out.println("Hola " + persona.obtenerNombreCompleto() + ", mi nombre es " + this.nombre + ". En que puedo ayudarte?");
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Robot [nombre=" + this.nombre + "]";
	}
}
