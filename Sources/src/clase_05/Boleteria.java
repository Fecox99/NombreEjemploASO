package clase_05;

import java.util.Scanner;

public class Boleteria {
	
	public static Scanner input = new Scanner(System.in);
	public static final String USER = "admin";
	public static final String PSW = "boletos";
	public static final int ENTRADA_MENORES = 300;
	public static final int ENTRADA_MAYORES = 500;
	public static final char FIN = 'n';
	public static final char SIGA = 's';

	public static void main(String[] args) {
		String usr, psw, nom = null, peli_max_bol = null, peli_max_din = null;
		char rta;
		int men = 0, may = 0, total_men = 0, total_may = 0, boletos_pelicula = 0;
		int dinero_pelicula = 0, peli_max_boletos = 0, peli_max_dinero = 0;
		
		do {
			System.out.println("Ingrese el Usuario");
			usr = input.nextLine();
			System.out.println("Ingrese Password");
			psw = input.nextLine();
			if (!usr.equalsIgnoreCase(USER) || !psw.equalsIgnoreCase(PSW)) {
				System.out.println("ERROR! Credenciales invalidas!");
			}
		} while (!usr.equalsIgnoreCase(USER) || !psw.equalsIgnoreCase(PSW));
		
		do {
			do {
				System.out.println("Ingrese el nombre de la pelicula:");
				nom = input.nextLine();
			} while (nom.length() == 0);
			
			do {
				System.out.println("Ingese la cantidad de menores que asistiran:");
				men = Integer.parseInt(input.nextLine());
			} while (men < 0);
			
			do {
				System.out.println("Ingrese la cantidad de mayores que asistiran:");
				may = Integer.parseInt(input.nextLine());
			} while (may < 0);
			
			total_men = total_men + men; // Long way
			total_may += may;	// Shortcut from above
			
			boletos_pelicula = men + may;
			if (peli_max_boletos < boletos_pelicula) {
				peli_max_boletos = boletos_pelicula;
				peli_max_bol = nom;
			}
			
			dinero_pelicula = (men * ENTRADA_MENORES) + (may * ENTRADA_MAYORES);
			if (peli_max_dinero < dinero_pelicula) {
				peli_max_dinero = dinero_pelicula;
				peli_max_din = nom;
			}
			
			do {
				System.out.println("Desea cargar otra pelicula? ['s' o 'n']:");
				rta = input.nextLine().toLowerCase().charAt(0);
				if (rta != FIN && rta != SIGA) {
					System.out.println("ERROR!");
				}
			} while (rta != FIN && rta != SIGA);
		} while (rta == SIGA);
		
		System.out.println("La pelicula con mayor cantidad de boletos vendidos es: " + peli_max_bol);
		System.out.println("La pelicula que tiene mayor cantidad de pesos recaudados es: " + peli_max_din + " con: $" + peli_max_dinero);
		System.out.println("Cantidad TOTAL de entradas de adultos vendidas es: " + total_may);
		System.out.println("Cantidad TOTAL de entradas de menores vendidas es: " + total_men);
		
		input.close();
	}
}
