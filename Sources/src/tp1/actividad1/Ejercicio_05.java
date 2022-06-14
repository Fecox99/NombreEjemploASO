package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio_05 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;
		int aux;
		
		System.out.println("Ingrese el primer valor:");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el segundo valor:");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("El valor de num1 es: " + num1 + "\nEl valor de num2 es: " + num2);
		
		aux = num1;
		num1 = num2;
		num2 = aux;
		
		System.out.println("El valor de num1 es: " + num1 + "\nEl valor de num2 es: " + num2);
		
		input.close();
	}
}
