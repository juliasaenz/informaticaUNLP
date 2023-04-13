package ar.edu.unlp.info.oo2.P1_E6;

public abstract class Empleado {
	
	private String nombre;
	private boolean casado;
	private int cantHijos;
	
	public Empleado(String nom, boolean casado, int cantH) {
		this.nombre = nom;
		this.casado = casado;
		this.cantHijos = cantH;
		
	}
	
	public abstract double sueldoBasico();
	
	public abstract double sueldoAdicional();
	
	public double descuento() {
		return  this.sueldoBasico()*.13 +  this.sueldoAdicional()*.05 ;
	};
	
	public double sueldo() {
		return this.sueldoBasico() + this.sueldoAdicional() - this.descuento();
	}
	
	/* */ 
	public boolean getCasado() {
		return this.casado;
	}
	public int getCantHijos() {
		return this.cantHijos;
	}

}
