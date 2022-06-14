package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_27 {
	
	public static Scanner input = new Scanner(System.in);
	public static final int TOPE = 5;

	public static void main(String[] args) {
		double edad = 0;
		double prom = 0;
		double acum = 0;
		double cont = 0;
		
		for (int i = 0; i < TOPE; i++) {
			System.out.println("Ingrese la edad " + (i+1));
			edad = Double.parseDouble(input.nextLine());
			acum = acum + edad;
			
			if (edad % 2 != 0 && edad > 18) {
				cont++;
			}
		}
		
		prom = acum / TOPE;
		System.out.println("El promedio de las edades es: " + prom);
		System.out.println("La cantidad de edades impares y mayores a 18 es de: " + (int)cont);
		input.close();
	}
}
