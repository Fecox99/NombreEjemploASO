package clase_01;

import java.util.Scanner;

public class Example
{
	public static final double COCIENTE = 3.14159265359;
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Ingresa un numero entero:");
		int operand_1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingresa otro numero entero:");
		int operand_2 = Integer.parseInt(input.nextLine());
		double result = operand_1 + operand_2;
		
		System.out.println("El resultado de la suma es: " + result);
		
		operand_1 = 15;
		operand_2 = 25;
		result = operand_1 + operand_2;
		
		System.out.println("El resultado de la suma es: " + result);
		
		result++; // result = result + 1;
		
		System.out.println("El resultado de la suma es: " + result);
		
		result = result * COCIENTE;
		
		System.out.println("El resultado de la suma es: " + result);
		
		System.out.println("Los operandos son diferentes : " + (operand_1 != operand_2));
		
		System.out.println("Por favor, ingresa tu nombre:");
		String name = input.nextLine();
		System.out.println("Hola " + name);
		System.out.println("Las cadenas '" + name + "' y 'Chau' son diferentes: " + !name.equals("Chau"));
		System.out.println("Las cadenas '" + name + "' y 'Mundo' son iguales (Usando operadores aritmeticos): " + (name == "Mundo"));
		
		char letra = 'L';
		System.out.println("La inicial es: " + letra);
		
		input.close();
	}
}
