package tp2.actividad3.ejercicio7;

public class Contexto {

	public static void main(String[] args) {
		Persona p = new Persona("Ernesto", "Tenembaum");
		Robot r = new Robot();
		
		r.saludar(p);
		r.saludar();
		
		Robot roboto = new Robot("C3PO");
		roboto.saludar();
		roboto.saludar(p);
		
		Persona pe = new Persona("Juan", "Medina");
		roboto.saludar(pe);
	}
}
