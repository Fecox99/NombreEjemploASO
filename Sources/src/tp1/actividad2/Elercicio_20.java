package tp1.actividad2;

import java.util.Scanner;

public class Elercicio_20 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;
		char op;
		
		System.out.println("Ingrese el primer valor:");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el segundo valor:");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la operacion a realizar [+, -, * o /]");
		op = input.next().charAt(0);
		
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
		default:
			System.out.println("Operacion invalida");
		}
		
		input.close();
	}

}
