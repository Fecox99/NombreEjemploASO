package arraylist.ej1;

public class Empleado {

	private String dni;
	private String nombre;
	private double sueldo;
	private double antiguedad;

	public Empleado(String suNombre, String suDni, double suSueldo, double suAntiguedad){
		this.setNombre(suNombre);
		this.setDni(suDni);
		this.setSueldo(suSueldo);
		this.setAntiguedad(suAntiguedad);
	}

	private void setAntiguedad(double suAntiguedad) {
		this.antiguedad = suAntiguedad;
	}

	private void setSueldo(double suSueldo) {
		this.sueldo = suSueldo;	
	}

	private void setDni(String suDni) {
		this.dni = suDni;	
	}

	private void setNombre(String suNombre) {
		this.nombre = suNombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getDni(){
		return this.dni;
	}
	
	public double getSueldo(){
		return this.sueldo;
	}
	
	public double getAntiguedad(){
		return this.antiguedad;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", sueldo=" + sueldo + ", antiguedad=" + antiguedad + "]";
	}	
}
