package arraylist.ej1;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private int cantEmpleados;
	private ArrayList<Empleado> listaDeEmpleados;
	
	public Empresa(String elNombre){
		this.setNombre(elNombre);
		this.cantEmpleados = 0;
		this.listaDeEmpleados = new ArrayList<Empleado>();
	}

	private void setNombre(String elNombre) {
		this.nombre = elNombre;
	}
	
	private void setCantEmpleados(int cantEmpleados){
		this.cantEmpleados = cantEmpleados;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getCantEmpleados(){
		return this.cantEmpleados;
	}
	
	public boolean agregarEmpleado(String nombreEmp, double sueldoEmp, double antigEmp, String dniEmp) {
		boolean pude = false;
		
		Empleado emp = this.buscarEmpleado(dniEmp);

		if (emp == null) {
			emp = new Empleado(nombreEmp, dniEmp, sueldoEmp, antigEmp);
			this.listaDeEmpleados.add(emp);
			this.setCantEmpleados(this.getCantEmpleados() + 1);
			pude = true;
		}
		
		return pude;
	}
	
	public boolean quitarEmpleado(String dniEmp) {
		boolean pudo = false;
		Empleado empleadoBorrar = null;
		
		empleadoBorrar = this.buscarEmpleado(dniEmp);
		
		if (empleadoBorrar != null){
			this.listaDeEmpleados.remove(empleadoBorrar);
			this.setCantEmpleados(this.getCantEmpleados() - 1);
			pudo = true;
		}
		
		return pudo;
	}
	
	public Empleado buscarEmpleado(String dniBuscar) {
		Empleado empleadoEncontrado = null;
		int i = 0;
		
		while(i < this.listaDeEmpleados.size() && empleadoEncontrado == null) {
			if (this.listaDeEmpleados.get(i).getDni().equals(dniBuscar)) {
				empleadoEncontrado = this.listaDeEmpleados.get(i);
			} else {
				i++;
			}
		}
		return empleadoEncontrado;
	} 
	
	public void listarEmpleados() {
		System.out.println("Listado de empleados");
		for(int i = 0; i < listaDeEmpleados.size(); i++) {
			System.out.println(this.listaDeEmpleados.get(i).toString());
		}
	}
}
