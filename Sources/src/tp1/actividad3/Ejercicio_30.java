package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_30 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;
		char op;
		
		// Loop initialization
		do {
			System.out.println("Ingrese un caracter para la operacion ('+', '-', '*', '/', 'F' para salir)");
			op = input.nextLine().toUpperCase().charAt(0);
			if (op != '+' && op != '-' && op != '*' && op != '/' && op != 'F') {
				System.out.println("Error!");
			}
		} while (op != '+' && op != '-' && op != '*' && op != '/' && op != 'F');
		
		// Loop condition
		while (op != 'F') {
			System.out.println("Ingrese el primer valor:");
			num1 = Integer.parseInt(input.nextLine());
			
			System.out.println("Ingrese el segundo valor:");
			num2 = Integer.parseInt(input.nextLine());
			
			switch (op) {
			case '+':
				System.out.println("La suma de ambos numeros es: " + (num1 + num2));
				break;
			case '-':
				System.out.println("La resta de ambos numeros es: " + (num1 - num2));
				break;
			case '*':
				System.out.println("El producto de ambos numeros es: " + (num1 * num2));
				break;
			case '/':
				if (num2 == 0) {
					System.out.println("ERROR! No se puede dividir por cero");
				} else {
					System.out.println("La division de ambos numeros es: " + ((double)num1 / (double)num2));
				}
				break;
			}
			// Loop recycling
			do {
				System.out.println("Ingrese un caracter para la operacion ('+', '-', '*', '/', 'F' para salir)");
				op = input.nextLine().toUpperCase().charAt(0);
				if (op != '+' && op != '-' && op != '*' && op != '/' && op != 'F') {
					System.out.println("Error!");
				}				
			} while (op != '+' && op != '-' && op != '*' && op != '/' && op != 'F');			
		}		
		System.out.println("Muchas gracias por utilizar la calculadora de ORT");
		input.close();
	}

}
