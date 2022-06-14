package tp3.ejercicio04;

public class Perro {
	private String nombre;
	private Duenio duenio;
	private Collar collar;
	
	public Perro(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void ponteCollar(Collar collar) {
		if (this.collar == null) {
			this.collar = collar;
			this.moverCola();
		} else {
			this.noEstaFeli();
		}
	}
	
	public Collar quitateCollar() {
		Collar collar = null;
		if (this.collar != null) {
			collar = this.collar;
			this.collar = null;
		}
		return collar;
	}
	
	private void moverCola() {
		System.out.println(this.nombre + " mueve la cola");
	}
	
	private void noEstaFeli() {
		System.out.println(this.nombre + " no esta feliz");
	}
	
	public boolean pedirSalirAPasear() {
		boolean salgoAPasear = false;
		if (this.duenio.estaPaseando()) {
			salgoAPasear = this.duenio.salirDePaseo(this);
		}
		return salgoAPasear;
	}
}
