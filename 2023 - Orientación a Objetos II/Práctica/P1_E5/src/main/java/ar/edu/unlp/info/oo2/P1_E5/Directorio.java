package ar.edu.unlp.info.oo2.P1_E5;

import java.util.ArrayList;
import java.util.Comparator;
import java.time.LocalDate;

public class Directorio extends Elemento{
	
	ArrayList<Elemento> elementos = new ArrayList<Elemento>();

	public Directorio(String nom, LocalDate fech) {
		super(nom,fech);
	}
	
	public int tamanioTotalOcupado() {
		return elementos.stream()
				.mapToInt(elem -> elem.tamanioTotalOcupado())
				.sum();
	}
	
	public Archivo archivoMasGrande() {

		Archivo a =  elementos.stream()
					.map( el -> el.archivoMasGrande() )
					.max( (el1, el2) -> Integer.compare(
								el1.tamanioTotalOcupado(), 
								el2.tamanioTotalOcupado()) )
					.orElse(null);
	
		return a;
	}

	public Archivo archivoMasNuevo() {
		Archivo a = elementos.stream()
				.map( el -> el.archivoMasNuevo() )
			    .max( Comparator.comparing(Elemento::getFecha) )
			    .orElse(null);

	return a;
	}
	
	public void agregar(Elemento el) {
		this.elementos.add(el);
	}
	
	public void eliminar(Elemento el) {
		this.elementos.remove(el);
	}
}
