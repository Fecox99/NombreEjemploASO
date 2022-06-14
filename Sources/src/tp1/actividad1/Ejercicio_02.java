package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio_02 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double nota_1;
		double nota_2;
		double nota_3;
		double prom;
		
		System.out.println("Ingrese la primer nota:");
		nota_1 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese la segunda nota:");
		nota_2 = Double.parseDouble(input.nextLine());		

		System.out.println("Ingrese la tercer nota:");
		nota_3 = Double.parseDouble(input.nextLine());
		
		prom = (nota_1 + nota_2 + nota_3) / 3;
		
		System.out.println("El promedio de las tres notas es: " + prom);
		
		input.close();
	}
}
