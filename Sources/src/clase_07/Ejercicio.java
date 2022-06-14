package clase_07;

import java.util.Scanner;

public class Ejercicio {

	static Scanner input = new Scanner(System.in);
	// Definicion de constantes
	static final int PISO_CALLE = 1;
	static final int LIMITE_CALLES_FRENTE = 5;
	static final int LIMITE_CALLES_MEDIO = 8;
	static final int LIMITE_CALLES_FONDO = 9;
	static final int TOPE_CASAS_CALLE_FRENTE = 8;
	static final int TOPE_CASAS_CALLE_MEDIO = 6;
	static final int TOPE_CASAS_CALLE_FONDO = 2;
	static final String SI = "S";
	static final String NO = "N";
	
	public static int ingresarEnteroConRango(String msg, int min, int max) {
		int valor;
		do {
			System.out.println(msg);
			valor = Integer.parseInt(input.nextLine());
		} while (valor < min || valor > max);
		
		return valor;
	}
	
	public static String ingresarSoN(String msg) {
		String respuestaSN;
		do {
			System.out.println(msg);
			respuestaSN = input.nextLine().toUpperCase();
		} while (!respuestaSN.equals(SI) && !respuestaSN.equals(NO));
		
		return respuestaSN;
	}
	
	public static int determinarTopeCasa(int calle) {
		int casaTope;
		if (calle <= LIMITE_CALLES_FRENTE) {
			casaTope = TOPE_CASAS_CALLE_FRENTE;
		} else if (calle <= LIMITE_CALLES_MEDIO) {
			casaTope = TOPE_CASAS_CALLE_MEDIO;
		} else {
			casaTope = TOPE_CASAS_CALLE_FONDO;
		}
		
		return casaTope;
	}

	public static void main(String[] args) {
		Persona unaPersona = new Persona("Peter", "Flinstone");
		System.out.println("El nombre de la persona es " + unaPersona.obtenerNombreCompleto());
		unaPersona.ponerNombre("Hortencio");
        unaPersona.ponerApellido("Ortega");
        System.out.println("El nombre de la persona es " + unaPersona.obtenerNombreCompleto());
        
        Persona otraPersona = new Persona("Lucas", "Guegnolle");
        System.out.println("El nombre de la persona es " + otraPersona.obtenerNombreCompleto());
        
        Persona persona = new Persona();
        System.out.println("El nombre de la persona es " + persona.obtenerNombreCompleto());
        
        System.out.println(unaPersona);
        
        System.exit(1);
		
		// variables para el ingreso de datos
		int calle;
		int casa;
		int casaTope;
		boolean tienePerros;
		boolean tienenGatos;
		int cantidadDeMascotas;
		int minimoValido;
		String respuestaSN;

		// variables para obtener lo que nos piden (inicializadas)
		int cantidadDeEncuestas = 0;
		int cantidadConMascotas = 0;
		int cantidadSoloDeUnTipo = 0;
		int nroCasaConMasMascotas = 0;
		int nroCalleCasaConMasMascotas = 0;
		int maximoDeMascotas = 0;

		// primer pedido de calle
		calle = ingresarEnteroConRango("Numero de calle? (" + PISO_CALLE + " a " + LIMITE_CALLES_FONDO + ")", 0, LIMITE_CALLES_FONDO);

		while (calle != 0) {

			// segun la calle se limita el numero de casa
			casaTope = determinarTopeCasa(calle);

			// pedir la casa
			casa = ingresarEnteroConRango("Nro de Casa? (1 a " + casaTope + ")", 1, casaTope);

			// pregunto por la cantidad de mascotas

			// perro
			respuestaSN = ingresarSoN("Tienen Perro? ('S'/'N')");
			tienePerros = respuestaSN.equals(SI);

			// gato
			respuestaSN = ingresarSoN("Tienen Gato? ('S'/'N')");
			tienenGatos = respuestaSN.equals(SI);

			// Cantidad de encuestas
			cantidadDeEncuestas++;

			// Para procesar los deptos con mascotas
			if (tienePerros || tienenGatos) {
				cantidadConMascotas++;

				// Cuantos hay con solo un tipo de mascota
				if ((!tienenGatos || !tienePerros)) {
					cantidadSoloDeUnTipo++;
					minimoValido = 1;
				} else {
					minimoValido = 2;
				}

				// pedir la cantidad de mascotas
				cantidadDeMascotas = ingresarEnteroConRango("cantidad de mascotas? (minimo " + minimoValido + ")", minimoValido, Integer.MAX_VALUE);

				if (cantidadDeMascotas > maximoDeMascotas) {
					nroCasaConMasMascotas = casa;
					nroCalleCasaConMasMascotas = calle;
					maximoDeMascotas = cantidadDeMascotas;
				}
			}

			// actualizacion de la calle
			calle = ingresarEnteroConRango("Numero de calle? (" + PISO_CALLE + " a " + LIMITE_CALLES_FONDO + ")", 0, LIMITE_CALLES_FONDO);
		}

		// Salidas finales
		if (cantidadDeEncuestas == 0) {
			System.out.println("No se procesaron datos");
		} else {
			// Cantidad de encuestas
			System.out.println("Encuestas realizadas: " + cantidadDeEncuestas);
			System.out.println("Con mascotas: " + cantidadConMascotas);
			// Porcentaje de casas con mascota/s (sobre las encuestadas)
			System.out.println("Porcentaje de casas con mascotas (sobre las encuestadas): "
					+ (cantidadConMascotas * 100 / cantidadDeEncuestas) + "%");
			// Cantidad con solo un tipo de mascota
			System.out.println("Cantidad de casas con un solo tipo de mascota: " + cantidadSoloDeUnTipo);
			// Calle, casa y cantidad con mas mascotas
			if (nroCasaConMasMascotas > 0) {
				System.out.println("La mayor cantidad de mascotas (" + maximoDeMascotas + ") vive en la calle "
						+ nroCalleCasaConMasMascotas + " casa " + nroCasaConMasMascotas);
			}
		}
		// cierro el input
		input.close();
	}

}