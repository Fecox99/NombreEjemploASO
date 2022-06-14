package arraylist.ej1;

import java.util.Scanner;

/*	Nos piden obtener la lista de empleados de una Empresa. De ella se conoce
 	su nombre y su cantidad de empleados. 
 	Los datos de los empleados se pediran por teclado hasta que se ingrese "F"
 	como DNI.
	De cada empleado tenemos su dni, su nombre, su sueldo y su antiguedad.
	
	Para cada empleado nuevo que se agregue se debe verificar que el mismo
	no haya sido ingresado previamente y si no es asi actualizar la cantidad de
	empleados de la empresa. 
	
	Para borrar un empleado se debe verificar que exista y
	en caso afirmativo eliminarlo de la lista y actualizar la cantidad de empleados
	de la empresa.
	
	En resumen, en este ejercicio se deben guardar datos de los empleados en una lista y
	luego imprimir la misma. Se necesitarán métodos para agregar y quitar de la lista, y
	también un método para buscar un empleado en la misma.
	*/

public class Test {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Empresa miEmpresa = new Empresa("Mio S.A");
		String nombreIngresado;
		double sueldoIngresado;
		double antiguedadIngresada;
		String dniIngresado;
		boolean pudoAgregar = false;

		dniIngresado = pedirTextoNoVacio("Ingrese el dni (F para fin)").toUpperCase();

		while (!dniIngresado.equals("F")) {
			nombreIngresado = pedirTextoNoVacio("Ingrese el nombre del empleado");
			sueldoIngresado = pedirNroMayorACero("Ingrese el sueldo del empleado");
			antiguedadIngresada = pedirNroMayorACero("Ingrese la antiguedad del empleado");

			pudoAgregar = miEmpresa.agregarEmpleado(nombreIngresado, sueldoIngresado, antiguedadIngresada, dniIngresado);

			if (pudoAgregar == true) {
				System.out.println("Empleado agregado con éxito!");
			} else {
				System.out.println("No se pudo agregar el empleado porque ya existía");
			}

			dniIngresado = pedirTextoNoVacio("Ingrese el dni (F para fin)").toUpperCase();
		}

		miEmpresa.listarEmpleados();

		System.out.println("fin");

		input.close();
	}

	private static String pedirTextoNoVacio(String msj) {
		String dato;

		do {
			System.out.println(msj);
			dato = input.nextLine();
		} while (dato.isEmpty());

		return dato;
	}

	private static double pedirNroMayorACero(String msj) {
		double nro;

		do {
			System.out.println(msj);
			nro = input.nextDouble();
			input.nextLine();
		} while (nro <= 0);

		return nro;
	}
}
