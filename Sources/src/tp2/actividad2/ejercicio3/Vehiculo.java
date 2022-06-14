package tp2.actividad2.ejercicio3;

public class Vehiculo {
	private Marca marca;
	private String color;
	private String modelo;
	private int velocidadMaxima;
	
	public Vehiculo() {
		this.velocidadMaxima = 130;
	}
	
	public Vehiculo(Marca marca, String color, String modelo, int v) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.velocidadMaxima = v;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + this.marca + ", color=" + this.color + ", modelo=" + this.modelo + ", velocidadMaxima="
				+ this.velocidadMaxima + "]";
	}
}
