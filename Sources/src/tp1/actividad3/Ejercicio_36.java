package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_36 {
	
	public static Scanner input = new Scanner(System.in);
	public static final int CORTE = 20;

	public static void main(String[] args) {
		int num, prom, acu = 0, cont = 0;
		
		do {
			System.out.println("Ingrese un numero");
			num = Integer.parseInt(input.nextLine());
			cont++; // cont = cont + 1
			acu += num; // acu = acu + num
			prom = acu / cont;
		} while (prom < CORTE);
		
		System.out.println("Se leyeron " + cont + " numeros.");
		
		input.close();
	}
}
