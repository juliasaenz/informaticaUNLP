package ar.edu.unlp.info.oo2.P1_E5;

import java.time.LocalDate;

public abstract class Elemento {
	
	private String nombre;
	private LocalDate fecha;
	
	public Elemento(String nombr, LocalDate fech) {
		this.nombre = nombr;
		this.fecha = fech;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public abstract int tamanioTotalOcupado();
	
	public abstract Archivo archivoMasGrande();
	
	public abstract Archivo archivoMasNuevo();

}
