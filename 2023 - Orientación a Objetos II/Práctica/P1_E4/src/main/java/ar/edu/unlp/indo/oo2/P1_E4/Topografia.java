package ar.edu.unlp.indo.oo2.P1_E4;

import java.util.ArrayList;

public abstract class Topografia {
	
	public abstract double calcularProporcionAgua();
	
	public abstract double calcularProporcionTierra();
	
	public boolean compararIgualdad(Topografia t) {
		/* Si tienen la misma cantidad de agua son iguales */
		return this.calcularProporcionAgua() == t.calcularProporcionAgua();		
	}
	
	public ArrayList<Topografia> getComponentes(){
		return null;
	};

}
