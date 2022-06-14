package clase_03;

import java.util.Scanner;

public class Ejemplo_01 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		
		int num1=10; 
		while (num1 > 0) {
			System.out.println(num1);
			num1--; // num1 = num1 - 1 || num1++ == num1 = num1 + 1
		}
		
		int edad; 
		do {
			System.out.println("Ingrese su edad");
			edad = Integer.parseInt(input.nextLine());
		} while (edad < 1 || edad > 105);
		System.out.println("Su edad es: " + edad);
		
		int num = 1;
		for(int i = 0; i < 10; i++) {
			System.out.println("num: " + num + ", i: " + i);
			num++;
		}
		
		input.close();
	}
}
