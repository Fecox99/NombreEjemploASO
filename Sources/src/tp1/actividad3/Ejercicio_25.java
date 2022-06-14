package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_25 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int alto, ancho;
		
		System.out.println("Ingrese el ancho de la matrix");
		ancho = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el alto de la matrix");
		alto = Integer.parseInt(input.nextLine());
		
		for (int i = 1; i <= alto; i++) {
			for (int j = 1; j <= ancho; j++) {
				if (j%2 == 0) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}
			}
			System.out.println();
		}
		
		input.close();
	}
}
