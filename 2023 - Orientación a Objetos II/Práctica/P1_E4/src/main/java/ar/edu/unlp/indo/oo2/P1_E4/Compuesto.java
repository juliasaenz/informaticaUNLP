package ar.edu.unlp.indo.oo2.P1_E4;

import java.util.ArrayList;

public class Compuesto extends Topografia{
	
	private ArrayList<Topografia> componentes = new ArrayList<Topografia>();

	public Compuesto() {
		
	}
	
	public double calcularProporcionAgua() {
		return this.componentes.stream()
				 .mapToDouble(topografia -> topografia.calcularProporcionAgua())
				 .sum() / this.componentes.size();
	}
	
	public double calcularProporcionTierra() {
		return this.componentes.stream()
				 .mapToDouble(topografia -> topografia.calcularProporcionTierra())
				 .sum() / this.componentes.size();
	}
	
	public ArrayList<Topografia> getComponentes(){
		/* Devuelve la lista de hijitos */
		return this.componentes;
	}
	
	public boolean compararIgualdad(Topografia t) {
		/* Compara la lista de hijitos de las dos listas */
		return super.compararIgualdad(t) && this.componentes.equals(t.getComponentes());
	}
	
	public void agregarComponente(Topografia t) {
		componentes.add(t);
	}
	
	public void sacarComponente(Topografia t) {
		componentes.remove(t);
	}

}
