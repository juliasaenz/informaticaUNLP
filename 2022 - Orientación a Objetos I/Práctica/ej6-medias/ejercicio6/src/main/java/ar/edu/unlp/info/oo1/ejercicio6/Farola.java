package ar.edu.unlp.info.oo1.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	List<Farola> vecinos;
	boolean encendida;
	
	
	public Farola() {
		encendida = false;
		vecinos = new ArrayList<Farola>();
	}
	
	public boolean isOn() {
		return encendida;
	}
	
	public void pairWithNeighbor( Farola otraFarola ) {
		/* Relación bilateral entre farolas */
		if(!vecinos.contains(otraFarola)) {
			vecinos.add(otraFarola);
		}
		otraFarola.pairWithNeighbor(this);
	}
	
	public List<Farola> getNeighbors (){
		/* retorna la lista de vecinos */
		return vecinos;
	}
	
	public void turnOn(){
		/* si la farola no está encendida, se enciende y propaga la acción */
		if(!encendida) {
			encendida = true;
		}
		
		//recorrer vecinos
		for (Farola f : vecinos) {
			f.turnOn();
		}
	}
	
	public void turnOff() {
		/* Si la farola no está apagada, se apaga y propaga la acción */
		if(encendida) {
			encendida = false;
		}
		for (Farola f : vecinos) {
			f.turnOff();
		}
		
		
		//recorrer vecinos
	}

	
	

	// fin de clase

}
