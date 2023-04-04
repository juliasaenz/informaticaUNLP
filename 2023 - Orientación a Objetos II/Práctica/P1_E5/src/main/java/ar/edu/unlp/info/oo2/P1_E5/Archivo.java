package ar.edu.unlp.info.oo2.P1_E5;

import java.time.LocalDate;

public class Archivo extends Elemento {
	private int tamanio;
	
	public Archivo (String nom, LocalDate fech, int tam) {
		super(nom,fech);
		this.tamanio = tam;
	}
	
	public int tamanioTotalOcupado() {
		return this.tamanio;
	}
	
	public Archivo archivoMasGrande() {
		return this;
	}

	public Archivo archivoMasNuevo() {
		return this;
	}
}
