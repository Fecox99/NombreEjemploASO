package tp1.actividad2;

import java.util.Scanner;

public class Ejercicio_12 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n1;
		int n2;
		
		System.out.println("Ingrese un numero entero:");
		n1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese otro numero entero:");
		n2 = Integer.parseInt(input.nextLine());
		
		if (n1 > n2) {
			System.out.println("El mayor es: " + n1);
		} else if (n2 > n1) {
			System.out.println("El mayor es: " + n2);
		} else {
			System.out.println("Los numeros son iguales");
		}

		input.close();
	}
}
