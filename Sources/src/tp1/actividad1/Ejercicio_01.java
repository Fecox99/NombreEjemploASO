package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio_01 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String name;
		
		System.out.println("Ingrese su nombre:");
		name = input.nextLine();
		
		System.out.println("Hola " + name + "! Bienvenido a mi primer programa");
		
		input.close();
	}

}
