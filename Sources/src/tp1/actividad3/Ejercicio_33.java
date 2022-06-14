package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_33 {
	
	public static Scanner input = new Scanner(System.in);
	public static final int FIN_DE_DATOS = 0;

	public static void main(String[] args) {
		int num, max, min;
		
		System.out.println("Ingrese un numero:");
		num = Integer.parseInt(input.nextLine());
		
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		
		while (num != FIN_DE_DATOS) {
			if (num > max) {
				max = num;
			} else if (num < min) {
				min = num;
			}
			System.out.println("Ingrese un numero:");
			num = Integer.parseInt(input.nextLine());			
		}
		
		System.out.println("El maximo ingresado es: " + max + " y el minimo ingresado es: " + min);
		input.close();
	}
}
