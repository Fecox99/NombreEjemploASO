package tp3.ejercicio04;

public class Test {

	public static void main(String[] args) {
		Duenio duenio = new Duenio("Juan");
		Perro pi = new Perro("Pichichus");
		Perro su = new Perro("Sultan");
		
		duenio.adoptar(pi);
		duenio.adoptar(su);
		
		duenio.ponerCollarEnPerchero(new Collar("Pichichus"));
		duenio.ponerCollarEnPerchero(new Collar("Sultan"));
		
		System.out.println("Pudo pasear al perro Felipe: " + (duenio.salirDePaseo("Felipe") ? "Si" : "No"));
		System.out.println("Pudo pasear al perro Pichichus: " + (duenio.salirDePaseo(pi) ? "Si" : "No"));
		duenio.regresarPaseo("Pichichus");
		System.out.println("Pudo pasear al perro Sultan: " + (duenio.salirDePaseo(su) ? "Si" : "No"));
		
		System.out.print("Pudo pasear al perro Felipe: ");
		if (duenio.salirDePaseo("Felipe")) {
			System.out.print("Si");
		} else {
			System.out.print("No");
		}		
	}
}
