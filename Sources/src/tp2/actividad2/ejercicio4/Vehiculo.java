package tp2.actividad2.ejercicio4;

public class Vehiculo {
	private Marca marca;
	private String color;
	private String modelo;
	private int velocidadMaxima;
	private boolean encendido;
	private int velocidad;
	private double gradosGiro;
	
	public Vehiculo() {
		this.velocidadMaxima = 130;
	}
	
	public Vehiculo(Marca marca, String color, String modelo, int v) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.velocidadMaxima = v;
		this.encendido = false;
	}
	
	public void acelerar(int kmh) {
		if (kmh > 0) {
			if (this.velocidad + kmh < this.velocidadMaxima) {
				this.velocidad += kmh;
			} else {
				this.velocidad = this.velocidadMaxima;
			}
			
			System.out.println("El vehiculo esta acelarando y va a " + this.velocidad);
		}
	}
	
	public void frenar(int kmh) {
		if (kmh > 0) {
			if (this.velocidad - kmh > 0) {
				this.velocidad -= kmh;
			} else {
				this.velocidad = 0;
			}
			System.out.println("El vehiculo esta frenando a va a " + this.velocidad);
		}
	}
	
	public void girar(char lado, double grados) {
		if (grados < 0) {
			grados = 0;
		} else if (grados > 90) {
			grados = 90;
		}
		
		if (lado == 'I') {
			this.gradosGiro -= grados;
		} else {
			this.gradosGiro += grados;
		}
		this.gradosGiro = this.gradosGiro % 360;
		System.out.println("El vehiculo ha girado. El angulo de giro es de " + this.gradosGiro);
	}
	
	public void avanzar() {
		System.out.println("El vehiculo avanza");
	}
	
	public void encender() {
		this.encendido = true;
		System.out.println("El vehiculo esta en marcha");
	}
	
	public void apagar() {
		this.encendido = false;
		System.out.println("El vehiculo se ha apagado");
	}
	
	public boolean isEncendido() {
		return this.encendido;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + this.marca + ", color=" + this.color + ", modelo=" + this.modelo + ", velocidadMaxima="
				+ this.velocidadMaxima + "]";
	}
}
