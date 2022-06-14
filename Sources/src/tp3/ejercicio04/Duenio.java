package tp3.ejercicio04;

import java.util.ArrayList;

public class Duenio {
	private String nombre;
	private ArrayList<Perro> perros;
	private boolean paseando;
	private Perchero perchero;
	
	public Duenio(String nombre) {
		this.setNombre(nombre);
		this.perros = new ArrayList<Perro>();
		this.perchero = new Perchero();
		this.paseando = false;
	}
	
	public boolean ponerCollarEnPerchero(Collar collar) {
		return this.perchero.colgarCollar(collar);
	}
	
	public void adoptar(Perro perro) {
		this.perros.add(perro);
	}
	
	public boolean salirDePaseo(String nombrePerro) {
		boolean res = false;
		Perro p = this.buscar(nombrePerro);
		if (p != null) {
			res = this.salirDePaseo(p);
		}
		return res;
	}	
	
	public boolean salirDePaseo(Perro perro) {
		boolean res = false;
		if (perro != null && !this.paseando) {
			Collar collar = this.perchero.quitarCollar(perro.getNombre());
			if (collar != null) {
				perro.ponteCollar(collar);
				this.paseando = true;
				res = this.paseando;
			}
		}
		return res;
	}
	
	public boolean regresarPaseo(String nombre) {
		boolean res = false;
		if (this.paseando) {
			Perro perro = this.buscar(nombre);
			if (perro != null) {
				Collar collar = perro.quitateCollar();
				boolean pudo = this.perchero.colgarCollar(collar);
				if (pudo) {
					this.paseando = false;
					res = true;
				}
			}
		}
		return res;
	}
	
	private Perro buscar(String nombre) {
		Perro elmBuscado = null;
		int pos = 0;
		
		while (pos < this.perros.size() && elmBuscado == null) {
			if (this.perros.get(pos).getNombre().equalsIgnoreCase(nombre)) {
				elmBuscado = this.perros.get(pos);
			}
			pos++;
		}
		
		return elmBuscado;
	}	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean estaPaseando() {
		return this.paseando;
	}
}
