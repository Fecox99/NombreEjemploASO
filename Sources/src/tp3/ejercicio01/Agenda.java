package tp3.ejercicio01;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Persona> personas;
	
	public Agenda() {
		this.personas = new ArrayList<Persona>();
	}
	
	private Persona buscar(String dniBuscar) {
		Persona personaEncontrada = null;
		int i = 0;
		
		while(i < this.personas.size() && personaEncontrada == null) {
			if (this.personas.get(i).getDni().equals(dniBuscar)) {
				personaEncontrada = this.personas.get(i);
			} else {
				i++;
			}
		}
		return personaEncontrada;
	}
	
	public boolean modificarDomicilio(String aDni, Domicilio domicilio) {
		boolean pude = false;
		Persona persona = this.buscar(aDni);
		
		if (persona != null) {
			persona.setDomicilio(domicilio);
			pude = true;
		}
		
		return pude;
	}
	
	public boolean quitar(String dniPersona) {
		boolean pudo = false;
		Persona personaBorrar = null;
		
		personaBorrar = this.buscar(dniPersona);
		
		if (personaBorrar != null) {
			this.personas.remove(personaBorrar);
			pudo = true;
		}
		
		return pudo;
	}	
	
	public boolean agregarPersona(String nombre, String apellido, String dni, Domicilio domicilio) {
		boolean pude = false;
		
		Persona persona = this.buscar(dni);
		
		if (persona == null) {
			this.personas.add(new Persona(nombre, apellido, dni, domicilio));
			pude = true;
		}
		
		return pude;
	}
	
	public void listarPersonas() {
		System.out.println("Listado de personas en la Agenda");
		for(int i = 0; i < personas.size(); i++) {
			System.out.println(this.personas.get(i).toString());
		}
	}
	
	public Persona devolverUltimo() {
		Persona personaEncontrada = null;
		
		if (this.personas.size() > 0) {
			personaEncontrada = this.personas.get(this.personas.size() - 1);
		}
		
		return personaEncontrada;
	}
	
	public void eliminarTodosElementosAMano() {
		if (this.personas.size() > 0) {
			for(Persona persona : this.personas) {
				System.out.println("Eliminando a " + persona.getNombre());
				this.personas.remove(persona);
			}			
		}
	}

	@Override
	public String toString() {
		return "Agenda [personas=" + this.personas + "]";
	}
}
