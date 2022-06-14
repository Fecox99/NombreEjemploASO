package clase_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Basics
{
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int numero;
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Ingrese el numero entero " + i);
			numero = Integer.parseInt(input.nextLine());
			numeros.add(numero);
		}
		
		System.out.println(numeros);
		
		numeros.add(1, 120);
		
		System.out.println(numeros);
		
		int replaced = numeros.set(2, 100);
		System.out.println("Reemplazando el " + replaced);
		
		System.out.println(numeros);
		
		int deleted = numeros.remove(2);
		System.out.println("Quitando el " + deleted);
		
		System.out.println("Quitando el numero dos: " + numeros.remove(Integer.valueOf(2)));
		
		for(Integer num: numeros) {
			System.out.println(num);
		}
		
		for(int j = 0; j < numeros.size(); j++) {
			System.out.println(numeros.get(j));
		}
		
		input.close();
	}
}
