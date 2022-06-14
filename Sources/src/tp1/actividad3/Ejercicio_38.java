package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_38 {
	
	public static Scanner input = new Scanner(System.in);
	public static final String USER = "admin";
	public static final String PSW = "123456";	

	public static void main(String[] args) {
		int tries;
		String usr, psw;

		tries = 0;
		
		do {
			System.out.println("Ingrese el Usuario");
			usr = input.nextLine();
			System.out.println("Ingrese Password");
			psw = input.nextLine();
			if (!usr.equalsIgnoreCase(USER) || !psw.equalsIgnoreCase(PSW)) {
				System.out.println("ERROR! Credenciales invalidas!");
				tries++;
			}
		} while (tries < 3 && (!usr.equalsIgnoreCase(USER) || !psw.equalsIgnoreCase(PSW)));
		
		if (usr.equals(USER) && psw.equals(PSW)) {
			System.out.println("Acceso concedido");
		} else {
			System.out.println("Se ha bloqueado la cuenta");
		}
		
		input.close();
	}
}
