package tp3.ejercicio04;

import java.util.ArrayList;

public class Perchero {
	private static final int TOPE_COLLARES = 3;
	private ArrayList <Collar> collares;
	
	public Perchero() {
		this.collares = new ArrayList<Collar>();
	}
	
	public Collar quitarCollar(String nombre) {
		Collar collar = this.buscar(nombre);
		if (collar != null) {
			this.collares.remove(collar);
		}
		
		return collar;
	}
	
	public boolean colgarCollar(Collar collar) {
		boolean res = false;
		if (collar != null && this.collares.size() < TOPE_COLLARES) {
			this.collares.add(collar);
			res = true;
		}
		
		return res;
	}
	
	private Collar buscar(String nombre) {
		Collar elmBuscado = null;
		int pos = 0;
		
		while (pos < this.collares.size() && elmBuscado == null) {
			if (this.collares.get(pos).getChapita().equalsIgnoreCase(nombre)) {
				elmBuscado = this.collares.get(pos);
			}
			pos++;
		}
		
		return elmBuscado;
	}
}
