package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_32 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int nota; 
		do {
			System.out.println("Ingrese una nota [2, o de 4 a 10]");
			nota = Integer.parseInt(input.nextLine());
			if (nota < 2 || nota == 3 || nota > 10) {
				System.out.println("Error!");
			}
		} while (nota < 2 || nota == 3 || nota > 10);
		
		System.out.println("*** NOTA REGISTRADA CORRECTAMENTE ***\nLa nota es: " + nota);
		
		input.close();

	}

}
