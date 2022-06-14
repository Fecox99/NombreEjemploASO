package tp3.ejercicio01;

public class Test {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		agenda.agregarPersona("Lucas", "Guegnolle", "11111111", new Domicilio("Libertador", 655, "Vicente Lopez"));
		agenda.agregarPersona("Pepe", "Argento", "22222222", new Domicilio("Laprida", 1655, "Florida"));
		agenda.agregarPersona("Juan", "Medina", "33333333", new Domicilio("Ugarte", 6555, "Munro"));
		
		agenda.listarPersonas();
		
		System.out.println("Eliminando al DNI 5555555: " + agenda.quitar("5555555"));
		System.out.println("Eliminando al DNI 22222222: " + agenda.quitar("22222222"));
		
		System.out.println("Modificando domicilio al DNI 5555555: " + agenda.modificarDomicilio("5555555", new Domicilio("Cabildo", 1655, "CABA")));
		System.out.println("Modificando domicilio al DNI 33333333: " + agenda.modificarDomicilio("33333333", new Domicilio("Cabildo", 1655, "CABA")));
		
		agenda.listarPersonas();
	}

}
